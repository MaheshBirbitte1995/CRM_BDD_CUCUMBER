package Test;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.Accounts_creation;
import page.Login;

public class Add_accounts_module  {

	public Login login  ;
	public WebDriver driver;
	public Accounts_creation accountcreationWise;
	@Before
	public void init()
	{	

		driver = new ChromeDriver();
		login  = new Login(driver);
		accountcreationWise = new Accounts_creation(driver);

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
	
	
	
	
	@When("click on Accounts module")
	public void click_on_accounts_module() throws InterruptedException {
		
		
		accountcreationWise.Accounts_Module_wise();
		
	}

	@When("Click on add button")
	public void click_on_add_button() {
	   
		accountcreationWise.ClickAccountModule();
	}

	@When("enter All input")
	public void enter_all_input() {
	   
		accountcreationWise.Allinputs();
	}

	@Then("Accounts created successfully")
	public void accounts_created_successfully() {
	    
		accountcreationWise.savec();
		
	 System.out.println("Account is created successfully");	
	}
	
	
}
