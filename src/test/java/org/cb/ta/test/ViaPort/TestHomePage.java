package org.cb.ta.test.ViaPort;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.beust.ah.A;
import org.cb.ta.pages.HomePage;
import org.cb.ta.test.common.BaseTest;
import org.cb.ta.test.common.ReportManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

@Listeners(org.cb.ta.test.common.TestListener.class)
public class TestHomePage extends BaseTest {
    HomePage home = new HomePage(driver);


    @BeforeMethod
    public void beforeMethod() {
        home.getHomePage().click();

    }

    @AfterMethod
    public void getResult(ITestResult result) {

    }

    @AfterTest
    public void tearDown() {
        //to write or update test information to reporter
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }

    @Test(groups = {"header"}, priority = 51, enabled = true)
    public void Case_Homepage_0051_Nav_Bar_Home() {
        home.getHomePage().click();
        Assert.assertEquals(driver.getCurrentUrl().equals("https://viaporttrans.com/"), true);
    }

    @Test(groups = {"header"}, priority = 52, enabled = true)
    public void Case_Homepage_0052_Nav_Bar_VehicleFleet() {
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
    public void Case_Homepage_0054_Nav_Bar_AboutUs() {
        home.getAboutUs().click();
        Assert.assertTrue(driver.getCurrentUrl().equals("https://viaporttrans.com/about-us/"));
    }

    @Test(groups = {"header"}, priority = 55, enabled = true)
    public void Case_Homepage_0055_Nav_Bar_ContactUs() {
        home.getContactUs().click();
        Assert.assertTrue(driver.getCurrentUrl().equals("https://viaporttrans.com/contact-us/"));
    }

    @Test(groups = {"header"}, priority = 56, enabled = true)

    public void Case_Homepage_0056_Nav_Bar_Search() {
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

    @Test(groups = {"slide"})
    public void Case_Homepage_0010_Slider() {
        webDriverWait.until(ExpectedConditions.visibilityOf(home.getSlider()));
        Assert.assertTrue(home.getSlider().isDisplayed());
    }

    @Test(groups = {"slide"}, priority = 11, enabled = true)
    public void Case_Homepage_0010_Slider_FirstSlideRight() {
        for (int i = 0; i < 3; i++) {
            home.getRigthArrow().click();
            // webDriverWait.until(ExpectedConditions.visibilityOf(home.getRigthArrow()));
            Assert.assertTrue(home.getRigthArrow().isEnabled());
        }
    }

    @Test(groups = {"slide"}, priority = 12, enabled = true)
    public void Case_Homepage_0020_Slider_FirstSlideLeft() {
        for (int i = 0; i < 3; i++) {
            home.getLeftArrow().click();
            //webDriverWait.until(ExpectedConditions.visibilityOf(home.getLeftArrow()));
            Assert.assertTrue(home.getLeftArrow().isEnabled());
        }
    }

    @Test(groups = {"slide"}, priority = 30, enabled = true)
    public void Case_Homepage_0030_SliderLeft() {

        action.moveToElement(home.getLeftArrow()).build().perform();
        webDriverWait.until(ExpectedConditions.visibilityOf(home.getLeftArrow()));
        Assert.assertTrue(home.getLeftArrow().isDisplayed());
    }

    @Test(groups = {"slide"}, priority = 31, enabled = true)
    public void Case_Homepage_0031_SliderRight() {
        action.moveToElement(home.getRigthArrow()).build().perform();
        webDriverWait.until(ExpectedConditions.visibilityOf(home.getRigthArrow()));
        Assert.assertTrue(home.getRigthArrow().isDisplayed());

    }

    @Test(groups = {"slide"}, priority = 32)
    public void Case_32_FirstGetAQuoteButtons() {
        home.getHomePage().click();
        webDriverWait.until(ExpectedConditions.visibilityOf(home.getGetAQuote()));
        home.getGetAQuote().click();
        Assert.assertTrue(driver.getCurrentUrl().equals("https://viaporttrans.com/contact-us/"));
        System.out.println(driver.getCurrentUrl());

    }

    @Test(groups = {"slide"}, priority = 33)
    public void Case_33_SecondGetAQuoteButtons() {
        home.getHomePage().click();
        //webDriverWait.until(ExpectedConditions.visibilityOf(home.getGetAQuote2()));
        action.moveToElement(home.getLeftArrow()).build().perform();
        home.getLeftArrow().click();
        webDriverWait.until(ExpectedConditions.visibilityOf(home.getGetAQuote2()));
        home.getGetAQuote2().click();
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().equals("https://viaporttrans.com/contact-us/"));
        System.out.println(driver.getCurrentUrl());


    }

    @Test(groups = {"slide"}, priority = 34)
    public void Case_34_ThirdGetAQuoteButtons() {
        home.getHomePage().click();
        action.moveToElement(home.getRigthArrow()).build().perform();
        home.getRigthArrow().click();
        webDriverWait.until(ExpectedConditions.visibilityOf(home.getGetAQuote3()));
        home.getGetAQuote3().click();
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().equals("https://viaporttrans.com/contact-us/"));
        System.out.println(driver.getCurrentUrl());
    }

