package org.cb.ta.test.ViaPort;

import org.cb.ta.pages.ContactUs;
import org.cb.ta.pages.Search;
import org.cb.ta.test.common.BaseTest;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(org.cb.ta.test.common.TestListener.class)
public class TestSearch extends BaseTest {
    Search search=new Search(driver);

    @BeforeMethod
    public void beforeMethod() {
        search.getHomePage().click();
    }

   @Test(priority = 10)
   public void homePageIsSearchDisplayed(){
        Assert.assertTrue(search.getSearch().isDisplayed());
   }
    @Test(priority = 11)
    public void homePageIsSearchBoxDisplayed(){
        search.getSearch().click();
        Assert.assertTrue(search.getSearchTextBox().isDisplayed());
    }
    @Test(priority = 12)
    public void homePageIsWritable(){
        String key="about";
        search.getSearch().click();
        search.getSearchTextBox().sendKeys(key,Keys.ENTER);
        Assert.assertTrue(driver.getCurrentUrl().equals("https://viaporttrans.com/?s="+key));
    }
    @Test(priority = 20)
    public void vehicleFleetIsSearchDisplayed(){
        search.getVehicleFleet().click();
        Assert.assertTrue(search.getSearch().isDisplayed());
    }
    @Test(priority = 21)
    public void vehicleFleetIsSearchBoxDisplayed(){
        search.getVehicleFleet().click();
        search.getSearch().click();
        Assert.assertTrue(search.getSearchTextBox().isDisplayed());
    }
    @Test(priority = 22)
    public void vehicleFleetIsWritable(){
        search.getVehicleFleet().click();
        String key="about";
        webDriverWait.until(ExpectedConditions.urlContains("https://viaporttrans.com/vehicle-fleet/"));
        search.getSearch().click();
        search.getSearchTextBox().sendKeys(key,Keys.ENTER);
        Assert.assertTrue(driver.getCurrentUrl().equals("https://viaporttrans.com/?s="+key));
    }
    @Test(groups = {""},priority = 30)
    public void serviceStorageIsSearchDisplayed(){
      search.getServices().click();
        webDriverWait.until(ExpectedConditions.visibilityOf(search.getServiceStorage()));
        action.moveToElement(search.getServiceStorage());
        search.getServiceStorage().click();
        webDriverWait.until(ExpectedConditions.urlContains("https://viaporttrans.com/storage-2/"));
        Assert.assertTrue(search.getSearch().isDisplayed());
    }
    @Test(groups = {""},priority = 31)
    public void serviceStoragesSearchBoxDisplayed(){
       search.getServices().click();
        webDriverWait.until(ExpectedConditions.visibilityOf(search.getServiceStorage()));
        action.moveToElement(search.getServiceStorage());
        search.getServiceStorage().click();
        webDriverWait.until(ExpectedConditions.urlContains("https://viaporttrans.com/storage-2/"));
        search.getSearch().click();
        webDriverWait.until(ExpectedConditions.visibilityOf(search.getSearchTextBox()));
        Assert.assertTrue(search.getSearchTextBox().isDisplayed());
    }
    @Test(groups = {""},priority = 32)
    public void serviceStorageIsWritable(){
        search.getServices().click();
        search.getServices().click();
        webDriverWait.until(ExpectedConditions.visibilityOf(search.getServiceStorage()));
        action.moveToElement(search.getServiceStorage());
        search.getServiceStorage().click();
        webDriverWait.until(ExpectedConditions.urlContains("https://viaporttrans.com/storage-2/"));
        System.out.println(driver.getCurrentUrl());
        String key="about";
        search.getSearch().click();
        search.getSearchTextBox().sendKeys(key,Keys.ENTER);
        Assert.assertTrue(driver.getCurrentUrl().equals("https://viaporttrans.com/?s="+key));
    }
    @Test(groups = {""},priority = 40)
    public void serviceLogisticIsSearchDisplayed(){
        action.moveToElement(search.getVehicleFleet());
        action.moveToElement(search.getServices());
        search.getServices().click();
        webDriverWait.until(ExpectedConditions.urlContains("https://viaporttrans.com/#"));
        action.moveToElement(search.getServiceLogistic());
        search.getServiceLogistic().click();
        webDriverWait.until(ExpectedConditions.urlContains("https://viaporttrans.com/logistic-2/"));
        Assert.assertTrue(search.getSearch().isDisplayed());
    }
    @Test(groups = {""},priority = 41)
    public void serviceLogisticSearchBoxDisplayed(){
        action.moveToElement(search.getVehicleFleet());
        action.moveToElement(search.getServices());
       search.getServices().click();
        webDriverWait.until(ExpectedConditions.visibilityOf(search.getServiceLogistic()));
        action.moveToElement(search.getServiceLogistic());
        search.getServiceLogistic().click();
        webDriverWait.until(ExpectedConditions.urlContains("https://viaporttrans.com/logistic-2/"));
        search.getSearch().click();
        webDriverWait.until(ExpectedConditions.visibilityOf(search.getSearchTextBox()));
        Assert.assertTrue(search.getSearchTextBox().isDisplayed());
    }
    @Test(groups = {""},priority = 42)
    public void serviceLogisticIsWritable(){
        action.moveToElement(search.getVehicleFleet());
        action.moveToElement(search.getServices());
        search.getServices().click();
        webDriverWait.until(ExpectedConditions.visibilityOf(search.getServiceLogistic()));
        action.moveToElement(search.getServiceLogistic());
        search.getServiceLogistic().click();
        webDriverWait.until(ExpectedConditions.urlContains("https://viaporttrans.com/logistic-2/"));
        System.out.println(driver.getCurrentUrl());
        String key="about";
        search.getSearch().click();
        search.getSearchTextBox().sendKeys(key,Keys.ENTER);
        Assert.assertTrue(driver.getCurrentUrl().equals("https://viaporttrans.com/?s="+key));
    }
    @Test(priority = 50)
    public void serviceTransportIsSearchDisplayed(){
        action.moveToElement(search.getVehicleFleet());
        action.moveToElement(search.getServices());
        search.getServices().click();
        webDriverWait.until(ExpectedConditions.visibilityOf(search.getServiceTransport()));
        action.moveToElement(search.getServiceTransport());
        search.getServiceTransport().click();
        webDriverWait.until(ExpectedConditions.urlContains("https://viaporttrans.com/transport/"));
        Assert.assertTrue(search.getSearch().isDisplayed());
    }
    @Test(priority = 51)
    public void serviceTransportSearchBoxDisplayed(){
        action.moveToElement(search.getVehicleFleet());
        action.moveToElement(search.getServices());
        search.getServices().click();
        webDriverWait.until(ExpectedConditions.visibilityOf(search.getServiceTransport()));
        action.moveToElement(search.getServiceTransport());
        search.getServiceTransport().click();
        webDriverWait.until(ExpectedConditions.urlContains("https://viaporttrans.com/transport/"));
        search.getSearch().click();
        webDriverWait.until(ExpectedConditions.visibilityOf(search.getSearchTextBox()));
        Assert.assertTrue(search.getSearchTextBox().isDisplayed());
    }
    @Test(priority = 52)
    public void serviceTransportIsWritable(){
        action.moveToElement(search.getVehicleFleet());
        action.moveToElement(search.getServices());
        search.getServices().click();
        webDriverWait.until(ExpectedConditions.visibilityOf(search.getServiceTransport()));
        action.moveToElement(search.getServiceTransport());
        search.getServiceTransport().click();
        webDriverWait.until(ExpectedConditions.urlContains("https://viaporttrans.com/transport/"));
        System.out.println(driver.getCurrentUrl());
        String key="about";
        search.getSearch().click();
        search.getSearchTextBox().sendKeys(key,Keys.ENTER);
        Assert.assertTrue(driver.getCurrentUrl().equals("https://viaporttrans.com/?s="+key));
    }
    @Test(groups = {""},priority = 60)
    public void aboutUsIsSearchDisplayed(){
        search.getAboutUs().click();
        webDriverWait.until(ExpectedConditions.urlContains("https://viaporttrans.com/about-us/"));
        Assert.assertTrue(search.getSearch().isDisplayed());
    }
    @Test(groups = {""},priority = 61)
    public void aboutUsSearchBoxDisplayed(){
        search.getAboutUs().click();
        webDriverWait.until(ExpectedConditions.urlContains("https://viaporttrans.com/about-us/"));
        search.getSearch().click();
        webDriverWait.until(ExpectedConditions.visibilityOf(search.getSearchTextBox()));
        Assert.assertTrue(search.getSearchTextBox().isDisplayed());
    }
    @Test(groups = {""},priority = 62)
    public void aboutUsIsWritable(){
        search.getAboutUs().click();
        webDriverWait.until(ExpectedConditions.urlContains("https://viaporttrans.com/about-us/"));
        System.out.println(driver.getCurrentUrl());
        String key="about";
        search.getSearch().click();
        search.getSearchTextBox().sendKeys(key,Keys.ENTER);
        Assert.assertTrue(driver.getCurrentUrl().equals("https://viaporttrans.com/?s="+key));
    }
    @Test(groups = {""},priority = 70)
    public void contactUsIsSearchDisplayed(){
        search.getContactUs().click();
        webDriverWait.until(ExpectedConditions.urlContains("https://viaporttrans.com/contact-us/"));
        Assert.assertTrue(search.getSearch().isDisplayed());
    }
    @Test(groups = {""},priority = 71)
    public void contactUsSearchBoxDisplayed(){
        search.getContactUs().click();
        webDriverWait.until(ExpectedConditions.urlContains("https://viaporttrans.com/contact-us/"));
        search.getSearch().click();
        webDriverWait.until(ExpectedConditions.visibilityOf(search.getSearchTextBox()));
        Assert.assertTrue(search.getSearchTextBox().isDisplayed());
    }
    @Test(groups = {""},priority = 72)
    public void contactUsIsWritable(){
        search.getContactUs().click();
        webDriverWait.until(ExpectedConditions.urlContains("https://viaporttrans.com/contact-us/"));
        System.out.println(driver.getCurrentUrl());
        String key="about";
        search.getSearch().click();
        search.getSearchTextBox().sendKeys(key,Keys.ENTER);
        Assert.assertTrue(driver.getCurrentUrl().equals("https://viaporttrans.com/?s="+key));
    }
    @AfterClass
    public void afterClass() {
        driver.quit();
    }


}
