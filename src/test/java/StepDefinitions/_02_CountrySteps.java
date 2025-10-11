package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

public class _02_CountrySteps {
    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();

    @And("Navigate to Country")
    public void navigateToCountry() {
        ln.myClick(ln.setup);
        ln.myClick(ln.parameters);
        ln.myClick(ln.countries);
    }

    @When("Create a country")
    public void createACountry() {
        String ulkeAdı= RandomStringUtils.randomAlphanumeric(8);//8 tane karışık harf verir.
        String ulkeKodu=RandomStringUtils.randomNumeric(4); //Karışık rakam verir.

        dc.myClick(dc.addButton);
        dc.mySendkeys(dc.nameInput, ulkeAdı);
        dc.mySendkeys(dc.codeInput, ulkeKodu);
        dc.myClick(dc.saveButton);
    }

    @Then("Succsess message should be displayed")
    public void succsessMessageShouldBeDisplayed() {
    dc.verfyMessageContainsText(dc.successMessage,"success");

    }

    @When("Create country name as {string} code as {string}")
    public void createCountryNameAsCodeAs(String ulkeAdı, String ulkeKodu) {
        dc.myClick(dc.addButton);
        dc.mySendkeys(dc.nameInput, ulkeAdı);
        dc.mySendkeys(dc.codeInput, ulkeKodu);
        dc.myClick(dc.saveButton);

    }
}