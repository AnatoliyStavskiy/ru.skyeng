package ru.skyeng.api;

import io.restassured.http.Cookies;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class LoginApiTest {

    @BeforeEach
    void setUp() {
        UserLoginApiRequest.initRequestSpecification();
    }

    private static final Logger logger = LogManager.getLogger();

    @Test
    @DisplayName("Авторизация с корректными данными")
    public void testAuthorizationWithValidData() {
        logger.info("Стартовал тест - Авторизация с корректными данными");

        given().cookies(new Cookies(CookieToken.requestCookieData(CookieToken.getCookie())))
                .formParam("csrfToken", CookieToken.selenaidSearchCsfr.getCsfrToken())
                .formParam("username", Point.VALIDATE_EMAIL)
                .formParam("password", Point.VALIDATE_PASSWORD)
                .post("https://id.skyeng.ru/frame/login-submit")
                .then().log().status()
                .log().body()
                .statusCode(200)
                .body("success", equalTo(true));

        logger.info("Завершен тест - Авторизация с корректными данными");
    }


    @Test
    @DisplayName("Авторизация с неверным токеном")
    public void testAuthorizationWithoudToken() {
        logger.info("Стартовал тест с cookie без csfrToken");


        given().cookies(new Cookies(CookieToken.requestCookieData(CookieToken.getCookie())))
                .formParam("username", Point.VALIDATE_EMAIL)
                .formParam("password", Point.VALIDATE_PASSWORD);
                post(Point.LOGIN_SUBMIT).
                then().
                log().all().
                body("message", equalTo(Point.CSFR_ERROR_MESSAGE));
        logger.info("Завершён тест с cookie без csfrToken");
    }

    @Test
    @DisplayName("Авторизация без актуального токена")
    public void testAuthorizationWithInvalidData() {
        given()
                .spec(UserLoginApiRequest.requestSpecification)
                .when()
                .post()
                .then()
                .log().all()
                .statusCode(200)
                .body("success", equalTo(false))
                .body("message", equalTo(Point.CSFR_ERROR_MESSAGE));
    }
}
