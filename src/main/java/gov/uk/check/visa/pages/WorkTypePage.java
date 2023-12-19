package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorkTypePage extends Utility {
    private static final Logger log = LogManager.getLogger(WorkTypePage.class.getName());

    public WorkTypePage(){
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextPage;


    public void selectJobType(String jobType){
        log.info("select job type  ' " + jobType + " ' ");
        clickOnElement(By.xpath("//label[contains(text(),'" + jobType.toString() + "')]"));
    }

    public void clickNextStepButton(){
        log.info("Click on next step button"  + nextPage.toString());
        clickOnElement(nextPage);
    }

}
