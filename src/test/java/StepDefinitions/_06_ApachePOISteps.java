package StepDefinitions;

import Pages.DialogContent;
import Utilities.ExcelUtility;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;

public class _06_ApachePOISteps {
    DialogContent dc = new DialogContent();

    @When("User create citizenship with ApachePOI")
    public void userCreateCitizenshipWithApachePOI() {
        ArrayList<ArrayList<String>> tablo = ExcelUtility.getData(
                "src/test/java/ApachePOI/resource/ApacheExcel2 (1).xlsx",
                "testCitizen",
                2
        );//Tablodan 2 sütunu al
        //Her satırı citizenShip olarak kaydet
        for (ArrayList<String> satır : tablo) {
            dc.myClick(dc.addButton);
            dc.mySendkeys(dc.nameInput, satır.get(0));
            dc.mySendkeys(dc.codeInput, satır.get(1));
            dc.myClick(dc.saveButton);
            dc.verfyMessageContainsText("success");
        }
    }

    @Then("User delete citizenship with ApachePOI")
    public void userDeleteCitizenshipWithApachePOI() {
        ArrayList<ArrayList<String>> tablo = ExcelUtility.getData(
                "src/test/java/ApachePOI/resource/ApacheExcel2 (1).xlsx",
                "testCitizen",
                1
        );

        //Her bir satırı citizeShip satırı al ve sil
        for (ArrayList<String> satır : tablo) {
            dc.deleteItem(satır.get(0));
            dc.verfyMessageContainsText("success");
        }
    }
}