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
    @DisplayName("Выбор уровня 'Beginner'")
    public void testClickBeginnerLevel() {
        TutorPage tutorPage = new TutorPage()
                .clickLevelFilter().clickBeginnerLevelFilter();
        Assertions.assertEquals(tutorPage.checkLevelFilter(), TutorFilterMessage.BEGINNER_MESSAGE);
    }

    @Test
    @DisplayName("Выбор уровня 'Elementary'")
    public void testClickElementaryLevel() {
        TutorPage tutorPage = new TutorPage()
                .clickLevelFilter().clickElementaryLevelFilter();
        Assertions.assertEquals(tutorPage.checkLevelFilter(), TutorFilterMessage.ELEMENTARY_MESSAGE);
    }

    @Test
    @DisplayName("Выбор уровня 'Pre-intermediate'")
    public void testClickPreIntermediateLevel() {
        TutorPage tutorPage = new TutorPage()
                .clickLevelFilter().clickPreIntermediateLevelFilter();
        Assertions.assertEquals(tutorPage.checkLevelFilter(), TutorFilterMessage.PRE_INTERMEDIATE_MESSAGE);
    }

    @Test
    @DisplayName("Выбор уровня 'Intermediate'")
    public void testClickIntermediateLevel() {
        TutorPage tutorPage = new TutorPage()
                .clickLevelFilter().clickIntermediateLevelFilter();
        Assertions.assertEquals(tutorPage.checkLevelFilter(), TutorFilterMessage.INTERMEDIATE_MESSAGE);
    }

    @Test
    @DisplayName("Выбор уровня 'Upper-intermediate'")
    public void testClickUpperIntermediateLevel() {
        TutorPage tutorPage = new TutorPage()
                .clickLevelFilter().clickUpperIntermediateLevelFilter();
        Assertions.assertEquals(tutorPage.checkLevelFilter(), TutorFilterMessage.UPPER_INTERMEDIATE_MESSAGE);
    }

    @Test
    @DisplayName("Выбор уровня 'Advanced'")
    public void testClickAdvancedLevel1() {
        TutorPage tutorPage = new TutorPage()
                .clickLevelFilter().clickAdvancedLevelFilter();
        Assertions.assertEquals(tutorPage.checkLevelFilter(), TutorFilterMessage.ADVANCED_MESSAGE);
    }

    @Test
    @DisplayName("Выбор цели 'Разговорный Английский'")
    public void testClickTalkEnglishTarget() {
        TutorPage tutorPage = new TutorPage()
                .clickTargetFilter().clickTalkEnglishTargetFilter();
        Assertions.assertEquals(tutorPage.checkTargetFilter(), TutorFilterMessage.TALK_ENGLISH_MESSAGE);
    }

    @Test
    @DisplayName("Выбор цели 'Бизнес Английский'")
    public void testClickBusinessEnglishTarget() {
        TutorPage tutorPage = new TutorPage()
                .clickTargetFilter().clickBusinessEnglishTargetFilter();
        Assertions.assertEquals(tutorPage.checkTargetFilter(), TutorFilterMessage.BUSINESS_ENGLISH_MESSAGE);
    }

    @Test
    @DisplayName("Выбор цели 'Подготовиться к экзамену'")
    public void testClickPreparationExamTarget() {
        TutorPage tutorPage = new TutorPage()
                .clickTargetFilter().clickPreparationExamTargetFilter();
        Assertions.assertEquals(tutorPage.checkTargetFilter(), TutorFilterMessage.PREPARATION_EXAM_MESSAGE);
    }

    @Test
    @DisplayName("Выбор цели 'Использовать язык для путешествия'")
    public void testClickTravelEnglishTarget() {
        TutorPage tutorPage = new TutorPage()
                .clickTargetFilter().clickTravelEnglishTargetFilter();
        Assertions.assertEquals(tutorPage.checkTargetFilter(), TutorFilterMessage.TRAVEL_ENGLISH_MESSAGE);
    }

    @Test
    @DisplayName("Выбор цели 'Подготовиться к собеседованию'")
    public void testClickPreparationInterviewTarget() {
        TutorPage tutorPage = new TutorPage()
                .clickTargetFilter().clickPreparationInterviewTargetFilter();
        Assertions.assertEquals(tutorPage.checkTargetFilter(), TutorFilterMessage.PREPARATION_INTERVIEW_MESSAGE);
    }

    @Test
    @DisplayName("Выбор цели 'Преодолеть языковой барьер'")
    public void testClickOvercomeBarrierTarget() {
        TutorPage tutorPage = new TutorPage()
                .clickTargetFilter().clickOvercomeBarrierTargetFilter();
        Assertions.assertEquals(tutorPage.checkTargetFilter(), TutorFilterMessage.OVERCOME_BARRIER_MESSAGE);
    }

    @Test
    @DisplayName("Выбор преподователя 'Рускоязычные'")
    public void testClickRussianSpeakingTeacher() {
        TutorPage tutorPage = new TutorPage()
                .clickTypeTeacher().clickRussianSpeakingTeacherFilter();
        Assertions.assertEquals(tutorPage.checkTypeTeacher(), TutorFilterMessage.RUSSIAN_SPEAKING_TEACHER_MESSAGE);
    }

    @Test
    @DisplayName("Выбор преподователя 'Премиум'")
    public void testClickPremiumTeacher() {
        TutorPage tutorPage = new TutorPage()
                .clickTypeTeacher().clickPremiumTeacherFilter();
        Assertions.assertEquals(tutorPage.checkTypeTeacher(), TutorFilterMessage.PREMIUM_TEACHER_MESSAGE);
    }

    @Test
    @DisplayName("Выбор преподователя 'Англоязычные'")
    public void testClickEnglishSpeakingTeacher() {
        TutorPage tutorPage = new TutorPage()
                .clickTypeTeacher().clickEnglishSpeakingTeacherFilter();
        Assertions.assertEquals(tutorPage.checkTypeTeacher(), TutorFilterMessage.ENGLISH_SPEAKING_TEACHER_MESSAGE);
    }

    @Test
    @DisplayName("Заполнение поля 'Город'")
    public void testInputCity() {
        TutorPage tutorPage = new TutorPage()
                .inputCity("Москва");
    }

    @Test
    @DisplayName("Выбор удобного расписания 'Будни'")
    public void testClickWeekDaysScheduleTeacher() {
        TutorPage tutorPage = new TutorPage()
                .clickScheduleFilter().clickWeekDaysScheduleFilter();
        Assertions.assertEquals(tutorPage.checkScheduleFilter(), TutorFilterMessage.WEEK_DAYS_SCHEDULE_MESSAGE);
    }

    @Test
    @DisplayName("Выбор удобного расписания 'Выходные'")
    public void testClickWeekendScheduleTeacher() {
        TutorPage tutorPage = new TutorPage()
                .clickScheduleFilter().clickWeekendScheduleFilter();
        Assertions.assertEquals(tutorPage.checkScheduleFilter(), TutorFilterMessage.WEEKEND_SCHEDULE_MESSAGE);
    }

    @Test
    @DisplayName("Выбор удобного расписания 'Утро'")
    public void testClickMorningScheduleTeacher() {
        TutorPage tutorPage = new TutorPage()
                .clickScheduleFilter().clickMorningScheduleFilter();
        Assertions.assertEquals(tutorPage.checkScheduleFilter(), TutorFilterMessage.MORNING_SCHEDULE_MESSAGE);
    }

    @Test
    @DisplayName("Выбор удобного расписания 'День'")
    public void testClickDayScheduleTeacher() {
        TutorPage tutorPage = new TutorPage()
                .clickScheduleFilter().clickDayScheduleFilter();
        Assertions.assertEquals(tutorPage.checkScheduleFilter(), TutorFilterMessage.DAY_SCHEDULE_MESSAGE);
    }

    @Test
    @DisplayName("Выбор удобного расписания 'Вечер'")
    public void testClickEveningScheduleTeacher() {
        TutorPage tutorPage = new TutorPage()
                .clickScheduleFilter().clickEveningScheduleFilter();
        Assertions.assertEquals(tutorPage.checkScheduleFilter(), TutorFilterMessage.EVENING_SCHEDULE_MESSAGE);
    }

    @Test
    @DisplayName("Подбор репетитор")
    public void selectionTutor() {
        TutorPage tutorPage = new TutorPage()
            .clickLevelFilter().clickBeginnerLevelFilter()
            .clickTargetFilter().clickBusinessEnglishTargetFilter()
            .clickTypeTeacher().clickRussianSpeakingTeacherFilter()
            .inputCity("Москва")
            .clickScheduleFilter().clickWeekendScheduleFilter();

        Assertions.assertEquals(tutorPage.checkFoundTutors(), TutorFilterMessage.FOUND_TUTORS_MESSAGE);
    }

    @AfterEach
    public void tearDown() {
        Driver.quit();
    }
}
