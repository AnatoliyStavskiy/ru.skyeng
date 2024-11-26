package ru.skyeng.ui.pages.home;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import ru.skyeng.ui.utils.CheckLink;


import static ru.skyeng.ui.driver.Driver.getDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage() {
        driver = getDriver();
    }

    public HomePage clickHeaderMenuSkyengLogo() {
        driver.findElement(By.xpath(HomePageXpath.HEADER_SKYENG_LOGO)).click();
        return this;
    }

    public HomePage clickHeaderMenuAdults() {
        driver.findElement(By.xpath(HomePageXpath.HEADER_MENU_ADULTS)).click();
        return this;
    }

    public HomePage clickHeaderMenuTutors() {
        driver.findElement(By.xpath(HomePageXpath.HEADER_MENU_TUTORS)).click();
        return this;
    }

    public HomePage clickHeaderMenuSertificates() {
        driver.findElement(By.xpath(HomePageXpath.HEADER_MENU_CERTIFICATES)).click();
        return this;
    }

    public HomePage clickHeaderMenuCareerGuidanceIt() {
        driver.findElement(By.xpath(HomePageXpath.HEADER_MENU_CAREER_GUIDANCE_IT)).click();
        return this;
    }

    public HomePage clickHeaderMenuOnlineTest() {
        driver.findElement(By.tagName(HomePageXpath.HEADER_MENU_MORE_XPATH)).getAttribute("Ещё");
        driver.findElement(By.xpath(HomePageXpath.HEADER_MENU_ONLINE_TEST)).click();
        return this;
    }

    public CheckLink focusHeaderMenuMore() {
        driver.findElement(By.xpath(HomePageXpath.ACCEPT_COOKIE)).click();
        int maxRetry = 2;
        for (int i = 0; i < maxRetry; i++) {
            try {
                driver.findElement(By.xpath(HomePageXpath.HEADER_MENU_MORE_2)).click();
//                driver.findElement(By.xpath(HomePageXpath.HEADER_MENU_TEACHERS)).click();
                break;
            }
            catch (StaleElementReferenceException e) {
                if (i == maxRetry - 1) throw e;
            }
        }
        return new CheckLink(getDriver());
    }

    public CheckLink clickHeaderMenuMoreTeachers() {
        driver.findElement(By.xpath(HomePageXpath.ACCEPT_COOKIE)).click();
        driver.findElement(By.xpath(HomePageXpath.HEADER_MENU_TEACHERS)).click();
        return new CheckLink(getDriver());
    }
}
