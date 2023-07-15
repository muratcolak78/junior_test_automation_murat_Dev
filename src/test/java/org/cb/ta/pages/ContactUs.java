package org.cb.ta.pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class ContactUs extends BasePage {
    public ContactUs(WebDriver driver) {
        super(driver);
        this.baseURL = "https://viaporttrans.com/";
        PageFactory.initElements(driver, this);
    }

    public void navigate() {
        driver.get(baseURL);
    }

    @FindBy(xpath = "//*[@id=\"menu-main-menu\"]/li[1]/a")
    private WebElement homePage;
    @FindBy(xpath = "//*[@id=\"menu-main-menu\"]/li[5]/a")
    private WebElement ContactUs;

    @FindBy(xpath = "//input[@placeholder='Name*']")
    private WebElement name;
    @FindBy(xpath = "//input[@placeholder='Subject*']")
    private WebElement subject;
    @FindBy(xpath = "//input[@placeholder='Email*']")
    private WebElement email;
    @FindBy(xpath = "//input[@placeholder='Message*']")
    private WebElement message;
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement buttonSubmit;
    @FindBy(xpath = "//div[@class='wpcf7-response-output']")
    private WebElement lastMessage;
    @FindBy(xpath = "//*[@id=\"wpcf7-f1260-p15-o1\"]/form/div[3]")
    private WebElement lastMessage2;
    @FindBy(xpath = "//iframe[@src='https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2500.8156305904486!2d4.360146915968931!3d51.18562097958352!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x47c3f6aa69800e05%3A0x26ba4a7f8b5d5a17!2sMeetjeslandstraat%2061%2C%202660%20Antwerpen%2C%20Bel%C3%A7ika!5e0!3m2!1str!2str!4v1674420753522!5m2!1str!2str']")
    private WebElement googleMaps;
    @FindBy(xpath = "//h4[@class='vc_custom_heading']")
    private WebElement messageArea;

    @FindBy(xpath = "//input[@name='your-name']")
    private WebElement messageName;

    @FindBy(xpath = "//div/form/*[contains(text(),'Failed to send your message.')]")
    private WebElement failedMassage;

    @FindBy(xpath = "//div/*[contains(text(),'Get in touch')]")
    private WebElement getITouchText;

    @FindBy(xpath = "//div/*[contains(text(),'Validation errors')]")
    private WebElement validationMassage;



//*[@id="wpcf7-f1260-p15-o1"]/form/div[3]

}
