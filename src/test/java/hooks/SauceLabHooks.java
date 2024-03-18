package hooks;

import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class SauceLabHooks {
	
	@Before(order = 2)
	public void getProperty() {
		System.out.println("3rd Before hooks");
	}

	@Before(order = 1)
	public void launchBrowser() {
		System.out.println("2nd Before hooks");
	}

	@Before(order = 0)
	public void launchBrowser1() {
		System.out.println("1st Before hooks");
	}

	@After(order = 1)
	public void quiteBrowser() {
		System.out.println("2nd After hooks");
	}

	@After(order = 0)
	public void tearDown(Scenario scenario) {
		System.out.println("1st After hooks");
	}

	@After(order = 2)
	public void tearDown1(Scenario scenario) {
		System.out.println("3rd After hooks");
	}
}

// @Before hook
// Background
// scenario
// @After


