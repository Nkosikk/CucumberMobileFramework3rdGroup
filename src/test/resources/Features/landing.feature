Feature: Connect to Wi-fi
  Scenario: As a user i want to connect to the wi-fi with the incorrect wi-fi details
    Given landing page
    And I click Wi-Fi
    And I enter the host
    And I enter the Port
    When I click connect
    Then the error message is displayed
    And I click Ok button