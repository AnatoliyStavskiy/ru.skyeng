package ru.skyeng.ui;

import org.junit.jupiter.api.*;
import ru.skyeng.api.Point;
import ru.skyeng.ui.driver.Driver;
import ru.skyeng.ui.pages.login.LoginMessage;
import ru.skyeng.ui.pages.login.LoginPage;
import ru.skyeng.ui.pages.login.LoginPageData;

public class LoginTest {

    @BeforeEach
    public void setUp() {
        Driver.getDriver().get("https://id.skyeng.ru/login");
    }

    @Test
    @DisplayName("Отправка смс на некорректный номер")
    public void testClickEntryWithIncorrectPhone(){
        LoginPage loginPage = new LoginPage()
                .inputPhone("5556667788").clickLoginButton();
        Assertions.assertEquals(loginPage.checkTextPhoneErrorField(), LoginMessage.ERROR_ENTRY_PHONE_MESSAGE);
    }

    @Test
    @DisplayName("Вход с пустыми полями")
    public void testClickEntryWithEmptyFields() {
        LoginPage loginPage = new LoginPage()
                .entryWithLoginForm().clickLoginButton();
        Assertions.assertEquals(loginPage.checkTextErrorField(), LoginMessage.ERROR_ENTRY_LOGIN_MESSAGE);
    }

    @Test
    @DisplayName("Вход с пустым полем паролем")
    public void testClickEntryWithUsernameOnly() {
        LoginPage loginPage = new LoginPage()
                .entryWithLoginForm()
                .inputEmail("email@mail.com")
                .clickLoginButton();
        Assertions.assertEquals(loginPage.checkTextErrorField(), LoginMessage.ERROR_ENTRY_LOGIN_MESSAGE);
    }

    @Test
    @DisplayName("Вход с пустым логином")
    public void testClickEntryWithPasswordOnly() {
        LoginPage loginPage = new LoginPage()
                .entryWithLoginForm()
                .inputPassword("123qwerty123")
                .clickLoginButton();
        Assertions.assertEquals(loginPage.checkTextErrorField(), LoginMessage.ERROR_ENTRY_LOGIN_MESSAGE);
    }

    @Test
    @DisplayName("Вход с некорректными логином и паролем")
    public void testClickWithIncorrectData() {
        LoginPage loginPage = new LoginPage()
                .entryWithLoginForm()
                .inputEmail(Point.TEST_EMAIL)
                .inputPassword(Point.TEST_PASSWORD).clickLoginButton();
        Assertions.assertEquals(loginPage.checkTextErrorField(), LoginMessage.ERROR_ENTRY_LOGIN_MESSAGE);
    }

    @Test
    @DisplayName("Вход с валидными данными")
    public void testWithCorrectLoginData() {
        LoginPage loginPage = new LoginPage()
                .entryWithLoginForm()
                .inputEmail(LoginPageData.CORRECT_LOGIN_EMAIL)
                .inputPassword(LoginPageData.CORRECT_LOGIN_PASSWORD)
                .clickLoginButton();
        Assertions.assertEquals(loginPage.checkSuccessfulLogin(), LoginMessage.LOGIN_USER_MESSAGE);
    }

    @AfterEach
    public void tearDown() {
        Driver.quit();
    }
}
