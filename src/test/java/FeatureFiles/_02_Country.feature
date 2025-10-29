Feature: Country Functionality

  @SmokeTest
  Scenario: Create Country
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Country
    When Create a country
    Then Succsess message should be displayed