    @Test(groups = {"header"}, priority = 40, enabled = true)
    public void Case_Homepage_40_Site_Logo() throws InterruptedException {
        home.getLogo().click();
        webDriverWait.until(ExpectedConditions.visibilityOf(home.getLogo()));
        Assert.assertEquals(driver.getCurrentUrl().equals("https://viaporttrans.com/"), true);

    }


    @Test(groups = {"Main"}, priority = 61)
    public void Case_0061_Other_Service_Pages() {
        home.getReadmore1().click();
        Assert.assertTrue(driver.getCurrentUrl().equals("https://viaporttrans.com/storage-2/"));

    }

    @Test(groups = {"Main"}, priority = 62)
    public void Case_0062_Other_Service_Pages() {
        home.getHomePage().click();
        home.getReadmore2().click();
        Assert.assertTrue(driver.getCurrentUrl().equals("https://viaporttrans.com/logistic-2/"));

    }

    @Test(groups = {"Main"}, priority = 63)
    public void Case_0063_Other_Service_Pages() {
        home.getHomePage().click();
        home.getReadmore3().click();
        Assert.assertTrue(driver.getCurrentUrl().equals("https://viaporttrans.com/transport/"));
    }

    @Test(groups = {"Main"}, priority = 80)
    public void Case_80_Second_Contact_Us_Button() {
        home.getHomePage().click();
        home.getContactUs2().click();
        Assert.assertTrue(driver.getCurrentUrl().equals("https://viaporttrans.com/contact-us/"));
    }

    @Test(groups = {"Main"}, priority = 91)
    public void Case_0091_Other_Service_Pages() {
        home.getHomePage().click();
        home.getReadmore4().click();
        Assert.assertTrue(driver.getCurrentUrl().equals("https://viaporttrans.com/storage-2/"));

    }

    @Test(groups = {"Main"}, priority = 92)
    public void Case_0092_Other_Service_Pages() {
        home.getHomePage().click();
        home.getReadmore5().click();
        Assert.assertTrue(driver.getCurrentUrl().equals("https://viaporttrans.com/logistic-2/"));

    }

    @Test(groups = {"Main"}, priority = 93)
    public void Case_0093_Other_Service_Pages() {
        home.getHomePage().click();
        home.getReadmore6().click();
        Assert.assertTrue(driver.getCurrentUrl().equals("https://viaporttrans.com/transport/"));
    }

    @Test(groups = {"Main"}, priority = 100)
    public void Case_100_ViewAllServices() {
        home.getHomePage().click();
        home.getViewAllServices().click();
        Assert.assertTrue(driver.getCurrentUrl().equals("https://viaporttrans.com/transport/"));
    }

