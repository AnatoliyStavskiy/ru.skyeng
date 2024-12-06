package ru.skyeng.api;

import io.restassured.response.ValidatableResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.skyeng.domain.User;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class LoginApiTest {

    @BeforeEach
    void setUp() {
        UserLoginApiRequest.initRequestSpecification();
    }

    @Test
    @DisplayName("Авторизация с неверным логином и паролем")
    public void testWithInvalidData() {
        given().
                body(UserLoginApiRequest.getBody("dasad@gmail.com", "12312asda12aa")).
                contentType(UserLoginApiRequest.contentType).
        when().
                post(UserLoginApiRequest.URL).
        then().
                statusCode(200);
    }

    @Test
    @DisplayName("Авторизация с верным логином и паролем")
    public void testAuthorizationWithInvalidData() {
        given()
                .spec(UserLoginApiRequest.requestSpecification)
        .when()
                .post()
        .then()
                .statusCode(200)
                .body("success", equalTo(false))
                .body("message", equalTo("Неверный CSRF-токен. Пожалуйста, перезагрузите страницу и попробуйте войти ещё раз."));
    }

    @Test
    @DisplayName("Запись на консультацию зарегистрированного пользователя")
    public void testRegisteredUserRecord() {
        ValidatableResponse response = BookConsultationApi.getUserRecordData("Alex", "+79454874459", "bixby5623@gmail.com");
                response.statusCode(200);
                response.body("message", equalTo("OK"));
                response.body("userLogIn", equalTo(false));
                response.body("userLogIn", equalTo(false));
                response.body("userId", equalTo(18616265));
                response.body("loginLink", equalTo(false));
                response.body("educationServiceId", equalTo(15876089));
                response.body("wasBump", equalTo(true));
    }

    @Test
    @DisplayName("Запись на консультацию нового пользователя")
    public void testRegisteredNewUserRecord() {
        User user = new User();
        ValidatableResponse response = BookConsultationApi.getUserRecordData(user);
        response.statusCode(200);
        response.body("message", equalTo("OK"));
        response.body("userLogIn", equalTo(true));
    }

    @Test
    @DisplayName("Запись на консультацию только с именем")
    public void testRegisteredNewUserOnlyWithName() {
        User user = new User("Vasiliy");
        ValidatableResponse response = BookConsultationApi.getUserRecordData(user);
        response.statusCode(400);
        response.body("exception.message", equalTo("Укажите email или телефон"));
    }

    @Test
    @DisplayName("Запись на консультацию только с номером и почтой")
    public void testRegisteredNewUserOnlyWithPhoneAndEmail() {
        User user = new User("+79349742564", "hahaga@gmail.com");
        ValidatableResponse response = BookConsultationApi.getUserRecordData(user);
        response.statusCode(400);
        response.body("exception.message", equalTo("Укажите своё имя"));
    }
}
