Feature: Datatable Örnek

  Scenario:User Write
    When Write username "Yasemin"
    When  Write username and password "Yasemin" and "1234"

    And  Write  username as Datatable
      | İsmet   |
      | Ümmühan |
      | İbrahim |
      | Neşe    |
      | Engin   |

    And  Write username and password as Datatable
      | İsmet   | 12344  |
      | Ümmühan | 12346  |
      | İbrahim | 12345  |
      | Neşe    | 12347  |
      | Engin   | 123458 |