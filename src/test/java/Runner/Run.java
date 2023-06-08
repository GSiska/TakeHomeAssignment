package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test",
        glue = {"StepDefinition"},
        plugin = {"pretty","html:target/cucumber-reports.html"}
)
public class Run extends AbstractTestNGCucumberTests {
}
