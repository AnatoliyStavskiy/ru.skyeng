package ru.skyeng.ui;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import ru.skyeng.ui.driver.Driver;

public class BaseTest {

    @BeforeEach
    public void startFromHome() {
        Driver.getDriver().get("https://skyeng.ru/");
    }

    @AfterEach
    public void tearDown() {
        Driver.quit();
    }
}