    @Test(groups = {"Main"}, priority = 110)
    public void Case_110_Third_Contact_Us_Button() {
        home.getHomePage().click();
        home.getContactUs3().click();
        Assert.assertTrue(driver.getCurrentUrl().equals("https://viaporttrans.com/contact-us/"));
    }

    @Test(groups = {"Main"}, priority = 120)
    public void Case_120__RequestFreeQuoteButton() {
        home.getHomePage().click();
        home.getRequestFreeQuote().click();
        Assert.assertTrue(driver.getCurrentUrl().equals("https://viaporttrans.com/contact-us/"));
    }

    @Test(groups = {"footer"}, priority = 141)
    public void Case_141_Footer_Menu_Thuis() {
        home.getThuis().click();
        Assert.assertTrue(driver.getCurrentUrl().equals("https://viaporttrans.com/"));
    }

    @Test(groups = {"footer"}, priority = 142)
    public void Case_142_Footer_Menu_Wagenpark() {
        home.getWagenPark().click();
        Assert.assertTrue(driver.getCurrentUrl().equals("https://viaporttrans.com/vehicle-fleet/"));
    }

    @Test(groups = {"footer"}, priority = 143)
    public void Case_143_Footer_Menu_Diensten() {
        home.getDiensten().click();
        Assert.assertTrue(driver.getCurrentUrl().equals("https://viaporttrans.com/storage-2/"));
    }

    @Test(groups = {"footer"}, priority = 144)
    public void Case_144_Footer_Menu_OverOns() {
        home.getOverOns().click();
        Assert.assertTrue(driver.getCurrentUrl().equals("https://viaporttrans.com/about-us/"));
    }

    @Test(groups = {"footer"}, priority = 145)
    public void Case_145_Footer_Neem_Contact_Op() {
        home.getNeemContactOp().click();
        Assert.assertTrue(driver.getCurrentUrl().equals("https://viaporttrans.com/contact-us/"));
    }

    @Test(groups = {"footer"}, priority = 146)
    public void Case_146_Footer_Neem_Contact_Op() {
        home.getOpslag().click();
        Assert.assertTrue(driver.getCurrentUrl().equals("https://viaporttrans.com/storage-2/"));
    }

    @Test(groups = {"footer"}, priority = 147)
    public void Case_147_Footer_Logistiek() {
        home.getLogistiek().click();
        Assert.assertTrue(driver.getCurrentUrl().equals("https://viaporttrans.com/logistic-2/"));
    }

    @Test(groups = {"footer"}, priority = 148)
    public void Case_148_Footer_Vervoer() {
        home.getVervoer().click();
        Assert.assertTrue(driver.getCurrentUrl().equals("https://viaporttrans.com/transport/"));
    }

    @Test(groups = {"footer"}, priority = 149)
    public void Case_149_Footer_Telefon() {
        home.getTelefon().click();
        Assert.assertTrue(driver.getCurrentUrl().equals("http://+320467745898/"));
        driver.get("https://viaporttrans.com/");
    }

    @Test(groups = {"footer"}, priority = 150)
    public void Case_150_Footer_BTW() {
        home.getBTW().click();
        Assert.assertFalse(driver.getCurrentUrl().isEmpty());
        driver.get("https://viaporttrans.com/");
    }


    @Test(groups = {"footer"}, priority = 170)
    public void Case_160_Footer_TranslateOptionsIsDisabled() throws InterruptedException {
        home.getTranslateOptions().click();
        Thread.sleep(2000);
        String display = home.getTranslateDisplay().getCssValue("display");
        System.out.println(display);
        Assert.assertTrue(display.equals("block"));

    }

    @Test(groups = {"footer"}, priority = 172)
    public void Case_161_Footer_TranslateOptionsIsWorking() throws InterruptedException {

        action.moveToElement(home.getTurkish()).build().perform();
        home.getTurkish().click();
        System.out.println(home.getTurkish().getAttribute("title"));
        System.out.println(home.getHomePage().getText());
        Assert.assertFalse(home.getHomePage().getText().equals("Anasayfa"));

    }

}
