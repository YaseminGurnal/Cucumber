package Runners;

import Utilities.GWD;
import Utilities.GWD_Old;
import com.aventstack.extentreports.service.ExtentService;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class _08_ParallelTest {
    @CucumberOptions(
            features = {"src/test/java/FeatureFiles/_01_Login.feature",
                    "src/test/java/FeatureFiles/_04_CountryMultipleScenarios.feature",
                    "src/test/java/FeatureFiles/_03_CitizenShip.feature"
            },
            glue = {"StepDefinitions"},
            plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
    )

    public class _07_ExtendReport extends AbstractTestNGCucumberTests {

        @BeforeClass
        @Parameters("browserTipi")
        public void beforeClass(String browserTipi){
            GWD_Old.threadBrowserName.set(browserTipi);

        }
    }

}
