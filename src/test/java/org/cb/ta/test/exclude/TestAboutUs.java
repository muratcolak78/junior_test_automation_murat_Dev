package org.cb.ta.test.exclude;

import org.cb.ta.pages.AboutUs;
import org.cb.ta.pages.VehicleFleet;
import org.cb.ta.test.common.BaseTest;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.*;

@Listeners(org.cb.ta.test.common.TestListener.class)
public class TestAboutUs extends BaseTest {
    AboutUs about = new AboutUs(driver);

    @BeforeMethod
    public void beforeMethod() {
        about.getAboutUs().click();
    }

    @Test(groups = {"Main"}, priority = 10)
    public void moreDetails1(){
        about.getMoreDetails1().click();
        Assert.assertTrue(driver.getCurrentUrl().equals("https://viaporttrans.com/about-us/"));
    }
    @Test(groups = {"Main"}, priority = 20)
    public void moreDetails2(){
        about.getMoreDetails2().click();
        Assert.assertTrue(driver.getCurrentUrl().equals("https://viaporttrans.com/about-us/"));
    }
    @Test(groups = {"Main"}, priority = 30)
    public void getAute(){
        about.getGetQuete().click();
        Assert.assertTrue(driver.getCurrentUrl().equals("https://viaporttrans.com/contact-us/"));
    }


    @AfterClass
    public void afterClass() {
        driver.quit();
    }


}
