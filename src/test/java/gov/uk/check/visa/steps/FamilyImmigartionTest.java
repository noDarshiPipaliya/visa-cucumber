package gov.uk.check.visa.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import gov.uk.check.visa.pages.FamilyImmigrationStatusPage;

public class FamilyImmigartionTest {
    @And("^I select immigartion status$")
    public void iSelectImmigartionStatus() {
        new FamilyImmigrationStatusPage().selectImmigrationStatus("yes");
    }

    @Then("^I click on continue$")
    public void iClickOnContinue() {
        new FamilyImmigrationStatusPage().clickOnContinue();
    }
}
