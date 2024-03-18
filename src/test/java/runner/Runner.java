package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions
		(features = { "src/test/resources/features/SauceDemoLoginTest.feature" }, // feature file // folder name
		glue = { "stepdefinition", "hooks" }, // step definition package name
		plugin = { "html:target/My/cucumber-html-report", "pretty", "json:target/MyReports/report.json" }, // reporting
		monochrome = true, dryRun = false)


public class Runner extends AbstractTestNGCucumberTests {

}
