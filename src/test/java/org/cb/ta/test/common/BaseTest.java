package org.cb.ta.test.common;

import com.aventstack.extentreports.ExtentReports;

import org.cb.ta.pages.HomePage;
import org.cb.ta.pages.VehicleFleet;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;

import java.time.Duration;
import java.util.Set;

public class BaseTest {
    protected WebDriver driver;
    protected WebDriverWait webDriverWait;
    protected Actions action;
    protected HomePage homePage;
    protected VehicleFleet vehicle;
    protected TestListener listener;


    public BaseTest() {
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        this.webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(3));
        this.action = new Actions(driver);
        homePage = new HomePage(driver);
        vehicle = new VehicleFleet(driver);
        vehicle.navigate();
        homePage.navigate();

    }
}
