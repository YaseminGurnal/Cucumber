package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@RegressionTest or @SmokeTest",//Sadece tag i belirtilen senaryoları çalıştırır.
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"}
)
public class _05_TestRunnerRegression extends AbstractTestNGCucumberTests {
}
