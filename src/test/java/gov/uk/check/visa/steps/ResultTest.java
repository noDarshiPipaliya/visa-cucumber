package gov.uk.check.visa.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import gov.uk.check.visa.pages.ResultPage;

public class ResultTest {


    @And("^I get result message$")
    public void iGetResultMessage() {
        new ResultPage().getResultMsg();
    }

    @And("^I confirm result message$")
    public void iConfirmResultMessage() {
        new ResultPage().confirmResultMessage();
    }

    @Then("^I confirm join partner text message$")
    public void iConfirmTextMessage() {
        new ResultPage().confirmJoinPartnerVisaMessage("You’ll need a visa to join your family or partner in the UK");
    }
}
