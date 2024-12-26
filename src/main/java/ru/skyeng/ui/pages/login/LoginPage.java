package ru.skyeng.ui.pages.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.skyeng.ui.driver.Driver;

import java.time.Duration;

import static ru.skyeng.ui.driver.Driver.getDriver;

public class LoginPage {
    private WebDriver driver;

    public LoginPage() {
        driver = getDriver();
    }

    WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    public LoginPage entryWithLoginForm() {
        LoginPage loginPage = new LoginPage();
        try {
            loginPage.checkUsernameInput();
        } catch (Exception e) {
            loginPage.clickEntryWithPassword();
        }
        return this;
    }

    public LoginPage clickLoginButton() {
        driver.findElement(By.xpath(LoginPageXpath.LOGIN_BUTTON_XPATH)).click();
        return this;
    }

    public void clickEntryWithPassword() {
        driver.findElement(By.xpath(LoginPageXpath.ENTRY_WITH_PASSWORD_XPATH)).click();
    }

    public LoginPage inputPhone(String string) {
        driver.findElement(By.xpath(LoginPageXpath.PHONE_INPUT_XPATH)).sendKeys(string);
        return this;
    }

    public LoginPage inputEmail(String string) {
        driver.findElement(By.xpath(LoginPageXpath.USERNAME_INPUT_XPATH)).sendKeys(string);
        return this;
    }

    public LoginPage inputPassword(String string) {
        driver.findElement(By.xpath(LoginPageXpath.PASSWORD_INPUT_XPATH)).sendKeys(string);
        return this;
    }

    public void checkUsernameInput() {
        driver.findElement(By.xpath(LoginPageXpath.USERNAME_INPUT_XPATH)).click();
    }

    public String checkTextPhoneErrorField() {
        return webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LoginPageXpath.ERROR_PHONE_ENTRY_XPATH))).getText();
    }

    public String checkTextErrorField() {
        return webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LoginPageXpath.ERROR_LOGIN_ENTRY_XPATH))).getText();
    }

    public String checkSuccessfulLogin() {
        return webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LoginPageData.SUCCESSFUL_LOGIN))).getText();
    }

}
