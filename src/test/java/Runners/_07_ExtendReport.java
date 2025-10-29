package Runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/_01_Login.feature",
                "src/test/java/FeatureFiles/_04_CountryMultipleScenarios.feature",
                "src/test/java/FeatureFiles/_03_CitizenShip.feature"
        },
        glue = {"StepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)


public class _07_ExtendReport extends AbstractTestNGCucumberTests {
}
