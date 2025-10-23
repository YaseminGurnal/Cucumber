Feature: DataTable Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Create a Country
    And Click on the Element in LeftNav

      | Setup      |
      | Parameters |
      | Countries  |

    And Click on the Element in Dialog

      | addButton |

    And User sending the keys in Dialog
      | nameInput | yaseminUlkesi1 |
      | codeInput | yaseminKod1    |

    And Click on the Element in Dialog

      | saveButton |

    Then Succsess message should be displayed

    And User delete the element from Diaolog
      | yaseminUlkesi1 |

    Then Succsess message should be displayed

  Scenario: CitizenShip Create and Delete

    And Click on the Element in LeftNav
      | setup       |
      | parameters  |
      | citizenship |

    And Click on the Element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput |  | ysu232545 |
      | shortName |  | yu290     |

    And Click on the Element in Dialog
      | saveButton |

    Then Succsess message should be displayed

    And User delete the element from Diaolog
      | ysu232545 |

    Then Succsess message should be displayed

  Scenario: Create Nationality and Delete
    And Click on the Element in LeftNav
      | setup         |
      | parameters    |
      | nationalities |

    And Click on the Element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput |  | ysi0997 |

    And Click on the Element in Dialog
      | saveButton |

    Then Succsess message should be displayed

    And User delete the element from Diaolog
      | ysi0997 |

    Then Succsess message should be displayed


  Scenario: Fees Functionality and Delete

    And Click on the Element in LeftNav
      | setup      |
      | parameters |
      | fees       |

    And Click on the Element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput       |  | ysFee9 |
      | codeInput       |  | 46748  |
      | integrationCode |  | 876    |
      | priorityCode    |  | 89786  |

    And Click on the Element in Dialog
      | toggleBar  |
      | saveButton |

    Then Succsess message should be displayed

    And User delete the element from Diaolog
      | ysFee9 |

    Then Succsess message should be displayed
