Feature: DataTable Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

    Scenario: Create a Country
      And Click on the Element in LeftNav

      |Setup|
      |Parameters|
      |Countries|
