package ru.skyeng.ui;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.*;
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

    WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(8));
    private static final Logger logger = LogManager.getLogger();

    @Test
    @DisplayName("Переход на Главную страницу, клик по Логотипу")
    public void testClickHeaderLinkLogo() {
        logger.info("Стартовал тест - Переход на Главную страницу, клик по Логотипу");

        HomePage homePage = new HomePage();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(HomePageXpath.LOGIN))));
        Assertions.assertEquals(homePage.clickHeaderMenuSkyengLogo().getActualLink(), HeaderLink.HOME_LINK);

        logger.info("Завершен тест - Переход на Главную страницу, клик по Логотипу");
    }

    @Test
    @DisplayName("Переход по ссылке взрослым -> Премиум")
    public void testClickHeaderLinkAdultPremium() {
        logger.info("Стартовал тест - Переход по ссылке взрослым -> Премиум");

        HomePage homePage = new HomePage();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(HomePageXpath.LOGIN)));
        Assertions.assertEquals(homePage.clickHeaderMenuAdult().clickHeaderMenuAdultsPremium().getActualLink(), AdultLink.PREMIUM_LINK);

        logger.info("Завершен тест - Переход по ссылке взрослым -> Премиум");
    }

    @Test
    @DisplayName("Переход по ссылке взрослым -> Разговорные клубы")
    public void testClickHeaderLinkAdultTalkClub() {
        logger.info("Стартовал тест - Переход по ссылке взрослым -> Разговорные клубы");

        HomePage homePage = new HomePage();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(HomePageXpath.LOGIN)));
        Assertions.assertEquals(homePage.clickHeaderMenuAdult().clickHeaderMenuAdultsTalkClub().getActualLink(), AdultLink.TALK_CLUB_LINK);

        logger.info("Завершен тест - Переход по ссылке взрослым -> Разговорные клубы");
    }

    @Test
    @DisplayName("Переход по ссылке взрослым -> Self-study")
    public void testClickHeaderLinkAdultSelfStudy() {
        logger.info("Стартовал тест - Переход по ссылке взрослым -> Self-study");

        HomePage homePage = new HomePage();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(HomePageXpath.LOGIN)));
        Assertions.assertEquals(homePage.clickHeaderMenuAdult().clickHeaderMenuAdultsSelfStudy().getActualLink(), AdultLink.SELF_STUDY_LINK);

        logger.info("Завершен тест - Переход по ссылке взрослым -> Self-study");
    }

    @Test
    @DisplayName("Переход по ссылке взрослым -> Стандарт")
    public void testClickHeaderLinkAdultStandart() {
        logger.info("Стартовал тест - Переход по ссылке взрослым -> Стандарт");

        HomePage homePage = new HomePage();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(HomePageXpath.LOGIN)));
        Assertions.assertEquals(homePage.clickHeaderMenuAdult().clickHeaderMenuAdultsStandart().getActualLink(), AdultLink.STANDART_LINK);

        logger.info("Завершен тест - Переход по ссылке взрослым -> Стандарт");
    }

    @Test
    @DisplayName("Переход по ссылке взрослым -> Talks")
    public void testClickHeaderLinkAdultTalks() {
        logger.info("Стартовал тест - Переход по ссылке взрослым -> Talks");

        HomePage homePage = new HomePage();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(HomePageXpath.LOGIN)));
        Assertions.assertEquals(homePage.clickHeaderMenuAdult().clickHeaderMenuAdultsTalks().getActualLink(), AdultLink.TALKS_LINK);

        logger.info("Завершен тест - Переход по ссылке взрослым -> Talks");
    }

    @Test
    @DisplayName("Переход по ссылке взрослым -> Курсы")
    public void testClickHeaderLinkAdultCourses() {
        logger.info("Стартовал тест - Переход по ссылке взрослым -> Курсы");

        HomePage homePage = new HomePage();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(HomePageXpath.LOGIN)));
        Assertions.assertEquals(homePage.clickHeaderMenuAdult().clickHeaderMenuAdultsCourses().getActualLink(), AdultLink.COURSES_LINK);

        logger.info("Завершен тест - Переход по ссылке взрослым -> Курсы");
    }

    @Test
    @DisplayName("Переход по ссылке 'Репетиторы'")
    public void testClickHeaderLinkTutors() {
        logger.info("Стартовал тест - Переход по ссылке 'Репетиторы'");

        HomePage homePage = new HomePage();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(HomePageXpath.LOGIN)));
        Assertions.assertTrue(homePage.clickHeaderMenuTutors().getActualLink().contains(HeaderLink.TUTORS_LINK));

        logger.info("Завершен тест - Переход по ссылке 'Репетиторы'");
    }

    @Test
    @DisplayName("Переход по ссылке 'Сертификаты'")
    public void testClickHeaderLinkCertificates() {
        logger.info("Стартовал тест - Переход по ссылке 'Сертификаты'");

        HomePage homePage = new HomePage();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(HomePageXpath.LOGIN)));
        Assertions.assertEquals(homePage.clickHeaderMenuCertificates().getActualLink(), HeaderLink.CERTIFICATES_LINK);

        logger.info("Завершен тест - Переход по ссылке 'Сертификаты'");
    }

    @Test
    @DisplayName("Переход по ссылке 'Новая профессия'")
    public void testClickHeaderLinkNewProfession() {
        logger.info("Стартовал тест - Переход по ссылке 'Новая профессия'");

        HomePage homePage = new HomePage();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(HomePageXpath.LOGIN)));
        Assertions.assertEquals(homePage.clickHeaderMenuNewProfession().getActualLink(), HeaderLink.NEW_PROFESSION_LINK);

        logger.info("Завершен тест - Переход по ссылке 'Новая профессия'");
    }

    @Test
    @DisplayName("Переход по ссылке 'Онлайн тест'")
    public void testClickHeaderLinkOnlineTest() {
        logger.info("Стартовал тест - Переход по ссылке 'Онлайн тест'");

        HomePage homePage = new HomePage();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(HomePageXpath.LOGIN)));
        Assertions.assertTrue(homePage.clickHeaderMenuOnlineTest().getActualLink().contains(HeaderLink.ONLINE_TEST_LINK));

        logger.info("Завершен тест - Переход по ссылке 'Онлайн тест'");
    }

    @Test
    @DisplayName("Переход по ссылке 'Учителям'")
    public void testClickHeaderLinkTeachers() {
        logger.info("Стартовал тест - Переход по ссылке 'Учителям'");

        HomePage homePage = new HomePage();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(HomePageXpath.LOGIN)));
        Assertions.assertTrue(homePage.clickHeaderMenuTeachers().getActualLink().contains(HeaderLink.TEACHERS_LINK));

        logger.info("Завершен тест - Переход по ссылке 'Учителям'");
    }

    @Test
    @DisplayName("Переход по ссылке 'Другие курсы'")
    public void testClickHeaderLinkOtherCourses() {
        logger.info("Стартовал тест - Переход по ссылке 'Другие курсы");

        HomePage homePage = new HomePage();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(HomePageXpath.LOGIN)));
        Assertions.assertEquals(homePage.clickHeaderMenuOtherCourses().getActualLink(), (HeaderLink.OTHER_COURSES), "Ссылки не равны");

        logger.info("Завершен тест - Переход по ссылке 'Другие курсы");
    }
}
