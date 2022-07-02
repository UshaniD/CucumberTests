package cucumberTests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/features",
        glue = {"stepDefinitions"},
        tags = "@Smoke or @Test or @E2E",
        plugin = ("json:target/cucumber-reports/CucumberTestReport.json")
)
public class TestRunner {
}
