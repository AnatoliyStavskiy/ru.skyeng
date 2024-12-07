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
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void clickLevelFilter() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        driver.findElement(By.xpath(TutorXpath.LEVEL_XPATH)).click();
    }

    public String checkLevelFilter() {
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

    public void clickTargetFilter() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        driver.findElement(By.xpath(TutorXpath.TARGET_XPATH)).click();
    }

    public String checkTargetFilter() {
        return driver.findElement(By.xpath(TutorXpath.TARGET_XPATH)).getText();
    }

    public void clickTalkEnglishTargetFilter() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        driver.findElement(By.xpath(TutorXpath.TALK_ENGLISH_TARGET_XPATH)).click();
    }

    public void clickBusinessEnglishTargetFilter() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        driver.findElement(By.xpath(TutorXpath.BUSINESS_ENGLISH_TARGET_XPATH)).click();
    }

    public void clickPreparationExamTargetFilter() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        driver.findElement(By.xpath(TutorXpath.PREPARATION_EXAM_TARGET_XPATH)).click();
    }

    public void clickTravelEnglishTargetFilter() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        driver.findElement(By.xpath(TutorXpath.TRAVEL_ENGLISH_TARGET_XPATH)).click();
    }

    public void clickPreparationInterviewTargetFilter() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        driver.findElement(By.xpath(TutorXpath.PREPARATION_INTERVIEW_TARGET_XPATH)).click();
    }

    public void clickOvercomeBarrierTargetFilter() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        driver.findElement(By.xpath(TutorXpath.OVERCOME_BARRIER_TARGET_XPATH)).click();
    }

    public void clickTypeTeacher() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        driver.findElement(By.xpath(TutorXpath.TYPE_TEACHER_XPATH)).click();
    }

    public String checkTypeTeacher() {
        return driver.findElement(By.xpath(TutorXpath.TYPE_TEACHER_XPATH)).getText();
    }

    public void clickRussianSpeakingTeacherFilter() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        driver.findElement(By.xpath(TutorXpath.RUSSIAN_SPEAKING_TEACHER_XPATH)).click();
    }

    public void clickPremiumTeacherFilter() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        driver.findElement(By.xpath(TutorXpath.PREMIUM_TEACHER_XPATH)).click();
    }

    public void clickEnglishSpeakingTeacherFilter() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        driver.findElement(By.xpath(TutorXpath.ENGLISH_SPEAKING_TEACHER_XPATH)).click();
    }

    public void inputCity(String string) {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        driver.findElement(By.xpath(TutorXpath.CITY_INPUT_XPATH)).sendKeys(string);
    }

    public void clickScheduleFilter() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        driver.findElement(By.xpath(TutorXpath.SCHEDULE_XPATH)).click();
    }

    public String checkScheduleFilter() {
        return driver.findElement(By.xpath(TutorXpath.SCHEDULE_XPATH)).getText();
    }

    public void clickWeekDaysScheduleFilter() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        driver.findElement(By.xpath(TutorXpath.WEEK_DAYS_SCHEDULE_XPATH)).click();
    }

    public void clickWeekendScheduleFilter() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        driver.findElement(By.xpath(TutorXpath.WEEKEND_SCHEDULE_XPATH)).click();
    }

    public void clickMorningScheduleFilter() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        driver.findElement(By.xpath(TutorXpath.MORNING_SCHEDULE_XPATH)).click();
    }

    public void clickDayScheduleFilter() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        driver.findElement(By.xpath(TutorXpath.DAY_SCHEDULE_XPATH)).click();
    }

    public void clickEveningScheduleFilter() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        driver.findElement(By.xpath(TutorXpath.EVENING_SCHEDULE_XPATH)).click();
    }
}
