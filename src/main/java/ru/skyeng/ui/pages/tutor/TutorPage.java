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
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(7));
    }

    public TutorPage clickLevelFilter() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        driver.findElement(By.xpath(TutorXpath.LEVEL_XPATH)).click();
        return this;
    }

    public String checkLevelFilter() {
        return driver.findElement(By.xpath(TutorXpath.LEVEL_XPATH)).getText();
    }

    public TutorPage clickBeginnerLevelFilter() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        driver.findElement(By.xpath(TutorXpath.BEGINNER_LEVEL_XPATH)).click();
        return this;
    }

    public TutorPage clickElementaryLevelFilter() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        driver.findElement(By.xpath(TutorXpath.ELEMENTARY_LEVEL_XPATH)).click();
        return this;
    }

    public TutorPage clickPreIntermediateLevelFilter() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        driver.findElement(By.xpath(TutorXpath.PRE_INTERMEDIATE_LEVEL_XPATH)).click();
        return this;
    }

    public TutorPage clickIntermediateLevelFilter() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        driver.findElement(By.xpath(TutorXpath.INTERMEDIATE_LEVEL_XPATH)).click();
        return this;
    }

    public TutorPage clickUpperIntermediateLevelFilter() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        driver.findElement(By.xpath(TutorXpath.UPPER_INTERMEDIATE_LEVEL_XPATH)).click();
        return this;
    }

    public TutorPage clickAdvancedLevelFilter() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        driver.findElement(By.xpath(TutorXpath.ADVANCED_LEVEL_XPATH)).click();
        return this;
    }

    public TutorPage clickTargetFilter() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        driver.findElement(By.xpath(TutorXpath.TARGET_XPATH)).click();
        return this;
    }

    public String checkTargetFilter() {
        return driver.findElement(By.xpath(TutorXpath.TARGET_XPATH)).getText();
    }

    public TutorPage clickTalkEnglishTargetFilter() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        driver.findElement(By.xpath(TutorXpath.TALK_ENGLISH_TARGET_XPATH)).click();
        return this;
    }

    public TutorPage clickBusinessEnglishTargetFilter() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        driver.findElement(By.xpath(TutorXpath.BUSINESS_ENGLISH_TARGET_XPATH)).click();
        return this;
    }

    public TutorPage clickPreparationExamTargetFilter() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        driver.findElement(By.xpath(TutorXpath.PREPARATION_EXAM_TARGET_XPATH)).click();
        return this;
    }

    public TutorPage clickTravelEnglishTargetFilter() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        driver.findElement(By.xpath(TutorXpath.TRAVEL_ENGLISH_TARGET_XPATH)).click();
        return this;
    }

    public TutorPage clickPreparationInterviewTargetFilter() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        driver.findElement(By.xpath(TutorXpath.PREPARATION_INTERVIEW_TARGET_XPATH)).click();
        return this;
    }

    public TutorPage clickOvercomeBarrierTargetFilter() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        driver.findElement(By.xpath(TutorXpath.OVERCOME_BARRIER_TARGET_XPATH)).click();
        return this;
    }

    public TutorPage clickTypeTeacher() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        driver.findElement(By.xpath(TutorXpath.TYPE_TEACHER_XPATH)).click();
        return this;
    }

    public String checkTypeTeacher() {
        return driver.findElement(By.xpath(TutorXpath.TYPE_TEACHER_XPATH)).getText();
    }

    public TutorPage clickRussianSpeakingTeacherFilter() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        driver.findElement(By.xpath(TutorXpath.RUSSIAN_SPEAKING_TEACHER_XPATH)).click();
        return this;
    }

    public TutorPage clickPremiumTeacherFilter() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        driver.findElement(By.xpath(TutorXpath.PREMIUM_TEACHER_XPATH)).click();
        return this;
    }

    public TutorPage clickEnglishSpeakingTeacherFilter() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        driver.findElement(By.xpath(TutorXpath.ENGLISH_SPEAKING_TEACHER_XPATH)).click();
        return this;
    }

    public TutorPage inputCity(String string) {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        driver.findElement(By.xpath(TutorXpath.CITY_INPUT_XPATH)).sendKeys(string);
        return this;
    }

    public TutorPage clickScheduleFilter() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        driver.findElement(By.xpath(TutorXpath.SCHEDULE_XPATH)).click();
        return this;
    }

    public String checkScheduleFilter() {
        return driver.findElement(By.xpath(TutorXpath.SCHEDULE_XPATH)).getText();
    }

    public TutorPage clickWeekDaysScheduleFilter() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        driver.findElement(By.xpath(TutorXpath.WEEK_DAYS_SCHEDULE_XPATH)).click();
        return this;
    }

    public TutorPage clickWeekendScheduleFilter() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        driver.findElement(By.xpath(TutorXpath.WEEKEND_SCHEDULE_XPATH)).click();
        return this;
    }

    public TutorPage clickMorningScheduleFilter() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        driver.findElement(By.xpath(TutorXpath.MORNING_SCHEDULE_XPATH)).click();
        return this;
    }

    public TutorPage clickDayScheduleFilter() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        driver.findElement(By.xpath(TutorXpath.DAY_SCHEDULE_XPATH)).click();
        return this;
    }

    public TutorPage clickEveningScheduleFilter() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        driver.findElement(By.xpath(TutorXpath.EVENING_SCHEDULE_XPATH)).click();
        return this;
    }

    public String checkFoundTutors() {
        return driver.findElement(By.xpath(TutorXpath.FOUND_TUTORS)).getText();
    }
}
