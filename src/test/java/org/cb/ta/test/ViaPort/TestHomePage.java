package org.cb.ta.test.ViaPort;

import org.cb.ta.pages.HomePage;
import org.cb.ta.test.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestHomePage extends BaseTest {
    HomePage home=new HomePage(driver);

    @BeforeClass
    public void beforeClass() {
        driver.get("https://viaporttrans.com/");
    }


    @BeforeMethod
    public void beforeMethod() throws InterruptedException {
        home.getHomePage().click();
    }


    @Test(groups = {"slide"})
    public void Case_Homepage_0010_Slider() {
        webDriverWait.until(ExpectedConditions.urlContains(home.getSlider().getText()));
        Assert.assertTrue(home.getSlider().isDisplayed());

    }

    @Test(groups = {"slide"}, priority = 11, enabled = true)
    public void Case_Homepage_0010_Slider_FirstSlideRight() {
        for (int i = 0; i < 3; i++) {
            home.getRigthArrow().click();
            webDriverWait.until(ExpectedConditions.urlContains(home.getRigthArrow().getText()));
            Assert.assertTrue(home.getRigthArrow().isEnabled());
        }
    }

    @Test(groups = {"slide"}, priority = 12, enabled = true)
    public void Case_Homepage_0020_Slider_FirstSlideLeft() {
        for (int i = 0; i < 3; i++) {
            home.getLeftArrow().click();
            Assert.assertTrue(home.getLeftArrow().isEnabled());
        }
    }

    @Test(groups = {"slide"}, priority = 20, enabled = true)
    public void Case_Homepage_0030_SliderLeft() throws InterruptedException {

        action.moveToElement(home.getLeftArrow()).build().perform();
        Thread.sleep(2000);
        Assert.assertTrue(home.getLeftArrow().isDisplayed());
    }

    @Test(groups = {"slide"}, priority = 30, enabled = true)
    public void Case_Homepage_0030_SliderRight() throws InterruptedException {
        action.moveToElement(home.getRigthArrow()).build().perform();
        Thread.sleep(2000);
        Assert.assertTrue(home.getRigthArrow().isDisplayed());

    }

    @Test(groups = {"header"}, priority = 40, enabled = true)
    public void Case_Homepage_40_Site_Logo() throws InterruptedException {
        home.getLogo().click();
        Assert.assertEquals(driver.getCurrentUrl().equals("https://viaporttrans.com/"), true);

    }

    @Test(groups = {"header"}, priority = 51, enabled = true)
    public void Case_Homepage_0051_Nav_Bar_Home() throws InterruptedException {
        home.getHomePage().click();
        Assert.assertEquals(driver.getCurrentUrl().equals("https://viaporttrans.com/"), true);


    }

    @Test(groups = {"header"}, priority = 52, enabled = true)
    public void Case_Homepage_0052_Nav_Bar_VehicleFleet() throws InterruptedException {
        action.moveToElement(home.getVehicleFleet()).build().perform();
        home.getVehicleFleet().click();
        Assert.assertTrue(driver.getCurrentUrl().equals("https://viaporttrans.com/vehicle-fleet/"));
    }

    @Test(groups = {"header"}, priority = 53, enabled = true)
    public void Case_Homepage_0053_Nav_Bar_Service() throws InterruptedException {
        home.getServices().click();
        action.moveToElement(home.getServices()).build().perform();
        Thread.sleep(1000);
        home.getSubMenu();
        Assert.assertTrue(home.getSubMenu().isDisplayed());
    }

    @Test(groups = {"header"}, priority = 54, enabled = true)
    public void Case_Homepage_0054_Nav_Bar_AboutUs() throws InterruptedException {
        home.getAboutUs().click();
        Assert.assertTrue(driver.getCurrentUrl().equals("https://viaporttrans.com/about-us/"));
    }

    @Test(groups = {"header"}, priority = 55, enabled = true)
    public void Case_Homepage_0055_Nav_Bar_ContactUs() throws InterruptedException {
        home.getContactUs().click();
        Assert.assertTrue(driver.getCurrentUrl().equals("https://viaporttrans.com/contact-us/"));
    }

    @Test(groups = {"header"}, priority = 56, enabled = true)
    public void Case_Homepage_0056_Nav_Bar_Search() throws InterruptedException {
        home.getSearch().click();
        home.getSearchTextBox();
        Assert.assertTrue(home.getSearchTextBox().isDisplayed());
    }

    @Test(groups = {"header"}, priority = 57, enabled = true)
    public void Case_Homepage_0057_Nav_Bar_SearchEnterText() throws InterruptedException {
        home.getSearch().click();
        home.getSearchTextBox().sendKeys("About", Keys.ENTER);
        Thread.sleep(3000);
        String result = driver.findElement(By.xpath
                ("(//h2[@class='search-post-title'])[1]")).getText();
        System.out.println(result);
        Assert.assertTrue(result.equals("About us"));
    }


    @AfterClass
    public void afterClass() {
        driver.close();
    }
}
