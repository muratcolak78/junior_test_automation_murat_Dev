package org.cb.ta.pages;

import org.cb.ta.test.common.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public static WebDriver driver;

    public BasePage() {
        driver = new ChromeDriver();
        driver.get("https://viaporttrans.com/");
    }
}
