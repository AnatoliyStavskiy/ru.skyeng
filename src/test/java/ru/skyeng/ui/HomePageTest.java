package ru.skyeng.ui;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.skyeng.ui.pages.home.HomePage;

public class HomePageTest extends BaseTest {

    @Test
    @DisplayName("Ссылки выпадающего списка 'Еще'")
    public void testClickTeachers(){
    HomePage homePage = new HomePage()
            .focusHeaderMenuMore()
            .clickHeaderMenuMoreTeachers();
    }
}
