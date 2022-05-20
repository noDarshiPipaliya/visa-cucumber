package gov.uk.check.visa.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import gov.uk.check.visa.pages.SelectNationalityPage;

public class SelectnationalityTest {
    @And("^I select nationality from dropdown$")
    public void iSelectNationalityFromDropdown() {
        new SelectNationalityPage().selectNationality("British national overseas");
    }

    @Then("^I click continue button$")
    public void iClickContinueButton() {
        new SelectNationalityPage().clickNextStepButton();
    }
}
