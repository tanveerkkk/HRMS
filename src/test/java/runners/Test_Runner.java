package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features", glue = {
		"stepDefinitions" }, monochrome = true, dryRun = false, tags = { "@Smoke" })

public class Test_Runner {

}
