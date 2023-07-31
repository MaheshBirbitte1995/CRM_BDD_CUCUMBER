package Test;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.Login;



public class stepdefinations extends BaseClass{
	
	Logger logger;


	@Given("user is on portal {string}")
	public void user_is_on_portal(String url) {
		logger = Logger.getLogger("CRM BDD CUCUMBER");
		PropertyConfigurator.configure(".//src//test//resource//log4j.properties");

		driver.get(url);
	}

	@When("User enter Username as {string}")
	public void user_enter_username_as(String name) {

		login.credentialsuser(name);
		logger.info("********ADDING USERNAME*********");

	}

	@When("User enter Password as {string}")
	public void user_enter_password_as(String word) {
		login.credentialspass(word);

		logger.info("********ADDING PASSWORD*********");
	}

	@Then("Login is sucessful")
	public void login_is_sucessful() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Done");
		logger.info("********LOGIN SUCCESSFUL*********");
	}
}
