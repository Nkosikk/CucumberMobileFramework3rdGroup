@CalculatorPage
Feature: Calculations
  Scenario: As user i want to perform multiplication so that i can my result
    Given i open the calculator
    And i click a digit number
    And i click multiplication sign
    And i click second digit number
    When i click equals sign
    Then the Total is displayed
