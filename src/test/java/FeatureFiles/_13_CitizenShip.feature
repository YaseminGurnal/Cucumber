#Senaryo
#Citizenships sayfasına gidiniz.
#1 adet Citizenships kaydı yapılabildiğini doğrulayınız.
Feature: CitizenShip  Functionality Datatable ve Scenario Outline

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully


  Scenario Outline: CitizenShip Create and Delete

    And Click on the Element in LeftNav
      | setup       |
      | parameters  |
      | citizenship |

    And Click on the Element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput |  | <name>  |
      | shortName |  | <short> |

    And Click on the Element in Dialog
      | saveButton |

    Then Succsess message should be displayed

    And User delete the element from Diaolog
      | <name> |

    Then Succsess message should be displayed
    Examples:
      | name     | short    |
      | ysicS31  | ysc1sk31 |
      | ysics32  | ysc1sk32 |
      | ysics33  | ysc1sk33 |
      | ysics34  | ysc1sk34 |
      | ysiccs35 | ysc1sk35 |
