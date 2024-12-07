package ru.skyeng.ui.pages.tutor;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.skyeng.ui.pages.home.HomePageXpath;

import java.time.Duration;

import static ru.skyeng.ui.driver.Driver.getDriver;

public class TutorPage {

    private WebDriver driver;
    private WebDriverWait webDriverWait;

    public TutorPage() {
        driver = getDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(3));
    }

    public void clickLevelFilter() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        driver.findElement(By.xpath(TutorXpath.LEVEL_XPATH)).click();
    }

    public String levelFilter() {
        return driver.findElement(By.xpath(TutorXpath.LEVEL_XPATH)).getText();
    }

    public void clickBeginnerLevelFilter() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        driver.findElement(By.xpath(TutorXpath.BEGINNER_LEVEL_XPATH)).click();
    }

    public void clickElementaryLevelFilter() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        driver.findElement(By.xpath(TutorXpath.ELEMENTARY_LEVEL_XPATH)).click();
    }

    public void clickPreIntermediateLevelFilter() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        driver.findElement(By.xpath(TutorXpath.PRE_INTERMEDIATE_LEVEL_XPATH)).click();
    }

    public void clickIntermediateLevelFilter() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        driver.findElement(By.xpath(TutorXpath.INTERMEDIATE_LEVEL_XPATH)).click();
    }

    public void clickUpperIntermediateLevelFilter() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        driver.findElement(By.xpath(TutorXpath.UPPER_INTERMEDIATE_LEVEL_XPATH)).click();
    }

    public void clickAdvancedLevelFilter() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        driver.findElement(By.xpath(TutorXpath.ADVANCED_LEVEL_XPATH)).click();
    }
}
