package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DurationOfStayPage extends Utility {
    private static final Logger log = LogManager.getLogger(DurationOfStayPage.class.getName());

    public DurationOfStayPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='gem-c-radio govuk-radios__item']//input[@value='six_months_or_less']")
    WebElement lessThanSixMonths;

    @CacheLookup
    @FindBy(xpath = "//div[@class='gem-c-radio govuk-radios__item']//input[@value='longer_than_six_months']")
    WebElement moreThanSixMonths;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;

    public void selectLengthOfStay(String moreOrLess) {
        moreOrLess = "more than 6 months";

        switch (moreOrLess) {
            case "more than 6 months":
                clickOnElement(moreThanSixMonths);
                break;
            case "6 months or less":
                clickOnElement(lessThanSixMonths);
                break;
            default:
                System.out.println("nothing selected");
        }
    }

    public void clickNextStepButton() {
        log.info("Click on continue'" + nextStepButton.toString() + "' link <br>");
        clickOnElement(nextStepButton);

    }

}
