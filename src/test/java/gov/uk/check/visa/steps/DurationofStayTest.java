package gov.uk.check.visa.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import gov.uk.check.visa.pages.DurationOfStayPage;

public class DurationofStayTest {
    @And("^I click  length of stay button$")
    public void iClickLengthOfStayButton() {
        new DurationOfStayPage().selectLengthOfStay("more than 6 months");
    }

    @Then("^I click next step button$")
    public void iClickNextStepButton() {
        new DurationOfStayPage().clickNextStepButton();
    }
}
