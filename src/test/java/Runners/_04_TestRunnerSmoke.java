package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@SmokeTest",//Sadece tag i belirtilen senaryoları çalıştırır.
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        plugin = {"json:target/cucumber/cucumber.json"} //Jenkins için Json report
)

public class _04_TestRunnerSmoke extends AbstractTestNGCucumberTests {
}
