package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class VisaConfirmationSteps {
    @Given("I am on Start Page")
    public void iAmOnStartPage() {

    }

    @When("I accept additional cookies")
    public void iAcceptAdditionalCookies() {
        new StartPage().clickOnAcceptAdditionalCookiesButton();
    }

    @And("I click on start button")
    public void iClickOnStartButton() {
        new StartPage().clickStartNow();
    }

    @And("I select Nationality {string}")
    public void iSelectNationality(String nationality) {
        new SelectNationalityPage().selectNationality(nationality);
    }

    @And("I click next step button")
    public void iClickNextStepButton() {
        new SelectNationalityPage().clickNextStepButton();
    }

    @And("I select reason for visit {string}")
    public void iSelectReasonForVisit(String visit) {
        new ReasonForTravelPage().selectReasonForVisit(visit);
    }

    @Then("I should see {string}")
    public void iShouldSee(String resultMessage) {
        String expected = resultMessage;
        String actual = new ResultPage().getResultMsg();
        Assert.assertEquals(expected,actual);
    }

    @And("I Select intent to stay for {string}")
    public void iSelectIntentToStayFor(String duration) {
        new DurationOfStayPage().selectLengthOfStay("more than 6 months");
    }

    @When("I select job type {string}")
    public void iSelectJobType(String jobType) {
        new WorkTypePage().selectJobType(jobType);
    }

    @When("I select state My partner of family member have uk immigration status {string}")
    public void iSelectStateMyPartnerOfFamilyMemberHaveUkImmigrationStatusYes() {
        new FamilyImmigrationStatusPage().selectImmigrationStatus("yes");
    }

    @And("I click on Continue")
    public void iClickOnContinue() {
        new FamilyImmigrationStatusPage().clickOnContinue();
    }

    @Given("I am on the home page")
    public void iAmOnTheHomePage() {
    }

    @When("I click the start button")
    public void iClickTheStartButton() {
    }

    @Then("I should see the following countries in the country dropdown list:")
    public void iShouldSeeTheFollowingCountriesInTheCountryDropdownList() {
    }
}