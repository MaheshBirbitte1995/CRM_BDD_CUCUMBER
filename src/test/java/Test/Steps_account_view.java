package Test;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.When;
import page.Accounts_creation;
import page.Login;

public class Steps_account_view {
	WebDriver driver ;
	public Login login  ;
	public Accounts_creation account;
	@Before
	public void init()
	{	

		driver = new ChromeDriver();
		login  = new Login(driver);
		account = new Accounts_creation(driver);

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



	@When("click on edit  view dots icon")
	public void click_on_edit_view_dots_icon() {
    account.ViewModule();
      

	}
	@When("click on   Edit icon")
	public void click_on_edit_icon() {
     account.editModule();
		
		
	}
	@When("click on Change Account owner")
	public void click_on_change_account_owner() {
    account.editModule();


	}
	@When("click on Save icon")
	public void click_on_save_icon() {
	
	account.savec();
	
	}

	
	@When("click on delete dots icon")
	public void click_on_delete_dots_icon() {
		
		account.DeleteAccount();
		
	}
	@When("click on  delete icon.")
	public void click_on_delete_icon() {
		
		
	}	

}
