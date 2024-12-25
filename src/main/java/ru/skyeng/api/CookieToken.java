package ru.skyeng.api;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.Cookie;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static com.codeborne.selenide.Selenide.$x;

public class CookieToken {

    private String csfrToken;
    static CookieToken selenaidSearchCsfr;

    public CookieToken(String csfrToken) {
        this.csfrToken = csfrToken;
    }

    public String getCsfrToken() {
        return csfrToken;
    }

    public static Set<Cookie> getCookie() {
        Selenide.open(UserLoginApiRequest.ID_LOGIN_URL);
        $x(Point.CLICK_FORM_LOGIN_XPATH).click();
        selenaidSearchCsfr = new CookieToken($x(Point.CSFR_TOKEN_XPATH).getValue());

        var cookiesBrowser = WebDriverRunner.getWebDriver().manage().getCookies();
        Selenide.closeWebDriver();
        return cookiesBrowser;
    }

    public static List<io.restassured.http.Cookie> requestCookieData(Set<org.openqa.selenium.Cookie> cookiesBrowser) {

        List<io.restassured.http.Cookie> restCookies = new ArrayList<>();

        for (org.openqa.selenium.Cookie cookie : cookiesBrowser) {
            io.restassured.http.Cookie temp = new io.restassured.http.Cookie
                    .Builder(cookie.getName(), cookie.getValue())
                    .setDomain(cookie.getDomain())
                    .setPath("/").build();
            restCookies.add(temp);
        }
        return restCookies;
    }


}
