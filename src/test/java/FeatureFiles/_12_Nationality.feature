Feature:Nationality DataTable and Scenario Outline

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully


  Scenario Outline: Create Nationality and Delete

    And Click on the Element in LeftNav
      | setup         |
      | parameters    |
      | nationalities |

    And Click on the Element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput |  |<name>|

    And Click on the Element in Dialog
      | saveButton |

    Then Succsess message should be displayed

    And User delete the element from Diaolog
      |<name> |

    Then Succsess message should be displayed
    Examples:
      | name    |
      | ysn3K32 |
      | ysn3K33 |
      | ysn3K34 |
      | ysn3K35 |

