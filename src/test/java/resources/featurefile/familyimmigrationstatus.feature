Feature: family immigration page test

  Scenario:  user should navigate to family immigration page successfully
    Given   I accept cookies
    When    I click start now button
    And     I select nationality from dropdown
    And     I click continue button
    And     I  click reason for travel
    And     I click continue after reason
    And     I click  length of stay button
    And     I click next step button
    And     I select immigartion status
    Then    I click on continue