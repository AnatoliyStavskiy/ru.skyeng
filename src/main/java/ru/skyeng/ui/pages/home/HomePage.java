package ru.skyeng.ui.pages.home;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import ru.skyeng.ui.utils.CheckLink;


import static ru.skyeng.ui.driver.Driver.getDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage() {
        driver = getDriver();
    }

    public CheckLink clickHeaderMenuSkyengLogo() {
        driver.findElement(By.xpath(HomePageXpath.HEADER_SKYENG_LOGO)).click();
        return new CheckLink(getDriver());
    }

    public AdultPage clickHeaderMenuAdult() {
        driver.findElement(By.xpath(HomePageXpath.HEADER_MENU_ADULTS)).click();
        return new AdultPage();
    }

    public CheckLink clickHeaderMenuTutors() {
        driver.findElement(By.xpath(HomePageXpath.HEADER_MENU_TUTORS)).click();
        return new CheckLink(getDriver());
    }

    public CheckLink clickHeaderMenuCertificates() {
        driver.findElement(By.xpath(HomePageXpath.HEADER_MENU_CERTIFICATES)).click();
        return new CheckLink(getDriver());
    }

    public CheckLink clickHeaderMenuCareerGuidanceIt() {
        driver.findElement(By.xpath(HomePageXpath.HEADER_MENU_CAREER_GUIDANCE_IT)).click();
        return new CheckLink(getDriver());
    }

    public CheckLink clickHeaderMenuOnlineTest() {
        driver.findElement(By.xpath(HomePageXpath.HEADER_MENU_ONLINE_TEST)).click();
        return new CheckLink(getDriver());
    }

    public CheckLink clickHeaderMenuTeachers() {
        driver.findElement(By.xpath(HomePageXpath.ACCEPT_COOKIE)).click();
        try {
            driver.findElement(By.xpath(HomePageXpath.HEADER_MENU_TEACHERS)).click();
        } catch (ElementNotInteractableException e) {
            driver.findElement(By.xpath(HomePageXpath.HEADER_MENU_MORE)).click();
            driver.findElement(By.xpath(HomePageXpath.HEADER_MENU_MORE_TEACHERS)).click();
        }
        return new CheckLink(getDriver());
    }

    public CheckLink clickHeaderMenuOtherCourses() {
        driver.findElement(By.xpath(HomePageXpath.ACCEPT_COOKIE)).click();
        try {
            driver.findElement(By.xpath(HomePageXpath.HEADER_MENU_COURSES)).click();
        } catch (ElementNotInteractableException e) {
            driver.findElement(By.xpath(HomePageXpath.HEADER_MENU_MORE)).click();
            driver.findElement(By.xpath(HomePageXpath.HEADER_MENU_OTHER_COURSES)).click();
        }
        return new CheckLink(getDriver());
    }
}
