package ru.skyeng.api;

import io.restassured.response.ValidatableResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.skyeng.domain.User;
import ru.skyeng.util.GenerationDataUtil;

import static org.hamcrest.Matchers.equalTo;

public class BookConsultationApiTest {

    private static final Logger logger = LogManager.getLogger();

    @Test
    @DisplayName("Запись на консультацию зарегистрированного пользователя")
    public void testRegisteredUserRecord() {
        logger.info("Стартовал тест - Запись на консультацию зарегистрированного пользователя");

        ValidatableResponse response = BookConsultationApi.getUserRecordData(Point.TEST_NAME, Point.REAL_PHONE, Point.TEST_EMAIL);

        response.statusCode(200);
        response.body("message", equalTo("OK"));
        response.body("userLogIn", equalTo(false));
        response.body("userLogIn", equalTo(false));
        response.body("userId", equalTo(18616265));
        response.body("loginLink", equalTo(false));
        response.body("educationServiceId", equalTo(15876089));
        response.body("wasBump", equalTo(true));

        logger.info("Закончен тест - Запись на консультацию зарегистрированного пользователя");
    }

    @Test
    @DisplayName("Запись на консультацию нового пользователя")
    public void testRegisteredNewUserRecord() {
        User user = new User();
        ValidatableResponse response = BookConsultationApi.getUserRecordData(user);
        response.statusCode(200).log().body();
        response.body("message", equalTo("OK"));
        response.body("userLogIn", equalTo(true));
    }

    @Test
    @DisplayName("Запись на консультацию только с именем")
    public void testRegisteredNewUserOnlyWithName() {
        User user = new User(Point.TEST_NAME);
        ValidatableResponse response = BookConsultationApi.getUserRecordData(user);
        response.statusCode(400).log().body();
        response.body("exception.message", equalTo(Point.INDICATE_EMAIL_OR_PHONE_MESSAGE));
    }

    @Test
    @DisplayName("Запись на консультацию только с номером и почтой")
    public void testRegisteredNewUserOnlyWithPhoneAndEmail() {
        User user = new User(GenerationDataUtil.generateRussiaMobilePhone(), GenerationDataUtil.generateEmail());
        ValidatableResponse response = BookConsultationApi.getUserRecordData(user);
        response.statusCode(400).log().body();
        response.body("exception.message", equalTo(Point.INDICATE_NAME_MESSAGE));
    }

    @Test
    @DisplayName("Запись на консультацию c пустыми полями")
    public void testRegisteredWithEmptyField() {
        User user = new User();
        ValidatableResponse response = BookConsultationApi.getUserRecordData(user);
        response.statusCode(200);
        response.body("loginLink", equalTo(false));
    }
}
