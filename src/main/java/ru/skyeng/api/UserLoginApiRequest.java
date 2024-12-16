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
    public static final String ID_LIGIN_URL = "https://id.skyeng.ru/login";
    public static final String contentType = "application/x-www-form-urlencoded; charset=UTF-8";
    public static RequestSpecification requestSpecification;

    public static void initRequestSpecification() {
        requestSpecification = new RequestSpecBuilder()
                .setBaseUri(REQUEST_URL)
                .setBasePath("/frame/login-submit")
                .setContentType(contentType)
//                .addCookie("_ym_uid=173161403390447185; _ym_d=1731614033; _gcl_au=1.1.449435764.1731614035; _setz=Europe/Moscow; _seid=3b17a03440604fd3a4109e029d21328c; _tt_enable_cookie=1; _ttp=ah5Gw2uQh_Fn5n9SonByxS83bw6.tt.1; stDeIdU=87adf3f3-9b92-4e4c-9c7c-059a09b7747e; __ddg1_=NiVdQZfi05IEOnX0HPkT; mindboxDeviceUUID=bfe12e1d-fd5b-4533-85e9-c0caa1ed7309; directCrm-session=%7B%22deviceGuid%22%3A%22bfe12e1d-fd5b-4533-85e9-c0caa1ed7309%22%7D; __exponea_etc__=dc17aed2-8169-4084-98c5-553f1ef49f36; _ga_MCC1DDG4PF=GS1.2.1732710249.4.1.1732710256.53.0.0; _ga_M3K76MD156=GS1.2.1732710255.3.1.1732710258.0.0.0; _ga_TC305WZH8H=GS1.1.1732710248.3.1.1732710272.36.0.0; es_id=19022695; studcab_current_product={%22type%22:%22lead%22%2C%22identifier%22:%22english_adult_not_native_speaker%22}; session_c1_business_manager=e53i8pt633v8nu51jpr4r2n6h5; school_sales_cabinet_session_id=f7gk47ga9ea05k0nivi0dsgn82; _ga_2GMBEVNSP0=GS1.1.1733502654.4.0.1733502656.0.0.0; _ga=GA1.1.2040950228.1731614036; _seqp=utm_source=main&utm_medium=courses&from=main_new_menu; _seqp_time=1733511139; AB-test-cookie=03be48df-06e2-4489-bf74-7fe1c1efe6fa%3D1; skyeng_mData=8xgs2k1yquqqeofhztckFzMzB4iAOGcA; advcake_track_id=8e00c2b3-7065-1b47-24e3-2443172557e6; advcake_session_id=b4949604-f962-7bc4-b139-1feb709cb656; advcake_track_url=%3D202412093T4GcXzmeYdE61UcXsyCw5B3dL523uceJYTgKg28AxYVD6xC2qEH4NqCs56%2FzgqafVsLqwJJkC5BStJj1zudSOMbjaDcKaBXEuZ3Ej8ZVr1Yf955Kf34cpCifVD7h%2FNDD4jriVNuBksxP71BfLiAReOz0%2FS9qi1ZmU1c9JL3O54uvTJ6wq9Iz1eZ9NQAJVAyctGYx9Hq9lnEWQG6aCu6u4HEqLTks5ce9bx%2Fr2hkq4Owh5wWrQsFDMKis%2F7gU2ia7xT6fwYKzfnerTS5%2FFBvHpeyQ29qJPdeLrrMZzB8HaaHtTDzZuSuJXaUCMdOMPJaRTe11hvYzj6%2BpW6R87l24GGY8cPXH8FHkml4TUtcHaWtNyTaeMuANh7EVB%2BLqWb6cN5zrGlqJygAekQ%2B1k12CZ8yUTR9krh2tC39CtsOfqHcPLZsS78lb6Xziu1f6m%2BvGYBUB3Agr4%2B7kaAbZE4%2B3CMb%2Fx787o8RuXPQPMUOb%2BsmRsulkgPZ5GZ7Foi6Iy%2FIpD6jGnb13V86cn0YHfw9TlTBAF3rD8cSAwRxsJ%2B0DXzhBZQKyEIN4%2BB5xUKVV06jCQeuKnAkcGZyc11nGNWq%2Flg6SnEUnJxEQmQ81Wr7DNdp1ZA9lVdAHWiF1YmPdDb0d7vPvI8N0L18wp%2FzSBZ3Xdz4iWwScr5np81I6skhB%2FuGMg6Xl8LJl14%3D; _ga_03EGKN82H3=GS1.1.1733861955.36.1.1733861976.39.0.0; _ga_5DWC4JK87M=GS1.1.1733861958.36.1.1733861976.42.0.0; authentication_process_hash=JFPKznA1v2ZFgiZVcmakMBSQNDl2b2FX; session_global=4o3mdv8ji6v3boqio6vvt8uhv2")
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
