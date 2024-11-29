package ru.skyeng.ui;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.skyeng.ui.pages.home.HomePage;
import ru.skyeng.ui.pages.links.HeaderLink;

public class HomePageTest extends BaseTest {

    @Test
    @DisplayName("Переход по ссылке 'Учителям'")
    public void testClickHeaderLinkTeachers(){
    HomePage homePage = new HomePage();
    Assertions.assertTrue(homePage.clickHeaderMenuTeachers().getActualLink().contains(HeaderLink.FOR_TEACHERS_LINK));
    }
}
