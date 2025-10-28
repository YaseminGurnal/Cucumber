#Cities menusunun kayıt ve silme özelliğini test ediniz.

Feature: Cities Functionality Datatable

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Create and Delete Cities

    And Click on the Element in LeftNav
      | Setup      |
      | Parameters |
      | Cities     |

    And Click on the Element in Dialog
      | addButton     |
      | countrySelect |
      | countryOption |

    And User sending the keys in Dialog
      | nameInput |  | yasemincity1 |

    And Click on the Element in Dialog
      | saveButton |

    Then Succsess message should be displayed

    And User delete the element from Diaolog
      | yasemincity1 |

    Then Succsess message should be displayed











