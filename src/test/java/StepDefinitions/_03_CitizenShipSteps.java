package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

public class _03_CitizenShipSteps {
    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();

    @And("Navigate to CitizenShip")
    public void navigateToCitizenShip() {
        ln.myClick(ln.setup);
        ln.myClick(ln.parameters);
        ln.myClick(ln.citizenship);
    }

    @When("Create a citizenship")
    public void createACitizenship() {
        String citizenShipName= RandomStringUtils.randomAlphanumeric(8);
        String citizenShipShortName=RandomStringUtils.randomNumeric(4);

        dc.myClick(dc.addButton);
        dc.mySendkeys(dc.nameInput,citizenShipName);
        dc.mySendkeys(dc.shortName, citizenShipShortName);
        dc.myClick(dc.saveButton);
    }
}
