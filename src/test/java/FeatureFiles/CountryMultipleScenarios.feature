Feature:  Country Functionality

  Background: //Before Senaryo
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Country

    Scenario: Create a Country
      When Create a country
      Then Succsess message should be displayed

      Scenario: Create a Country 2
        When Create country name as "Ulkeİsim11" code as "ÜlkeKod43"
        Then Succsess message should be displayed

