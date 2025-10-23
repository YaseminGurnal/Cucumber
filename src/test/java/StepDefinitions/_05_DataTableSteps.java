package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _05_DataTableSteps {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @And("Click on the Element in LeftNav")
    public void clickOnTheElementInLeftNav(DataTable dtLinkler) {
        List<String> Linkler = dtLinkler.asList();
        for (int i = 0; i < Linkler.size(); i++) {
            ln.myClick(ln.getWebElement(Linkler.get(i)));

        }

    }

    @And("Click on the Element in Dialog")
    public void clickOnTheElementInDialog(DataTable dtButonlar) {
        List<String> butonlar = dtButonlar.asList();
        for (int i = 0; i < butonlar.size(); i++) {
            dc.myClick(dc.getWebElement(butonlar.get(i)));

        }
    }

    @And("User sending the keys in Dialog")
    public void userSendingTheKeysInDialog(DataTable dtkutuVeYazılar) {
        List<List<String>> kutuVeYazılar = dtkutuVeYazılar.asLists();

        for (int i = 0; i < kutuVeYazılar.size(); i++) {
            WebElement kutu = dc.getWebElement(kutuVeYazılar.get(i).get(0));
            dc.mySendkeys(kutu, kutuVeYazılar.get(i).get(1));
        }
    }

    @And("User delete the element from Diaolog")
    public void userDeleteTheElementFromDiaolog(DataTable dtSilinecekler) {
        List<String>silinecekler=dtSilinecekler.asList();

        for (int i = 0; i < silinecekler.size(); i++) {
            dc.deleteItem(silinecekler.get(i));
        }
    }
}
