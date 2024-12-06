package ru.skyeng.ui.pages.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.skyeng.ui.pages.links.adult.AdultLinkXpath;
import ru.skyeng.ui.utils.CheckLink;

import static ru.skyeng.ui.driver.Driver.getDriver;

public class AdultPage {

    private WebDriver driver;

    public AdultPage() {
        driver = getDriver();
    }

    public CheckLink clickHeaderMenuAdultsPremium() {
        driver.findElement(By.xpath(AdultLinkXpath.ADULTS_PREMIUM_LINK)).click();
        return new CheckLink(getDriver());
    }

    public CheckLink clickHeaderMenuAdultsTalkClub() {
        driver.findElement(By.xpath(AdultLinkXpath.ADULTS_TALK_CLUB_LINK)).click();
        return new CheckLink(getDriver());
    }

    public CheckLink clickHeaderMenuAdultsSelfStudy() {
        driver.findElement(By.xpath(AdultLinkXpath.ADULTS_SELF_STUDY_LINK)).click();
        return new CheckLink(getDriver());
    }

    public CheckLink clickHeaderMenuAdultsStandart() {
        driver.findElement(By.xpath(AdultLinkXpath.ADULTS_STANDART_LINK)).click();
        return new CheckLink(getDriver());
    }

    public CheckLink clickHeaderMenuAdultsTalks() {
        driver.findElement(By.xpath(AdultLinkXpath.ADULTS_TALKS_LINK)).click();
        return new CheckLink(getDriver());
    }

    public CheckLink clickHeaderMenuAdultsCourses() {
        driver.findElement(By.xpath(AdultLinkXpath.ADULTS_COURSES_LINK)).click();
        return new CheckLink(getDriver());
    }
}
