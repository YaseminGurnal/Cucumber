#Senaryo
#CitizenShip sayfasına gidiniz.
#Create işlemini parameter yöntemi ile yapınız. (Senaryo 1)
#Daha sonra aynı bilgilerle tekrar Create yapılamadığını doğrulayınız. (negatif test) (Senaryo 2)
#Ayrı senaryoda girilen bilgiyi silme işlemini doğrulayınız (Senaryo 3)

  Feature: CitizenShip Functionality

    Background: //Before Senaryo
      Given Navigate to Campus
      When Enter username and password and click login button
      Then User should login successfully
      And Navigate to CitizenShip

    Scenario: Create citizenship with parameter
      When Create a citizenship name as "yasemnBN2223" shortKod as "icsk82297"
      Then Succsess message should be displayed


      Scenario: Create citizenship with parameter negatif
        When Create a citizenship name as "yasemnBN2223" shortKod as "icsk82297"
        Then Already exit  message should be displayed


        Scenario: Delete citizenship
          When  User delete name as "yasemnBN2223"
          Then Succsess message should be displayed