Feature: CitizenShip Functionality


  Background: //Before Senaryo
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to CitizenShip

  Scenario: Create a citizenship with parameter 1
    When Create a citizenship name as "yasemnBN23" shortKod as "icsk897"
    Then Succsess message should be displayed

  Scenario: Create a citizenship with parameter 2
    When Create a citizenship name as "yasemnBN457" shortKod as "icsk532"
    Then Succsess message should be displayed