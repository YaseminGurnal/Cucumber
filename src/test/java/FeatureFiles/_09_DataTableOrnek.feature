Feature: Datatable Örnek

  Scenario:User Write
    When Write username "Yasemin"
    When  Write username and password "Yasemin" and "1234"

    And  Write  username as Datatable
    |İsmet|
    |Ümmühan|
    |İbrahim|
    |Neşe|
    |Engin|