package ru.skyeng.api;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class UserLoginApiRequest {
    public static final String URL_FOR_TOKEN = "https://id.skyeng.ru/login?redirect=https%3A%2F%2Fskyeng.ru%2F";
    public static final String REQUEST_URL = "https://id.skyeng.ru";
    public static final String ID_LOGIN_URL = "https://id.skyeng.ru/login";
    public static final String contentType = "application/x-www-form-urlencoded; charset=UTF-8";
    public static RequestSpecification requestSpecification;

    public static void initRequestSpecification() {
        requestSpecification = new RequestSpecBuilder()
                .setBaseUri(REQUEST_URL)
                .setBasePath("/frame/login-submit")
                .setContentType(contentType)
                .setBody("&redirect=https%3A%2F%2Fskyeng.ru%2F&username=tests2025test@tutamail.com&password=2025test2025")
                .build();
    }

    public static String findToken() {
        RestAssured.baseURI = URL_FOR_TOKEN;

        Response csrfResponse = RestAssured.given()
                .when().get()
                .then().extract().response();

        Document document = Jsoup.parse(csrfResponse.body().asString());
        Elements csrfInput = document.select("input[name=csrfToken]");

        String csrfToken = csrfInput.attr("value");

        if (csrfToken == null || csrfToken.isEmpty()) {
            throw new RuntimeException("Не удалось получить CSRF-токен.");
        }

        return csrfToken;
    }
}
