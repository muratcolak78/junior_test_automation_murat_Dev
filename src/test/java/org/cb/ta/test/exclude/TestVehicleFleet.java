package org.cb.ta.test.exclude;

import org.cb.ta.pages.HomePage;
import org.cb.ta.pages.VehicleFleet;
import org.cb.ta.test.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

@Listeners(org.cb.ta.test.common.TestListener.class)
public class TestVehicleFleet extends BaseTest {
    VehicleFleet vehicle = new VehicleFleet(driver);

    @BeforeMethod
    public void beforeMethod() {
        vehicle.getVehicleFleet().click();
    }

    @AfterMethod
    public void aftermethod()  {

    }



    @AfterClass
    public void afterClass() {
        driver.quit();
    }

    @Test(groups = {"slide"})
    public void Picture_Gallery_30() throws InterruptedException {

        vehicle.getFirstPic().click();
        Assert.assertTrue(vehicle.getDisplay().getCssValue("display").equals("block"));
        afterslide();
    }

    @Test(groups = {"slide"})
    public void Picture_Gallery_31() {
        vehicle.getSecondPic().click();
        Assert.assertTrue(vehicle.getDisplay().getCssValue("display").equals("block"));
        afterslide();
    }

    @Test(groups = {"slide"})
    public void Picture_Gallery_32() {
        vehicle.getThirdPic().click();
        Assert.assertTrue(vehicle.getDisplay().getCssValue("display").equals("block"));
        afterslide();
    }

    @Test(groups = {"slide"})
    public void Picture_Gallery_33() {
        vehicle.getFourthPic().click();
        Assert.assertTrue(vehicle.getDisplay().getCssValue("display").equals("block"));
        afterslide();
    }

    @Test(groups = {"slide"})
    public void Picture_Gallery_34() {
        vehicle.getFifthPic().click();
        Assert.assertTrue(vehicle.getDisplay().getCssValue("display").equals("block"));
        afterslide();
    }

    @Test(groups = {"slide"})
    public void Picture_Gallery_35() {
        vehicle.getSixthPic().click();
        Assert.assertTrue(vehicle.getDisplay().getCssValue("display").equals("block"));
        afterslide();
    }

    @Test(groups = {"slide"})
    public void Picture_Gallery_36() {
        vehicle.getSeventhPic().click();
        Assert.assertTrue(vehicle.getDisplay().getCssValue("display").equals("block"));
        afterslide();
    }

    @Test(groups = {"slide"})
    public void Picture_Gallery_37() {
        vehicle.getEighthPic().click();
        Assert.assertTrue(vehicle.getDisplay().getCssValue("display").equals("block"));
        afterslide();
    }
//    @Test(groups = {"slide"})
//    public void Picture_Gallery_38() throws InterruptedException {
//        vehicle.getSeventhPic().click();
//        System.out.println(vehicle.getSlideMenu().getCssValue("display"));
//        System.out.println(vehicle.getLeftArrow().getAttribute("aria-label"));
//        webDriverWait.until(ExpectedConditions.visibilityOf(vehicle.getSlideMenu()));
//        action.moveToElement(vehicle.getSlideMenu()).build().perform();
//        Thread.sleep(3000);
//        vehicle.getRightArrow().click();
//
//        //driver.findElement(By.xpath("//*[@id=\"lightbox\"]/div[1]/div/div[1]/a[1]")).click();
//        //Assert.assertTrue(vehicle.getLeftArrow().isDisplayed());
//       // afterslide();
//        //*[@id="lightbox"]
//    }

    @Test(groups = {"Main"})
    public void getAQuete_40() {
        vehicle.getGetQueth().click();
        Assert.assertTrue(driver.getCurrentUrl().equals("https://viaporttrans.com/contact-us/"));

    }

    public void afterslide() {
        webDriverWait.until(ExpectedConditions.visibilityOf(vehicle.getClose()));
        vehicle.getClose().click();
    }
}
