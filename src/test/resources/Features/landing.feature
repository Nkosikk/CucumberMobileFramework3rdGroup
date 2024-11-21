@landingPage
Feature: Connect to Wi-fi
  Scenario: As a user i want to connect to the wi-fi with the incorrect wi-fi details
    Given landing page
    And I click Wake Up
    When I click Geisha
    And I click the Allow button
    Then music must play
