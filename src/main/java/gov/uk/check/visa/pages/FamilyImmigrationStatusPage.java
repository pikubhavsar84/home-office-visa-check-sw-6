package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FamilyImmigrationStatusPage extends Utility {
    private static final Logger log = LogManager.getLogger(FamilyImmigrationStatusPage.class.getName());

    public FamilyImmigrationStatusPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@id='current-question']//div[@class='gem-c-radio govuk-radios__item']/input[@id='response-0']")
    WebElement yesRB;

    @CacheLookup
    @FindBy(css = "#response-1")
    WebElement noRB;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement next;

    public void selectImmigrationStatus(String status) {
        log.info("select immigration status"+yesRB.getText()+ "or" +noRB.getText());
        switch (status) {
            case "yes":
                clickOnElement(yesRB);
                break;
            case "no":
                clickOnElement(noRB);
                break;
            default:
                System.out.println("Please select an option");
        }
    }

    public void clickOnContinue() {
        log.info("Click on continue button" + next.toString());
        clickOnElement(next);
    }

}
