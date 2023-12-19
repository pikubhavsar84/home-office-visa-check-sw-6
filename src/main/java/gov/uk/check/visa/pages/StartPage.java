package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartPage extends Utility {
    private static final Logger log = LogManager.getLogger(StartPage.class.getName());
    public StartPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Accept additional cookies')]")
    WebElement acceptAdditionalCookies;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[1]/article/section[1]/a")
    WebElement startNowButton;


    public void clickOnAcceptAdditionalCookiesButton() {
        log.info("Clicking on " + acceptAdditionalCookies.getText());
        clickOnElement(acceptAdditionalCookies);
    }

    public void clickStartNow() {
        log.info("Clicking on start button " + startNowButton.getText());
        clickOnElement(startNowButton);
    }

}
