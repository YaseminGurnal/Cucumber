package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    //Cucumber a ait her senaryadon sonra çalışan annotation
    @After
    public void After(Scenario senaryo){ //Cucumber ın otomatik senaryo ile ilgili bilgiler değişkeni
        if (senaryo.isFailed()){
            TakesScreenshot ts=((TakesScreenshot) GWD.getDriver());
            byte[] hafizadakiHali=ts.getScreenshotAs(OutputType.BYTES);
            senaryo.attach(hafizadakiHali, "image/png", "screenshot name");
        }
        GWD.quitDriver();
    }
}
