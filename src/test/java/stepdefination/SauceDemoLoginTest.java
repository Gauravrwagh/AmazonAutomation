package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import utilities.SeleniumUtility;

public class SauceDemoLoginTest extends SeleniumUtility{
	
	@When("User get {string} and {string}")
	public void user_get_and(String userName1, String password1) {
		SauceDemoLogin.userName = userName1;
		SauceDemoLogin.pwd = password1;
	}

	@Then("User close the browser")
	public void user_close_the_browser() {
		cleanUp();
//		System.out.println("Browser closes");
	}

	@Then("User should not navigates to home page")
	public void user_should_not_navigates_to_home_page() {
		WebElement errorMsg = driver.findElement(By.xpath("//div[@class='error-message-container error']"));
		Assert.assertTrue(errorMsg.isDisplayed());
	}

}
