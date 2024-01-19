package Test;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.When;

import page.Login;
import page.Task_creation;

public class Step_Task {


	public WebDriver driver=new ChromeDriver();


	Login login  = new Login(driver);

	Task_creation tasks = new Task_creation(driver);


	@Before
	public void init()
	{	
		System.out.println(" ");
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



	@When("click on Task")
	public void click_on_task() throws InterruptedException {

		tasks.task();


	}

	@When("click on Create Task")
	public void click_on_create_task() throws InterruptedException {

		tasks.Creating_TaskWise();

	}

	@When("click on all Inputs")
	public void click_on_all_inputs()throws InterruptedException {

		tasks.feilds_enter();

	}

	@When("click on save")
	public void click_on_save() {

		tasks.saved();

	}



}
