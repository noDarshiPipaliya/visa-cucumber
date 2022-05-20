Feature:  work type page

  Scenario: user should navigate to work type page successfully
    Given   I accept cookies
    When    I click start now button
    And     I select nationality from dropdown
    And     I click continue button
    And     I  click reason for travel
    And     I click continue after reason
    And     I click  length of stay button
    And     I click next step button
    And     I select job type
    Then    I click continue tab
