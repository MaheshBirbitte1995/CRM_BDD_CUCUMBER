package Test;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import page.Login;


public class stepdefinations {
 public  WebDriver driver;
 public Login login ;
 
	@Given("user is on portal {string}")
	public void user_is_on_portal(String url) {
	   login = new Login(driver);
	   driver.get(url);
	}

	@When("User enter Username as {string}")
	public void user_enter_username_as(String name) {
	   
		login.credentialsuser(name);
	   
	}

	@When("User enter Password as {string}")
	public void user_enter_password_as(String word) {
	   login.credentialspass(word);
	}

	@Then("Login is sucessful")
	public void login_is_sucessful() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
