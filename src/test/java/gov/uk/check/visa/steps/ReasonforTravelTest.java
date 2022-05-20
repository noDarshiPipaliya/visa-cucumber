package gov.uk.check.visa.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import gov.uk.check.visa.pages.ReasonForTravelPage;

public class ReasonforTravelTest {
    @And("^I  click reason for travel$")
    public void iClickReasonForTravel() {
        new ReasonForTravelPage().selectReasonForVisit("Work, academic visit or business");
    }

    @Then("^I click continue after reason$")
    public void iClickContinueAfterReason() {
        new ReasonForTravelPage().clickNextStepButton();
    }
}
