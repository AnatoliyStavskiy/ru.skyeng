package ru.skyeng.ui;

import org.junit.jupiter.api.*;
import ru.skyeng.ui.driver.Driver;
import ru.skyeng.ui.pages.tutor.TutorFilterMessage;
import ru.skyeng.ui.pages.tutor.TutorPage;

public class TutorsPageTest {

    @BeforeEach
    public void setUp() {
        Driver.getDriver().get("https://skyeng.ru/teachers/?from=main_new_menu");
    }

    @Test
    @DisplayName("Выбор уровня Beginner")
    public void testClickBeginnerLevel(){
        TutorPage tutorPage = new TutorPage()
             .clickLevelFilter();
             tutorPage.clickBeginnerLevelFilter();
        Assertions.assertEquals(tutorPage.levelFilter(), TutorFilterMessage.BEGINNER_MESSAGE);
    }

    @Test
    @DisplayName("Выбор уровня Elementary")
    public void testClickElementaryLevel(){
        TutorPage tutorPage = new TutorPage();
        tutorPage.clickLevelFilter();
        tutorPage.clickElementaryLevelFilter();
        Assertions.assertEquals(tutorPage.levelFilter(), TutorFilterMessage.ELEMENTARY_MESSAGE);
    }

    @Test
    @DisplayName("Выбор уровня Pre-intermediate")
    public void testClickPreIntermediateLevel(){
        TutorPage tutorPage = new TutorPage();
        tutorPage.clickLevelFilter();
        tutorPage.clickPreIntermediateLevelFilter();
        Assertions.assertEquals(tutorPage.levelFilter(), TutorFilterMessage.PRE_INTERMEDIATE_MESSAGE);
    }

    @Test
    @DisplayName("Выбор уровня Intermediate")
    public void testClickIntermediateLevel(){
        TutorPage tutorPage = new TutorPage();
        tutorPage.clickLevelFilter();
        tutorPage.clickIntermediateLevelFilter();
        Assertions.assertEquals(tutorPage.levelFilter(), TutorFilterMessage.INTERMEDIATE_MESSAGE);
    }

    @Test
    @DisplayName("Выбор уровня Upper-intermediate")
    public void testClickUpperIntermediateLevel(){
        TutorPage tutorPage = new TutorPage();
        tutorPage.clickLevelFilter();
        tutorPage.clickUpperIntermediateLevelFilter();
        Assertions.assertEquals(tutorPage.levelFilter(), TutorFilterMessage.UPPER_INTERMEDIATE_MESSAGE);
    }

    @Test
    @DisplayName("Выбор уровня Advanced")
    public void testClickAdvancedLevel(){
        TutorPage tutorPage = new TutorPage();
        tutorPage.clickLevelFilter();
        tutorPage.clickAdvancedLevelFilter();
        Assertions.assertEquals(tutorPage.levelFilter(), TutorFilterMessage.ADVANCED_MESSAGE);
    }

    @AfterEach
    public void tearDown() {
        Driver.quit();
    }
}
