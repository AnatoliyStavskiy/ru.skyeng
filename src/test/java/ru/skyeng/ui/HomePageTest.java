package ru.skyeng.ui;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.skyeng.ui.pages.home.HomePage;

public class HomePageTest extends BaseTest {

    @Test
    @DisplayName("Переход по ссылку Учителям")
    public void testClickTeachers(){
    HomePage homePage = new HomePage();
    Assertions.assertTrue(homePage.clickHeaderMenuMoreTeachers().getActualLink().contains("https://job.skyeng.ru/english-teachers?utm_source=skyeng&utm_medium=newbutton&utm_campaign=headerprepfromskyeng"));
    }
}
