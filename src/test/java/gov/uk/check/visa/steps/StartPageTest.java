package gov.uk.check.visa.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import gov.uk.check.visa.pages.StartPage;

public class StartPageTest {
    @Given("^I accept cookies$")
    public void iAcceptCookies()  {
        new StartPage().clickOnAcceptAdditionalCookiesButton();
    }

    @Then("^I click start now button$")
    public void iClickStartNowButton()  {
        new StartPage().clickStartNow();
    }
}
