package org.cb.ta.test.common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.Set;

public class BaseTest {
    protected WebDriver driver=Driver.getDriver();
    protected WebDriverWait webDriverWait;
    protected Actions action;
    protected TestListener listener;
    protected ITestContext context;
    protected Set<String> handles;
    protected JavascriptExecutor jsx;

    @BeforeClass(enabled = false)
    public void init() {
        driver.get("https://viaporttrans.com/");
        action = new Actions(driver);
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        jsx = (JavascriptExecutor) driver;

    }



    @AfterClass(enabled = true)
    public void afterClass() throws InterruptedException {
        driver.quit();
    }
}
