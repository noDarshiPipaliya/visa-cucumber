Feature: result page test

  Scenario:  user should navigate to result page successfully
    Given   I accept cookies
    When    I click start now button
    And     I select nationality from dropdown
    And     I click continue button
    And     I  click reason for travel
    And     I click continue after reason
    And     I click  length of stay button
    And     I click next step button
    And     I select immigartion status
    And     I click on continue
    And     I get result message
    And     I confirm result message
    Then    I confirm join partner text message