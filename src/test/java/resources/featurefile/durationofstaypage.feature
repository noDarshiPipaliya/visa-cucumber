Feature:  duration of stay page test

  Scenario: user should navigate to duration of stay page successfully
    Given   I accept cookies
    When    I click start now button
    And     I select nationality from dropdown
    And     I click continue button
    And     I  click reason for travel
    And     I click continue after reason
    And     I click  length of stay button
    Then    I click next step button
