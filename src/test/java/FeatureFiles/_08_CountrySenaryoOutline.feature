Feature: Country Senaryo Outline

Given Navigate to Campus
When Enter username and password and click login button
Then User should login successfully
And Navigate to Country

  Scenario Outline: Country with parameter
    When Create country name as "<name>" code as "<code>"
    Then Succsess message should be displayed
    When User delete name as "<name>"
    Then Succsess message should be displayed


    Examples:
      | name     | code  |
      | ys12H89g | ym35d |
      | ys12H89g | ym35d |
      | ys12H89g | ym35d |
      | ys12H89g | ym35d |
      | ys12H89g | ym35d |