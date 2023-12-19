package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectNationalityPage extends Utility {
    private static final Logger log = LogManager.getLogger(SelectNationalityPage.class.getName());

    public SelectNationalityPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@id='response']")
    WebElement nationalityDropDownList;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueAfterNationality;


    public void selectNationality(String nationality) {
        log.info(" Select nation from drop down list : " + nationalityDropDownList.toString());
        selectByVisibleTextFromDropDown(nationalityDropDownList, nationality);

    }

    public void clickNextStepButton() {
        log.info("Click on Continue after selecting nationality" + continueAfterNationality.toString());
        clickOnElement(continueAfterNationality);

    }
    public void checkCountryAvailable(String country2) {
        System.out.println(country2);
        Select selectCountry = new Select(nationalityDropDownList);
        List<WebElement> country_list = selectCountry.getOptions();
        for (WebElement country : country_list) {
            if (country.getText().equalsIgnoreCase(country2)) {
                System.out.println("Country is available: " + country.getAttribute("innerHTML"));
            }
        }
    }

}
