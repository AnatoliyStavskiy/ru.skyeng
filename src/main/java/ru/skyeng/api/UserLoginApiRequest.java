package ru.skyeng.api;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class UserLoginApiRequest {
    public static final String URL = "https://id.skyeng.ru/login?redirect=https%3A%2F%2Fskyeng.ru%2F";
    public static final String contentType = "application/x-www-form-urlencoded; charset=UTF-8";
    public static final String cookie = "_ym_uid=173161403390447185; _ym_d=1731614033; _gcl_au=1.1.449435764.1731614035; _setz=Europe/Moscow;\n" +
            " _seid=3b17a03440604fd3a4109e029d21328c; _tt_enable_cookie=1; _ttp=ah5Gw2uQh_Fn5n9SonByxS83bw6.tt.1; stDeIdU=87adf3f3-9b92-4e4c\n" +
            "-9c7c-059a09b7747e; __ddg1_=NiVdQZfi05IEOnX0HPkT; mindboxDeviceUUID=bfe12e1d-fd5b-4533-85e9-c0caa1ed7309; directCrm-session=%7B\n" +
            "%22deviceGuid%22%3A%22bfe12e1d-fd5b-4533-85e9-c0caa1ed7309%22%7D; __exponea_etc__=dc17aed2-8169-4084-98c5-553f1ef49f36; _seqp=utm\n" +
            "_source=skyeng&utm_medium=newbutton&utm_campaign=headerprepfromskyeng&_gl=1*1en90bx*_gcl_au*NDQ5NDM1NzY0LjE3MzE2MTQwMzU.*_ga*\n" +
            "MjA0MDk1MDIyOC4xNzMxNjE0MDM2*_ga_5DWC4JK87M*MTczMjY0NzQ4NC45LjEuMTczMjY0NzY5NS42MC4wLjA.*_ga_03EGKN82H3*MTczMjY0NzQ4NS45LjEuMTc\n" +
            "zMjY0NzY5Ni41NS4wLjA.; _seqp_time=1732710247; _ga_MCC1DDG4PF=GS1.2.1732710249.4.1.1732710256.53.0.0; _ga_M3K76MD156=GS1.2.\n" +
            "1732710255.3.1.1732710258.0.0.0; _ga_2GMBEVNSP0=GS1.1.1732710248.3.1.1732710271.0.0.0; _ga_TC305WZH8H=GS1.1.1732710248.3.1.\n" +
            "1732710272.36.0.0; _ga=GA1.1.2040950228.1731614036; AB-test-cookie=03be48df-06e2-4489-bf74-7fe1c1efe6fa%3D1; _ym_isad=1; _ym\n" +
            "_visorc=b; skyeng_mData=8xgs2k1yquqqeofhztckFzMzB4iAOGcA; authentication_process_hash=QaWTlQ4vLkaJmZjqSf3MOm3OP8EegSor; \n" +
            "session_global=cmqbu0jgm4bdihn2u7giv3qslc; _ga_03EGKN82H3=GS1.1.1733330561.17.1.1733331065.53.0.0; _ga_5DWC4JK87M=GS1.1.\n" +
            "1733330562.17.1.1733331065.53.0.0";
    public static RequestSpecification requestSpecification;

    public static void initRequestSpecification() {
        requestSpecification = new RequestSpecBuilder()
                .setBaseUri(URL)
                .setBasePath("/frame/login-submit")
                .setContentType("application/x-www-form-urlencoded; charset=UTF-8")
                .addHeader("accept", "*/*")
                .addHeader("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7")
                .addHeader("user-agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko)\n" +
                        " Chrome/131.0.0.0 Safari/537.36")
                .addCookie(cookie)
                .setBody("csrfToken=82d085e.hsyy2wLzku_T-v4rGflb9z3ODJ35ODluhANYi7Tny_Q.9Kj_4nO_pI3lqM5JX7oZqHGraa6tdw079UYd4PamhoDLttzsVIeq3Iyesw&redirect=https%3A%2F%2Fskyeng.ru%2F&username=test025test@tutamail.com&password=Zkibq4")
                .build();
    }

    public static String getBody(String login, String password) {
        return "csrfToken=8642bc2.Zr4MyBnM_bdXdn39V0-v8bNQvtLXnEyve97qAHMMFIU.OchqhyCtxf4nAjbJDhufn\n" +
                "-AY9ue7znjaKqu-Yx1qeOQ012OKT7aTx2QzFg&redirect=https%3A%2F%2Fskyeng.ru%2F&\n" +
                "username=" + login + "&password="+ password;
    }
}
