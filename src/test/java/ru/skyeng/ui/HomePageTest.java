package ru.skyeng.ui;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.skyeng.ui.driver.Driver;
import ru.skyeng.ui.pages.home.HomePage;
import ru.skyeng.ui.pages.home.HomePageXpath;
import ru.skyeng.ui.pages.links.HeaderLink;
import ru.skyeng.ui.pages.links.adult.AdultLink;

import java.time.Duration;

public class HomePageTest extends BaseTest {

    WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));

    @Test
    @DisplayName("Переход на Главную страницу, клик по Логотипу")
    public void testClickHeaderLinkLogo() {
        HomePage homePage = new HomePage();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        Assertions.assertEquals(homePage.clickHeaderMenuSkyengLogo().getActualLink(), HeaderLink.HOME_LINK);
    }

    @Test
    @DisplayName("Переход по ссылке взрослым -> Премиум")
    public void testClickHeaderLinkAdultPremium() {
        HomePage homePage = new HomePage();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        Assertions.assertEquals(homePage.clickHeaderMenuAdult().clickHeaderMenuAdultsPremium().getActualLink(), AdultLink.PREMIUM_LINK);
    }

    @Test
    @DisplayName("Переход по ссылке взрослым -> Разговорные клубы")
    public void testClickHeaderLinkAdultTalkClub() {
        HomePage homePage = new HomePage();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        Assertions.assertEquals(homePage.clickHeaderMenuAdult().clickHeaderMenuAdultsTalkClub().getActualLink(), AdultLink.TALK_CLUB_LINK);
    }

    @Test
    @DisplayName("Переход по ссылке взрослым -> Self-study")
    public void testClickHeaderLinkAdultSelfStudy() {
        HomePage homePage = new HomePage();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        Assertions.assertEquals(homePage.clickHeaderMenuAdult().clickHeaderMenuAdultsSelfStudy().getActualLink(), AdultLink.SELF_STUDY_LINK);
    }

    @Test
    @DisplayName("Переход по ссылке взрослым -> Стандарт")
    public void testClickHeaderLinkAdultStandart() {
        HomePage homePage = new HomePage();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        Assertions.assertEquals(homePage.clickHeaderMenuAdult().clickHeaderMenuAdultsStandart().getActualLink(), AdultLink.STANDART_LINK);
    }

    @Test
    @DisplayName("Переход по ссылке взрослым -> Talks")
    public void testClickHeaderLinkAdultTalks() {
        HomePage homePage = new HomePage();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        Assertions.assertEquals(homePage.clickHeaderMenuAdult().clickHeaderMenuAdultsTalks().getActualLink(), AdultLink.TALKS_LINK);
    }

    @Test
    @DisplayName("Переход по ссылке взрослым -> Курсы")
    public void testClickHeaderLinkAdultCourses() {
        HomePage homePage = new HomePage();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        Assertions.assertEquals(homePage.clickHeaderMenuAdult().clickHeaderMenuAdultsCourses().getActualLink(), AdultLink.COURSES_LINK);
    }

    @Test
    @DisplayName("Переход по ссылке 'Репетиторы'")
    public void testClickHeaderLinkTutors() {
        HomePage homePage = new HomePage();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        Assertions.assertTrue(homePage.clickHeaderMenuTutors().getActualLink().contains(HeaderLink.TUTORS_LINK));
    }

    @Test
    @DisplayName("Переход по ссылке 'Сертификаты'")
    public void testClickHeaderLinkCertificates() {
        HomePage homePage = new HomePage();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        Assertions.assertEquals(homePage.clickHeaderMenuCertificates().getActualLink(), HeaderLink.CERTIFICATES_LINK);
    }

    @Test
    @DisplayName("Переход по ссылке 'Новая профессия'")
    public void testClickHeaderLinkNewProfession() {
        HomePage homePage = new HomePage();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        Assertions.assertEquals(homePage.clickHeaderMenuNewProfession().getActualLink(), HeaderLink.NEW_PROFESSION_LINK);
    }

    @Test
    @DisplayName("Переход по ссылке 'Онлайн тест'")
    public void testClickHeaderLinkOnlineTest() {
        HomePage homePage = new HomePage();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        Assertions.assertTrue(homePage.clickHeaderMenuOnlineTest().getActualLink().contains(HeaderLink.ONLINE_TEST_LINK));
    }

    @Test
    @DisplayName("Переход по ссылке 'Учителям'")
    public void testClickHeaderLinkTeachers() {
        HomePage homePage = new HomePage();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        Assertions.assertTrue(homePage.clickHeaderMenuTeachers().getActualLink().contains(HeaderLink.TEACHERS_LINK));
    }

    @Test
    @DisplayName("Переход по ссылке 'Другие курсы'")
    public void testClickHeaderLinkOtherCourses() {
        HomePage homePage = new HomePage();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageXpath.LOGIN)));
        Assertions.assertEquals(homePage.clickHeaderMenuOtherCourses().getActualLink(), (HeaderLink.OTHER_COURSES), "Ссылки не равны");
    }
}
