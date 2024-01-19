package page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Task_creation {


	private WebDriver driver;


	@FindBy(xpath="//body/app-root[1]/app-root[1]/app-home[1]/div[2]/div[2]/div[1]/app-app-id[1]/div[1]/app-sidemenu[1]/div[1]/div[1]/div[2]/div[6]/a[1]")
	WebElement Task_Module;

	@FindBy(xpath="//body/app-root[1]/app-root[1]/app-home[1]/div[2]/div[2]/div[1]/app-app-id[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-controller-id[1]/app-smart-view-render[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/img[1]")
	WebElement Task_create ;

	@FindBy(xpath="//body/app-root[1]/app-root[1]/app-home[1]/div[2]/div[2]/div[1]/app-app-id[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-controller-id[1]/app-smart-view-render[1]/div[1]/div[1]/app-event-render[1]/div[1]/div[2]/app-markup-view[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/input[1]")
	WebElement Subject_enter ;

	@FindBy(xpath="//body/app-root[1]/app-root[1]/app-home[1]/div[2]/div[2]/div[1]/app-app-id[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-controller-id[1]/app-smart-view-render[1]/div[1]/div[1]/app-event-render[1]/div[1]/div[2]/app-markup-view[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/input[2]")
	WebElement Due_Date ;

	@FindBy(xpath="//select[@id='excuteTaskTo']")
	WebElement Select_Add_task_to;

	//@FindBy(xpath="//select[@id='leadContactData']")
	//WebElement Select_Contact;

	//@FindBy(xpath="//select[@id='excuteDeal']")
	//WebElement  Select_Account_Deals ;

	@FindBy(xpath="//select[@id='leadContactData']")
	WebElement select_Lead  ;


	@FindBy(xpath="//body/app-root[1]/app-root[1]/app-home[1]/div[2]/div[2]/div[1]/app-app-id[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-controller-id[1]/app-smart-view-render[1]/div[1]/div[1]/app-event-render[1]/div[1]/div[2]/app-markup-view[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/select[2]")

	WebElement  select_Priority ;

	@FindBy(xpath="//select[@id='task_owner']")
	WebElement Select_Task_owner;



	@FindBy(xpath="//body/app-root[1]/app-root[1]/app-home[1]/div[2]/div[2]/div[1]/app-app-id[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-controller-id[1]/app-smart-view-render[1]/div[1]/div[1]/app-event-render[1]/div[1]/div[2]/app-markup-view[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/label[5]/select[1]")
	WebElement Select_Status ;

	@FindBy(xpath="//body/app-root[1]/app-root[1]/app-home[1]/div[2]/div[2]/div[1]/app-app-id[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-controller-id[1]/app-smart-view-render[1]/div[1]/div[1]/app-event-render[1]/div[1]/div[2]/app-markup-view[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[3]/div[1]/label[1]/span[1]")
	WebElement  Reminder_toggle ;

	@FindBy(xpath="//input[@id='remMax']")
	WebElement Date_toggle  ;

	@FindBy(xpath="//body/app-root[1]/app-root[1]/app-home[1]/div[2]/div[2]/div[1]/app-app-id[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-controller-id[1]/app-smart-view-render[1]/div[1]/div[1]/app-event-render[1]/div[1]/div[2]/app-markup-view[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[2]/input[1]")
	WebElement   Time_toggle ;


	@FindBy(xpath="//select[@id='notificationtypemeta']")
	WebElement Select_Notify  ;

	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement savebtn;

	public Task_creation(WebDriver driver) {
		this.driver=driver;

		PageFactory.initElements(driver,this);


	}

	public void task() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Task_Module.click();
		Thread.sleep(8000);


	}

	public void    Creating_TaskWise() throws InterruptedException {

		Task_create.click();
		Thread.sleep(5000);

	}

	public void feilds_enter() {

		Subject_enter.sendKeys("Interaction with CTO");

		Due_Date.sendKeys("15092023");

		Select sel = new Select(Select_Add_task_to);
		sel.selectByVisibleText("Lead");


		Select sel1 = new Select(select_Lead);
		sel1.selectByValue("3826163821944337");

		Select sel2 = new Select(select_Priority);
		sel2.selectByVisibleText("High");

		Select sel3 = new Select(Select_Task_owner);
		sel3.selectByVisibleText("saigaurav");

		Select sel4 = new Select(Select_Status);
		sel4.selectByVisibleText("Open");

		Reminder_toggle.click();

		Date_toggle.sendKeys("09082023");

		Time_toggle.sendKeys("18:12");

		Select sel5 = new Select(Select_Notify);
		sel5.selectByValue("1682682556537514");


	}


	public void saved() {

		savebtn.click();
	}



}
