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
        driver.findElement(By.tagName(HomePageXpath.HEADER_MENU_MORE)).getAttribute("Ещё");
        driver.findElement(By.xpath(HomePageXpath.HEADER_MENU_ONLINE_TEST)).click();
        return this;
    }
    public CheckLink clickHeaderMenuTeachers() {
        HomePage homePage = new HomePage();
        driver.findElement(By.xpath(HomePageXpath.ACCEPT_COOKIE)).click();
        try {
            driver.findElement(By.xpath(HomePageXpath.HEADER_MENU_TEACHERS)).click();
        } catch (ElementNotInteractableException e) {
            driver.findElement(By.xpath(HomePageXpath.HEADER_MENU_MORE)).click();
            driver.findElement(By.xpath(HomePageXpath.HEADER_MENU_MORE_TEACHERS)).click();
            }
        return new CheckLink(getDriver());
    }
}
