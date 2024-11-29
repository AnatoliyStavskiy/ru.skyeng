package ru.skyeng.ui.pages.home;

public class HomePageXpath {
    public static final String HEADER_SKYENG_LOGO = "//a[@routerlink='/']";
    public static final String HEADER_MENU_ADULTS = "//span[text()='Взрослым']";
    public static final String HEADER_MENU_TUTORS = "//a[@href='https://skyeng.ru/teachers/?from=main_new_menu']";
    public static final String HEADER_MENU_CERTIFICATES = "//a[@href='https://skyeng.ru/certificate-adults/?source=main&product=certificate']";
    public static final String HEADER_MENU_CAREER_GUIDANCE_IT = "//a[@href='https://sky.pro/test-na-proforientaciyu?utm_source=skyeng_base&\n" +
            "utm_medium=free&utm_campaign=n_skyeng_header|pr_30|fu_product|ma_kumykova|own_b2c|cnt_RU|br_Skypro|chg_cross_sell|dt_22-06-2024']";
    public static final String HEADER_MENU_ONLINE_TEST = "//a[@href='https://magazine.skyeng.ru/englishlevel-adult/?_ga=2.15416895.84135231.1644213687-137537265.1636366457&from=main_new_menu']";
    public static final String HEADER_MENU_MORE = "//span[text()='Ещё']";
    public static final String HEADER_MENU_TEACHERS = "//a[@href='https://job.skyeng.ru/english-teachers?utm_source=skyeng&utm_medium=newbutton&utm_campaign=headerprepfromskyeng']";
    public static final String HEADER_MENU_MORE_TEACHERS = "//div[@class='header-menu-content ng-tns-c1903745324-0']//a[@class='simple-menu-item-link ng-star-inserted'][contains(text(),'Учителям')]";
    public static final String HEADER_MENU_COURSES = "//a[@href='https://sky.pro/courses']";
    public static final String HEADER_MENU_OTHER_COURSES = "//div[@class='header-menu-content ng-tns-c1903745324-0']//a[@class='simple-menu-item-link ng-star-inserted'][contains(text(),'Другие курсы')]";

    public static final String LOGIN = "//button[@data-testid='cms-header-login']";
    public static final String SIGN_UP_FOR_LESSON = "//button[@data-testid='cms-header-register']";

    public static final String ACCEPT_COOKIE = "//div[@class='btn-ok']";
    public static final String CLOSE_CENTRAL_BANNER = "//button[@class='central-banner-close']";
}
