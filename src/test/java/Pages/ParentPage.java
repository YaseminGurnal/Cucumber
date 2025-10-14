package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class ParentPage{
    WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(5));

    public void mySendkeys(WebElement element , String yazı ){
        wait.until(ExpectedConditions.visibilityOf(element));
        scrolltoElement(element);
        element.clear();
        element.sendKeys(yazı);

    }
    public void myClick(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        scrolltoElement(element);
        element.click();

    }
    public void scrolltoElement(WebElement element) {
        JavascriptExecutor js=(JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void LoginContainsText(WebElement element,String value){
        WebDriverWait wait=new WebDriverWait(GWD.getDriver(),Duration.ofSeconds(5));
        wait.until(ExpectedConditions.textToBePresentInElement(element,value));
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()));

    }

    public void verfyMessageContainsText(String value){
        List<WebElement>mesajKutusuElementleri=wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//hot-toast-container/div/div/div/*"),0));
        //Yukarıdaki elemanlar en az 1 den fazla olana kadar bekle yani mesaj kutusu dolana kadar

        //WebElement mesajKutusuParent1=GWD.getDriver().findElement(By.xpath("//hot-toast-container/div/div/div"));
        WebElement  mesajKutusuParent2=GWD.getDriver().findElement(By.tagName("mat-panel-description"));
        Assert.assertTrue(mesajKutusuParent2.getAttribute("innerHTML").toLowerCase().contains(value.toLowerCase()));
    }

}
