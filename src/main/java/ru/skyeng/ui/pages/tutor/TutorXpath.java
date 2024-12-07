package ru.skyeng.ui.pages.tutor;

public class TutorXpath {
    public static final String LEVEL_XPATH = "/html[1]/body[1]/skyeng-ff[1]/div[1]/repetitors-catalog-landing[1]/div[1]/div[2]/div[1]/div[2]/div[1]/repetitors-catalog-filters[1]/div[1]/div[2]/div[1]/div[1]/div[1]/repetitors-catalog-common-filters[1]/div[1]/repetitors-catalog-filter-control[1]/div[1]/div[2]/button[1]";
    public static final String CHECK_LEVEL_XPATH = "//button[contains(text(),'Beginner Английский с нуля')]";
    public static final String BEGINNER_LEVEL_XPATH = "//em[contains(text(),'Английский с нуля')]";
    public static final String CSS_XPATH = "div[class='control -adults -clearable -empty -open'] li:nth-child(1) span:nth-child(1)";
    public static final String ELEMENTARY_LEVEL_XPATH = "//span[normalize-space()='Elementary']";
    public static final String PRE_INTERMEDIATE_LEVEL_XPATH = "//span[normalize-space()='Pre-intermediate']";
    public static final String INTERMEDIATE_LEVEL_XPATH = "//span[normalize-space()='Intermediate']";
    public static final String UPPER_INTERMEDIATE_LEVEL_XPATH = "//span[normalize-space()='Upper-intermediate']";
    public static final String ADVANCED_LEVEL_XPATH = "//span[normalize-space()='Advanced']";


    public static final String TARGET_XPATH = "//div[@class='ng-star-inserted']//div[2]//repetitors-catalog-filter-control[1]//div[1]//div[2]//button[1]";
    public static final String TALK_ENGLISH_TARGET_XPATH = "//span[contains(text(),'Разговорный английский')]";
    public static final String BUSINESS_ENGLISH_TARGET_XPATH = "//span[contains(text(),'Бизнес-английский')]";
    public static final String PREPARATION_EXAM_TARGET_XPATH = "//span[contains(text(),'Подготовиться к экзамену')]";
    public static final String TRAVEL_ENGLISH_TARGET_XPATH = "//span[contains(text(),'Использовать язык в путешествиях')]";
    public static final String PREPARATION_INTERVIEW_TARGET_XPATH = "//span[contains(text(),'Подготовиться к собеседованию')]";
    public static final String OVERCOME_BARRIER_TARGET_XPATH = "//span[contains(text(),'Преодолеть языковой барьер')]";

    public static final String TYPE_TEACHER_XPATH = "//div[3]//repetitors-catalog-filter-control[1]//div[1]//div[2]//button[1]";
    public static final String RUSSIAN_SPEAKING_TEACHER_XPATH = "//span[contains(text(),'Русскоязычные')]";
    public static final String PREMIUM_TEACHER_XPATH = "//span[@class='link'][contains(text(),'Премиум')]";
    public static final String ENGLISH_SPEAKING_TEACHER_XPATH = "//span[contains(text(),'Англоязычные')]";


    public static final String CITY_INPUT_XPATH = "//input[@placeholder='Поиск города']";

    public static final String SCHEDULE_XPATH = "//repetitors-catalog-filter-control[@class='ng-untouched ng-pristine ng-valid']//button[@type='button'][contains(text(),'Не выбрано')]";
    public static final String WEEK_DAYS_SCHEDULE_XPATH = "//div[@class='filter ng-star-inserted']//li[1]//span[2]";
    public static final String WEEKEND_XPATH = "//div[@class='filter ng-star-inserted']//li[2]//span[2]";
    public static final String MORNING_XPATH = "//div[@class='filter ng-star-inserted']//li[3]//span[2]";
    public static final String DAY_XPATH = "//div[@class='filter ng-star-inserted']//li[4]//span[2]";
    public static final String EVENING_XPATH = "//div[@class='filter ng-star-inserted']//li[5]//span[2]";

    public static final String CLOSE_BANNER_DIV = "//button[@class='central-banner-close']//*[name()='svg']//*[name()='path' and contains(@fill-rule,'evenodd')]";
}