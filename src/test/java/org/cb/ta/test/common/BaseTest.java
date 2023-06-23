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
    protected WebDriver driver;
    protected WebDriverWait webDriverWait;
    protected Actions action;
    protected TestListener listener;
    protected ITestContext context;
    protected Set<String> handles;
    protected JavascriptExecutor jsx;

    public BaseTest() {
        this.driver = new ChromeDriver();
        driver.get("https://viaporttrans.com/");
        this.webDriverWait =new WebDriverWait(driver,Duration.ofSeconds(3));
        this.action = new Actions(driver);
    }
}
