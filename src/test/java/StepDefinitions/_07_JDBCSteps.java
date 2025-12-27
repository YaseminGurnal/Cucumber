package StepDefinitions;

import Pages.DialogContent;
import Utilities.DBUtility;
import com.mongodb.DB;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class _07_JDBCSteps {
    DialogContent dc = new DialogContent();
    @Then("Send the Query the Database {string}and control match")
    public void sendTheQueryTheDatabaseAndControlMatch(String sorgu) {

        //DB den datayı oku
        List<List<String>> dbList = DBUtility.getListData(sorgu);
        //Webden(UI) ekrandaki isimleri oku
        List<WebElement> uıList = (List<WebElement>) dc.nameList;

        //Birebir assert yap
        for (int i = 0; i < dbList.size(); i++)
            Assert.assertEquals(dbList.get(i).get(0),
                    uıList.get(i).getText().trim(),
                    "Eşleştirme yapılamadı");
    }
}
