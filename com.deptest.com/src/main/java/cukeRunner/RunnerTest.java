package cukeRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {
				"pretty",
				"json:target/deputyAutomationTestReport.json",
				"html:target/html"
		},
		features = "classpath:features"
		,glue={"stepDefinition"}
		,tags = "@login"
)

public class RunnerTest {

}