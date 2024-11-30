package ru.skyeng.ui;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.skyeng.ui.pages.home.HomePage;
import ru.skyeng.ui.pages.links.HeaderLink;

public class HomePageTest extends BaseTest {

    @Test
    @DisplayName("Переход по ссылке 'Учителям'")
    public void testClickHeaderLinkTeachers() {
        HomePage homePage = new HomePage();
        Assertions.assertTrue(homePage.clickHeaderMenuTeachers().getActualLink().contains(HeaderLink.TEACHERS_LINK));
    }

    @Test
    @DisplayName("Переход по ссылке 'Другие курсы'")
    public void testClickHeaderLinkOtherCourses() {
        HomePage homePage = new HomePage();
        Assertions.assertEquals(homePage.clickHeaderMenuOtherCourses().getActualLink(), (HeaderLink.OTHER_COURSES), "Ссылки не равны");
    }
}
