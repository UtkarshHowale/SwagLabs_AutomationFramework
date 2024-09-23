package Runner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src\\test\\resources\\FeatureFiles\\login.feature" }, glue = {
		"step.definitions" }, monochrome = true, dryRun = false, plugin = { "json:build/cucumber-reports/cucumber.json",
				"rerun:build/cucumber-reports/rerun.txt" })

public class TestRunner {

}
