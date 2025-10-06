package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.After;

public class Hooks {
    //Cucumber a ait her senaryadon sonra çalışan annotation
    @After
    public void After(){
        GWD.quitDriver();
    }
}
