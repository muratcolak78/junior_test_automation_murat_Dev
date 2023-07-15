package org.cb.ta.test.exclude;

import org.cb.ta.pages.AboutUs;
import org.cb.ta.pages.ContactUs;
import org.cb.ta.test.common.BaseTest;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(org.cb.ta.test.common.TestListener.class)
public class TestContactUs extends BaseTest {
    ContactUs contact = new ContactUs(driver);

    @BeforeMethod
    public void beforeMethod() {
        contact.getContactUs().click();
    }

    @Test(groups = {"Main"}, priority = 10)
    public void fillForm1() throws InterruptedException {
        contact.getButtonSubmit().click();
       webDriverWait.until(ExpectedConditions.visibilityOf(contact.getLastMessage()));
        System.out.println(contact.getLastMessage().getText());
       Assert.assertTrue(contact.getLastMessage().getText().contains("Please confirm the fields"));

    }
    @Test(groups = {"Main"}, priority = 20)
    public void fillForm2()throws InterruptedException {
        contact.getName().click();
        action.sendKeys("name")
                .sendKeys(Keys.TAB)
                .sendKeys("subject")
                .sendKeys(Keys.TAB)
                .sendKeys("abcde@gmail.com")
                .sendKeys(Keys.TAB)
                .sendKeys("message")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .build().perform();
        contact.getButtonSubmit().click();
        webDriverWait.until(ExpectedConditions.visibilityOf(contact.getLastMessage()));
        System.out.println(contact.getLastMessage().getText());

        Assert.assertTrue(contact.getLastMessage().getText().contains("Failed to send your message"));

    }
    @Test
    public void googleMaps() {
        contact.getGoogleMaps().isDisplayed();
        System.out.println(vehicle.getGoogleMaps().getCssValue("border"));
        System.out.println(vehicle.getGoogleMaps().getAttribute("allowfullscreen"));
        Assert.assertTrue(vehicle.getGoogleMaps().isDisplayed());
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }


}
