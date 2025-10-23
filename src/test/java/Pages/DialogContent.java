package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class DialogContent extends ParentPage {
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "[formcontrolname='username']")
    public WebElement username;

    @FindBy(css = "[formcontrolname='password']")
    public WebElement password;

    @FindBy(css = "[aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy(css = "span[class='mat-mdc-tooltip-trigger logo-text']")
    public WebElement headText;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    public WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    public WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    public WebElement codeInput;

    @FindBy(xpath = "//ms-save-button[@class='ng-star-inserted']//button")
    public WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMessage;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName' ]//input")
    public WebElement shortName;

    @FindBy(tagName = "mat-panel-description")
    public WebElement messageBox;

    @FindBy(tagName = "//ms-text-field/input[@placeholder='Name']")
    public WebElement searchInput;

    @FindBy(tagName = "//ms-search-button/div/button")
    public WebElement searchButton;

    @FindBy(tagName = "//ms-delete-button//button")
    public WebElement deleteImageBtn;

    @FindBy(tagName = "//button[@type='submit']")
    public WebElement deleteDıalogBtn;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='budgetAccountIntegrationCode']//input")
    public WebElement integrationCode;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']//input")
    public WebElement priorityCode;

    @FindBy(xpath = "//mat-slide-toggle[@formcontrolname='active']//button")
    public WebElement toggleBar;

    public void verifyMessageContainsText(String value) {
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//hot-toast-container/div/div/div//*"), 0));
        Assert.assertTrue(this.messageBox.getAttribute("innerHTML").toLowerCase().contains(value.toLowerCase()));

    }

    public void deleteItem(String deleteName) {
        mySendkeys(searchInput, deleteName);
        myClick(searchButton);
        //Sayfa yenilenene kadar bekle arama sonuçlanana kadar bekle
        wait.until(ExpectedConditions.elementToBeClickable(this.searchButton));
        myClick(deleteImageBtn);
        myClick(deleteDıalogBtn);
    }

    public WebElement getWebElement(String strElementName) {

        switch (strElementName) {
            case "addButton":
                return this.addButton;
            case "saveButton":
                return this.saveButton;
            case "nameInput":
                return this.nameInput;
            case "codeInput":
                return this.codeInput;
            case "shortName":
                return this.shortName;
            case "integrationCode":
                return this.integrationCode;
            case "priorityCode":
                return this.priorityCode;
            case "toggleBar":
                return this.toggleBar;

        }
        return null;
    }
}
