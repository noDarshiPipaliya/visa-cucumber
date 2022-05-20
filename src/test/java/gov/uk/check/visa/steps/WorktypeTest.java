package gov.uk.check.visa.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import gov.uk.check.visa.pages.WorkTypePage;

public class WorktypeTest {


    @And("^I select job type$")
    public void iSelectJobType() {
        new WorkTypePage().selectJobType("Health and care professional");
    }

    @Then("^I click continue tab$")
    public void iClickContinueTab() {
        new WorkTypePage().clickNextStepButton();
    }
}
