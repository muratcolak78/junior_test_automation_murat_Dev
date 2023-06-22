package org.cb.ta.pages;

import lombok.Getter;
import org.cb.ta.test.common.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Getter
public class HomePage extends BasePage {
    private Actions actions = new Actions(BasePage.driver);

    public HomePage() {

        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//*[@id=\"menu-main-menu\"]/li[2]/a")
    private WebElement vehicleFleet;
    @FindBy(xpath = "//*[@id=\"menu-main-menu\"]/li[3]/a")
    private WebElement services;
    @FindBy(xpath = "//*[@id=\"menu-main-menu\"]/li[3]/ul/li[1]/a")
    private WebElement serviceStorage;
    @FindBy(xpath = "//*[@id=\"menu-main-menu\"]/li[3]/ul/li[2]/a")
    private WebElement serviceLogistic;
    @FindBy(xpath = "//*[@id=\"menu-main-menu\"]/li[3]/ul/li[3]/a")
    private WebElement serviceTransport;
    @FindBy(xpath = "//*[@id=\"menu-main-menu\"]/li[4]/a")
    private WebElement AboutUs;
    @FindBy(xpath = "//*[@id=\"menu-main-menu\"]/li[5]/a")
    private WebElement ContactUs;
    @FindBy(xpath = "//button[@class='fa fa-search site-search-toggle']")
    private WebElement search;

    @FindBy(xpath = "//*[@id=\"rev_slider_2_1\"]/rs-slides")
    private WebElement slider;
    @FindBy(xpath = "//*[@id=\"rev_slider_2_1\"]/rs-arrow[2]")
    private WebElement rigthArrow;
    @FindBy(xpath = "//*[@id=\"rev_slider_2_1\"]/rs-arrow[1]")
    private WebElement leftArrow;
    @FindBy(xpath = "(//a[@href='https://viaporttrans.com/'])[1]")
    private WebElement logo;

    @FindBy(xpath = "//*[@id=\"top\"]/div/div/div[1]/a")
    private WebElement homePage;
    @FindBy(xpath = "//input[@name='s']")
    private WebElement searchTextBox;
    @FindBy(xpath = "//*[@id=\"menu-main-menu\"]/li[3]/ul")
    private WebElement subMenu;


}
