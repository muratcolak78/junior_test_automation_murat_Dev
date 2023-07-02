package org.cb.ta.pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
        this.baseURL = "https://viaporttrans.com/";
        PageFactory.initElements(driver, this);
    }

    public void navigate() {
        driver.get(baseURL);
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
    @FindBy(xpath = "//*[@id=\"rev_slider_2_1_forcefullwidth\"]")
    private WebElement slider;
    @FindBy(xpath = "//*[@id=\"rev_slider_2_1\"]/rs-arrow[2]")
    private WebElement rigthArrow;
    @FindBy(xpath = "//*[@id=\"rev_slider_2_1\"]/rs-arrow[1]")
    private WebElement leftArrow;
    @FindBy(xpath = "(//a[@href='https://viaporttrans.com/'])[1]")
    private WebElement logo;
    @FindBy(xpath = "//*[@id=\"menu-main-menu\"]/li[1]/a")
    private WebElement homePage;
    @FindBy(xpath = "//input[@name='s']")
    private WebElement searchTextBox;
    @FindBy(xpath = "//*[@id=\"menu-main-menu\"]/li[3]/ul")
    private WebElement subMenu;
    @FindBy(xpath = "//*[@id=\"custom-id-0\"]")
    private WebElement readmore1;
    @FindBy(xpath = "//*[@id=\"custom-id-1\"]")
    private WebElement readmore2;
    @FindBy(xpath = "//*[@id=\"custom-id-2\"]")
    private WebElement readmore3;
    @FindBy(xpath = "//*[@id=\"custom-id-3\"]")
    private WebElement ContactUs2;
    @FindBy(xpath = "//*[@id=\"custom-id-4\"]")
    private WebElement readmore4;
    @FindBy(xpath = "//*[@id=\"custom-id-5\"]")
    private WebElement readmore5;
    @FindBy(xpath = "//*[@id=\"custom-id-6\"]")
    private WebElement readmore6;
    @FindBy(xpath = "(//a[@href=\"https://viaporttrans.com/transport/\"])[4]")
    private WebElement viewAllServices;
    @FindBy(xpath = "//*[@id=\"custom-id-7\"]")
    private WebElement ContactUs3;
    @FindBy(xpath = "//*[@id=\"custom-id-8\"]")
    private WebElement requestFreeQuote;
    @FindBy(xpath = "//*[@id=\"text-7\"]/div/ul/li[1]/a")
    private WebElement thuis;
    @FindBy(xpath = "//*[@id=\"text-7\"]/div/ul/li[2]/a")
    private WebElement wagenPark;
    @FindBy(xpath = "//*[@id=\"text-7\"]/div/ul/li[3]/a")
    private WebElement diensten;
    @FindBy(xpath = "//*[@id=\"text-7\"]/div/ul/li[4]/a")
    private WebElement OverOns;
    @FindBy(xpath = "//*[@id=\"text-7\"]/div/ul/li[5]/a")
    private WebElement NeemContactOp;
    @FindBy(xpath = "//*[@id=\"text-3\"]/div/ul/li[1]/a")
    private WebElement Opslag;
    @FindBy(xpath = "//*[@id=\"text-3\"]/div/ul/li[2]/a")
    private WebElement Logistiek;
    @FindBy(xpath = "//*[@id=\"text-3\"]/div/ul/li[3]/a")
    private WebElement Vervoer;
    @FindBy(xpath = "//*[@id=\"text-5\"]/div/ul/li[2]/a")
    private WebElement telefon;
    @FindBy(xpath = "//*[@id=\"text-5\"]/div/ul/li[3]/a")
    private WebElement BTW;
    @FindBy(xpath = "//*[@id=\"slider-2-slide-2-layer-5\"]")
    private WebElement GetAQuote;
    @FindBy(xpath = "//*[@id=\"slider-2-slide-4-layer-5\"]")
    private WebElement GetAQuote2;
    @FindBy(xpath = "//*[@id=\"slider-2-slide-3-layer-5\"]")
    private WebElement GetAQuote3;
    @FindBy(xpath = "//*[@id=\"gtranslate_wrapper\"]/div[1]/div[1]/a")
    private WebElement translateOptions;
    @FindBy(xpath = "//*[@id=\"gtranslate_wrapper\"]/div[1]/div[2]")
    private WebElement translateDisplay;
    @FindBy(xpath = "//*[@id=\"gtranslate_wrapper\"]/div[1]/div[2]/a[11]")
    private WebElement turkish;

}
