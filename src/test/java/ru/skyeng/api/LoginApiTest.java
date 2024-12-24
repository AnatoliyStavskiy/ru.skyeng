package ru.skyeng.api;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Epic;
import io.restassured.http.Cookies;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.skyeng.ui.driver.Driver;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$x;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class LoginApiTest {

    @BeforeEach
    void setUp() {
        UserLoginApiRequest.initRequestSpecification();
    }

    private static final Logger logger = LogManager.getLogger();

    @Epic("API")
    @Test
    @DisplayName("Авторизация с корректными данными")
    public void testAuthorizationWithValidData() {
        logger.info("Стартовал тест - Авторизация с корректными данными");

        Selenide.open(UserLoginApiRequest.ID_LOGIN_URL);
        $x(Point.CLICK_FORM_LOGIN_XPATH).click();
        String csrf = $x(Point.CSFR_TOKEN_XPATH).getValue();

        logger.info("Авторизация с корректными данными - получен csrfToken: " + csrf);

        var cookiesBrowser = WebDriverRunner.getWebDriver().manage().getCookies();
        Selenide.closeWebDriver();

        List<io.restassured.http.Cookie> restCookies = new ArrayList<>();

        for (org.openqa.selenium.Cookie cookie : cookiesBrowser) {
            io.restassured.http.Cookie temp = new io.restassured.http.Cookie
                    .Builder(cookie.getName(), cookie.getValue())
                    .setDomain(cookie.getDomain())
                    .setPath("/").build();
            restCookies.add(temp);
        }

        logger.info("Авторизация с корректными данными - полученs cookie: " + restCookies);

        given().cookies(new Cookies(restCookies))
                .formParam("csrfToken", csrf)
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
    public void testAuthorizationWithData() {
        logger.info("Стартовал тест с токеном без куки");

        var cookiesBrowser = Driver.getDriver().manage().getCookies();
        List<io.restassured.http.Cookie> restCookies = new ArrayList<>();

        for (org.openqa.selenium.Cookie cookie : cookiesBrowser) {
            io.restassured.http.Cookie cock = new io.restassured.http.Cookie
                    .Builder(cookie.getName(), cookie.getValue())
                    .setDomain(cookie.getDomain())
                    .setPath("/").build();
            restCookies.add(cock);
        }

        given().cookies(new Cookies(restCookies))
                .formParam("csrfToken", UserLoginApiRequest.findToken())
                .formParam("username", Point.VALIDATE_EMAIL)
                .formParam("password", Point.VALIDATE_PASSWORD);
        when().
                post(Point.LOGIN_SUBMIT)
                .then().
                log().all();
        logger.info("Завершён тест с токеном без куки");
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
