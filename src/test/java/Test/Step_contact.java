package Test;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.Contact_page;
import page.Login;

public class Step_contact {


	public 	Logger logger;

	WebDriver driver ;
	public Login login  ;
	public  Contact_page Contact;
	@Before
	public void init()
	{	

		driver = new ChromeDriver();
		login  = new Login(driver);
		Contact = new Contact_page(driver);

	}

	@After (order = 1)
	public void end () {

		driver.quit();
	}
	@After(order = 2)
	public void tearDown(Scenario scenario)
	{
		boolean isScenarioFailed = scenario.isFailed();

		if(isScenarioFailed)
		{
			String scenarioname = scenario.getName();

			String screenshotname = scenarioname.replaceAll(" ", "_");

			TakesScreenshot ts = (TakesScreenshot)driver;

			byte[] source = ts.getScreenshotAs(OutputType.BYTES);

			scenario.attach(source, "image/png", screenshotname);
		}
	}

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


	@When("User is able to Click on Contact module")
	public void user_is_able_to_click_on_contact_module() {

		System.out.println("By default on Contact Module");
	}

	@When("User is able to click on Add button")
	public void user_is_able_to_click_on_add_button() throws InterruptedException {

		Thread.sleep(5000);
		Contact.add_button();

	}



	@When("User is Enter all  required inputs")
	public void user_is_enter_all_required_inputs() {
		Contact.all_required_inputs();

	}




	@When("User is able to Click on Save button")
	public void user_is_able_to_click_on_save_button() throws InterruptedException {
		Contact.save_button();

	}

	@Then("New Contact is Created")
	public void new_contact_is_created() {

		System.out.println("Created Successfully");

	}

	@When("User click on More option and edit button")
	public void user_click_on_more_option_and_edit_button() throws InterruptedException {
		Contact.More_option_and_edit_button();
	}
	@When("Click Make change in Name")
	public void click_make_change_in_name() {

		Contact.change_in_name();
	}
	@When("Click on Update button")
	public void click_on_update_button() {

		Contact.update_button();

	}
	@Then("Contact is edited Successfully")
	public void contact_is_edited_successfully() {

		System.out.println("gg");

	}

}
