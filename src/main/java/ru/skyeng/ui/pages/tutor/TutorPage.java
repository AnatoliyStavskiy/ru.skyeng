package ru.skyeng.ui.pages.tutor;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static ru.skyeng.ui.driver.Driver.getDriver;

public class TutorPage {

    private WebDriver driver;
    private WebDriverWait webDriverWait;

    public TutorPage() {
        driver = getDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public TutorPage clickLevelFilter() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(By.xpath(TutorXpath.LEVEL_XPATH)).click();
        return this;
    }

    public String levelFilter() {
        return driver.findElement(By.xpath(TutorXpath.CHECK_LEVEL_XPATH)).getText();
    }

    public void clickBeginnerLevelFilter() {
        driver.findElement(By.xpath(TutorXpath.BEGINNER_LEVEL_XPATH)).click();
    }

    public void clickElementaryLevelFilter() {
        driver.findElement(By.xpath(TutorXpath.ELEMENTARY_LEVEL_XPATH)).click();
    }

    public void clickPreIntermediateLevelFilter() {
        driver.findElement(By.xpath(TutorXpath.PRE_INTERMEDIATE_LEVEL_XPATH)).click();
    }

    public void clickIntermediateLevelFilter() {
        driver.findElement(By.xpath(TutorXpath.BEGINNER_LEVEL_XPATH)).click();
    }

    public void clickUpperIntermediateLevelFilter() {
        driver.findElement(By.xpath(TutorXpath.UPPER_INTERMEDIATE_LEVEL_XPATH)).click();
    }

    public void clickAdvancedLevelFilter() {
        driver.findElement(By.xpath(TutorXpath.ADVANCED_LEVEL_XPATH)).click();
    }

    public void clickCloseBanner() {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(TutorXpath.CLOSE_BANNER_DIV))).click();
    }
}
