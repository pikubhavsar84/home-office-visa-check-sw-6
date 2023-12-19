package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage extends Utility {
    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());

    public ResultPage(){
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@id='result-info']//h2[@class='gem-c-heading gem-c-heading--font-size-27 govuk-!-margin-bottom-6']")
    WebElement result;

    public String getResultMsg() {
        log.info("get text from the result message " + result.getText());
        String resultMsg = getTextFromElement(result);
        return resultMsg;
    }

    public String confirmResultMessage() {
        log.info("confirm result message " + result.getText());
        System.out.println(result.getText());
        return result.getText();
    }

}
