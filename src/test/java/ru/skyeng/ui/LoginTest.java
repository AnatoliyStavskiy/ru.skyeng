package ru.skyeng.ui;

import org.junit.jupiter.api.*;
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
        LoginPage loginPage = new LoginPage();
        loginPage.inputPhone("5556667788").clickLoginButton();
        Assertions.assertEquals(loginPage.checkTextPhoneErrorField(), LoginMessage.ERROR_ENTRY_PHONE_MESSAGE);
    }

    @Test
    @DisplayName("Вход с пустыми полями")
    public void testClickEntryWithEmptyFields() {
        LoginPage loginPage = new LoginPage();
        loginPage.entryWithLoginForm();
        loginPage.clickLoginButton();
        Assertions.assertEquals(loginPage.checkTextErrorField(), LoginMessage.ERROR_ENTRY_LOGIN_MESSAGE);
    }

    @Test
    @DisplayName("Вход с пустым паролем")
    public void testClickEntryWithUsernameOnly() {
        LoginPage loginPage = new LoginPage();
        loginPage.entryWithLoginForm();
        loginPage.inputEmail("email@mail.com").clickLoginButton();
        Assertions.assertEquals(loginPage.checkTextErrorField(), LoginMessage.ERROR_ENTRY_LOGIN_MESSAGE);
    }

    @Test
    @DisplayName("Вход с пустым логином")
    public void testClickEntryWithPasswordOnly() {
        LoginPage loginPage = new LoginPage();
        loginPage.entryWithLoginForm();
        loginPage.inputPassword("123qwerty123").clickLoginButton();
        Assertions.assertEquals(loginPage.checkTextErrorField(), LoginMessage.ERROR_ENTRY_LOGIN_MESSAGE);
    }

    @Test
    @DisplayName("Вход с некорректными логином и паролем")
    public void testClickWithIncorrectData() {
        LoginPage loginPage = new LoginPage();
        loginPage.entryWithLoginForm();
        loginPage.inputEmail("test@mail.ru").inputPassword("123qwerty123").clickLoginButton();
        Assertions.assertEquals(loginPage.checkTextErrorField(), LoginMessage.ERROR_ENTRY_LOGIN_MESSAGE);
    }

    @Test
    @DisplayName("Вход с валидными данными")
    public void testWithCorrectLoginData() {
        LoginPage loginPage = new LoginPage();
        loginPage.entryWithLoginForm();
        loginPage.inputEmail(LoginPageData.CORRECT_LOGIN_EMAIL).inputPassword(LoginPageData.CORRECT_LOGIN_PASSWORD).clickLoginButton();
        Assertions.assertEquals(loginPage.checkSuccessfulLogin(), LoginMessage.LOGIN_USER_MESSAGE);
    }

    @AfterEach
    public void tearDown() {
        Driver.quit();
    }
}
