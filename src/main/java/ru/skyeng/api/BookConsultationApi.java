package ru.skyeng.api;

import io.restassured.response.ValidatableResponse;
import ru.skyeng.domain.User;

import static io.restassured.RestAssured.given;

public class BookConsultationApi {

    public static ValidatableResponse getUserRecordData(String name, String phone, String email) {
        ValidatableResponse response = given()
                .contentType("application/x-www-form-urlencoded")
                .formParam("name", name)
                .formParam("phone", phone)
                .formParam("email", email)
        .when()
                .post("https://skygate.skyeng.ru/api/v1/proxy-adult/create")
        .then();
        return response;
    }

    public static ValidatableResponse getUserRecordData(User user) {
        ValidatableResponse response = given()
                .contentType("application/x-www-form-urlencoded")
                .formParam("name", user.getName())
                .formParam("phone", user.getPhoneNumber())
                .formParam("email", user.getEmail())
                .when()
                .post("https://skygate.skyeng.ru/api/v1/proxy-adult/create")
                .then();
        return response;
    }
}
