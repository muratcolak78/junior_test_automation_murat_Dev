package org.cb.ta.test.exclude;

import org.cb.ta.pages.Service;
import org.cb.ta.test.common.BaseTest;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.*;

@Listeners(org.cb.ta.test.common.TestListener.class)
public class TestSevice extends BaseTest {

    Service service = new Service(driver);

    @BeforeMethod
    public void beforeMethod() {
        service.getServices().click();
    }

    @Test(priority = 10)
    public void isServiceSubmenuDisabled() {
        Assert.assertTrue(service.getSubMenu().isDisplayed());
    }

    @Test(priority = 20)
    public void serviceStorage() {
        service.getServiceStorage().click();
        Assert.assertTrue(driver.getCurrentUrl().equals("https://viaporttrans.com/storage-2/"));
    }

    @Test(priority = 21)
    public void storageGoogleMaps() {
        System.out.println(driver.getCurrentUrl());
        service.getGoogleMaps().isDisplayed();
        System.out.println(service.getGoogleMaps().getCssValue("border"));
        System.out.println(service.getGoogleMaps().getAttribute("allowfullscreen"));
        Assert.assertTrue(service.getGoogleMaps().isDisplayed());
    }

    @Test(priority = 30)
    public void serviceLogistic() {
        service.getServiceLogistic().click();
        Assert.assertTrue(driver.getCurrentUrl().equals("https://viaporttrans.com/logistic-2/"));
    }

    @Test(priority = 31)
    public void serviceLogisticContactUs() {
        System.out.println(driver.getCurrentUrl());
        webDriverWait.until(ExpectedConditions.visibilityOf(service.getContactus()));
        service.getContactus().click();
        Assert.assertTrue(driver.getCurrentUrl().equals("https://viaporttrans.com/contact-us/"));

    }

    @Test(priority = 32)
    public void serviceLogisticGoogleMaps() {
        action.moveToElement(service.getServiceLogistic()).build().perform();
        service.getServiceLogistic().click();
        service.getGoogleMaps().isDisplayed();
        System.out.println(service.getGoogleMaps().getCssValue("border"));
        System.out.println(service.getGoogleMaps().getAttribute("allowfullscreen"));
        Assert.assertTrue(service.getGoogleMaps().isDisplayed());
    }

    @Test(priority = 40)
    public void serviceTransport() {
        action.moveToElement(service.getSubMenu()).build().perform();
        service.getServiceTransport().click();
        Assert.assertTrue(driver.getCurrentUrl().equals("https://viaporttrans.com/transport/"));
    }

    @Test(priority = 41)
    public void serviceTransportContactUs() {
        System.out.println(driver.getCurrentUrl());
        webDriverWait.until(ExpectedConditions.visibilityOf(service.getContactus()));
        service.getContactus().click();
        Assert.assertTrue(driver.getCurrentUrl().equals("https://viaporttrans.com/contact-us/"));

    }

    @Test(priority = 42)
    public void serviceTransportGoogleMaps() {
        System.out.println(driver.getCurrentUrl());;
        service.getGoogleMaps().isDisplayed();
        System.out.println(service.getGoogleMaps().getCssValue("border"));
        System.out.println(service.getGoogleMaps().getAttribute("allowfullscreen"));
        Assert.assertTrue(service.getGoogleMaps().isDisplayed());
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }


}
