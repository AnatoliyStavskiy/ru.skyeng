package ru.skyeng.ui.util;

import org.openqa.selenium.WebDriver;

import java.util.Set;

public class CheckLink {
    private WebDriver driver;

    public CheckLink(WebDriver driver) {
        this.driver = driver;
    }

    public void switchToWindow(WebDriver driver) {
        String actualWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        for (String windowHandle : allWindows) {
            if (!windowHandle.equals(actualWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
    }

    public String getActualLink() {
        switchToWindow(driver);
        return driver.getCurrentUrl();
    }
}
