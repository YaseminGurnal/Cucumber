package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "RegressionTest or @SmokeTest",//Sadece tag i belirtilen senaryoları çalıştırır.
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        plugin = {"html:target/site/cucumber-pretty.html"} //basit report
)

public class _06_TestRunnerSmokeWithPlugin extends AbstractTestNGCucumberTests {
}
