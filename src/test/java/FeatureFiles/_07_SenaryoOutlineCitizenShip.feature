Feature: CitizenShip Functionality

  Background: //Before Senaryo
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to CitizenShip

  Scenario Outline: Create citizenship with parameter
    When Create a citizenship name as "<name>" shortKod as "<shortname>"
    Then Succsess message should be displayed
    When Create a citizenship name as "<name>" shortKod as "<shortname>"
    Then Already exit  message should be displayed
    When  User delete name as "<name>"
    Then Succsess message should be displayed

    Examples:
      | name |shortname|
      | ys2zDS1 |ys2zDS1short|
      | ys2zDS2 |ys2zDS2short|
      | ys2zDS3 |ys2zDS3short|
      | ys2zDS4 |ys2zDS4short|
      | ys2zDS5 |ys2zDS5short|