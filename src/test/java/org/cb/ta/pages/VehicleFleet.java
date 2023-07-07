package org.cb.ta.pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
@Getter
public class VehicleFleet extends BasePage{
    public VehicleFleet(WebDriver driver) {
        super(driver);
        this.baseURL = "https://viaporttrans.com/";
        PageFactory.initElements(driver, this);
    }
    public void navigate() {
        driver.get(baseURL);
    }

    @FindBy(xpath = "//*[@id=\"menu-main-menu\"]/li[2]/a")
    private WebElement vehicleFleet;
    @FindBy(xpath = "//*[@id=\"menu-main-menu\"]/li[1]/a")
    private WebElement homePage;
    @FindBy(xpath = "//a[@href='https://viaporttrans.com/wp-content/uploads/2023/01/4-new-360x267-1.jpg']")
    private WebElement firstPic;

    @FindBy(xpath = "//a[@href='https://viaporttrans.com/wp-content/uploads/2023/01/4-new-360x267-2.jpg']")
    private WebElement secondPic;
    @FindBy(xpath = "//a[@href='https://viaporttrans.com/wp-content/uploads/2023/01/2-new-360x267-1.jpg']")
    private WebElement thirdPic;
    @FindBy(xpath = "//a[@href='https://viaporttrans.com/wp-content/uploads/2023/01/7-1-new-360x267-1.jpg']")
    private WebElement fourthPic;
    @FindBy(xpath = "//a[@href='https://viaporttrans.com/wp-content/uploads/2023/01/10-1-new-360x267-1.jpg']")
    private WebElement fifthPic;
    @FindBy(xpath = "//a[@href='https://viaporttrans.com/wp-content/uploads/2023/01/featured-img-3.jpg']")
    private WebElement sixthPic;
    @FindBy(xpath = "//a[@href='https://viaporttrans.com/wp-content/uploads/2023/01/intro-img-3-1024x474.jpg']")
    private WebElement seventhPic;
    @FindBy(xpath = "//a[@href='https://viaporttrans.com/wp-content/uploads/2023/01/9-2-new-360x267-1.jpg']")
    private WebElement eighthPic;
    @FindBy(xpath = "//a[@id='custom-id-0']")
    private WebElement getQueth;
    @FindBy(xpath = "//div[@id='lightboxOverlay']")
    private WebElement display;
    @FindBy(xpath = "//a[@class='lb-close']")
    private WebElement close;
    @FindBy(xpath = "//a[@class='lb-prev']")
    private WebElement leftArrow;
    @FindBy(xpath = "//a[@class='lb-next']")
    private WebElement rightArrow;

    @FindBy(xpath = "//*[@id=\"lightbox\"]/div[1]/div/div[2]")
    private WebElement slideMenu;



}
