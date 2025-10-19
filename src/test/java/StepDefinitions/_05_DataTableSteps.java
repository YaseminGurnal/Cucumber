package StepDefinitions;

import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;

public class _05_DataTableSteps {
    LeftNav ln = new LeftNav();

    @And("Click on the Element in LeftNav")
    public void clickOnTheElementInLeftNav(DataTable dtLinkler) {
        List<String> Linkler = dtLinkler.asList();
        for (int i = 0; i < Linkler.size(); i++) {
            ln.myClick(ln.getWebElement(Linkler.get(i)));

        }

    }
}
