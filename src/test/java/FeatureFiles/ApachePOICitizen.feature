

Feature: ApachePOI Citizen Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And  Navigate to CitizenShip

    Scenario: Create and Delete Citizenship from excel
      When  User create citizenship with ApachePOI
      Then User delete citizenship with ApachePOI
