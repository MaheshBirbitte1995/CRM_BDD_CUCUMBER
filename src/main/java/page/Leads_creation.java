package page;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Leads_creation {


	private WebDriver driver;

	private By Leads_Module_click= By.xpath("//body/app-root[1]/app-root[1]/app-home[1]/div[2]/div[2]/div[1]/app-app-id[1]/div[1]/app-sidemenu[1]/div[1]/div[1]/div[2]/div[2]/a[1]");

	private By Leads_Module_plus_btn = By.xpath("//body/app-root[1]/app-root[1]/app-home[1]/div[2]/div[2]/div[1]/app-app-id[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-controller-id[1]/app-smart-view-render[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/img[1]");

	private By Lead_owner_select= By.xpath("//select[@id='1681983035433_field']");

	private By Enter_Account_Name  = By.xpath("//input[@id='1681983038825_field']");

	private By First_Name = By.xpath("//input[@id='1681983199345_field']");

	private By Last_Name = By.xpath("//input[@id='1681983207137_field']");

	private By Phone_number = By.xpath("//input[@id='1681983241977_field']");

	private By Enter_Email = By.xpath("//body/app-root[1]/app-root[1]/app-home[1]/div[2]/div[2]/div[1]/app-app-id[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-controller-id[1]/app-smart-view-render[1]/div[1]/div[1]/app-event-render[1]/div[1]/div[2]/div[1]/div[1]/scocu-form-view[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/scocu-email[1]/div[2]/input[1]");

	private By enter_mobile_number = By.xpath("//input[@id='1681983275296_field']");

	private By enter_website = By.xpath("//input[@id='1681983280352_field']");

	private By select_Lead_Source  = By.xpath("//select[@id='1681983325762_field']");

	private By enter_Annual_Revenue= By.xpath("//input[@id='1681983769322_field']");

	private By select_Industry = By.xpath("//select[@id='1681983327664_field']");

	private By enter_No_of_Employees = By.xpath("//input[@id='1681983933146_field']");

	private By enter_Fax = By.xpath("//input[@id='1681983939337_field']");

	private By Secondary_Email = By.xpath("//body/app-root[1]/app-root[1]/app-home[1]/div[2]/div[2]/div[1]/app-app-id[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-controller-id[1]/app-smart-view-render[1]/div[1]/div[1]/app-event-render[1]/div[1]/div[2]/div[1]/div[1]/scocu-form-view[1]/div[1]/div[9]/div[1]/div[1]/div[1]/div[1]/scocu-email[1]/div[2]/input[1]");

	private By Enter_Address = By.xpath("//input[@id='1681984200278_field']");

	private By enter_city = By.xpath("//input[@id='1681984201535_field']");

	private By enter_Zip_Code = By.xpath("//input[@id='1682337195718_field']");

	private By select_Country = By.xpath("//select[@id='1681984361133_field']");

	private By enter_Description = By.xpath("//textarea[@id='1681984214600_field']");

	private By save_click =By.xpath("//button[@id='1681984404094_field']");

	public Leads_creation(WebDriver driver) {
		this.driver = driver;
	}



	public void ClickLeadModule() {


		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(Leads_Module_click).click();
	}

	public void Leads_AddButton () {


		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(Leads_Module_plus_btn).click();

	}
	public void AllInput() {


		Select sel=new Select(driver.findElement(Lead_owner_select));
		sel.selectByVisibleText("saigaurav");

		driver.findElement(Enter_Account_Name).sendKeys("GrandStream");

		driver.findElement(First_Name).sendKeys("Raj");

		driver.findElement(Last_Name).sendKeys("Malhotra");

		driver.findElement(Phone_number).sendKeys("9988776655");

		driver.findElement(Enter_Email).sendKeys("GrandStream1299@gmail.com");

		driver.findElement(enter_mobile_number).sendKeys("3454678765");

		driver.findElement(enter_website).sendKeys("www.GrandStream38.com");

		Select sel2=new Select(driver.findElement(select_Lead_Source));
		sel2.selectByValue("1681902766417337");


		driver.findElement(enter_Annual_Revenue).sendKeys("5656");

		Select sel3=new Select(driver.findElement(select_Lead_Source));
		sel3.selectByValue("1681902766417337");

		Select sel4=new Select(driver.findElement(select_Industry));
		sel4.selectByValue("1681907920154351");

		driver.findElement(enter_No_of_Employees).sendKeys("25");

		driver.findElement(enter_Fax).sendKeys("65748392089");

		driver.findElement(Secondary_Email).sendKeys("grandsorce239@gmail.com");

		driver.findElement(Enter_Address).sendKeys("Odyssey Mall, Plot No 461, 2nd Floor, Rd Number 36, above Tasva, Jubilee Hills");

		driver.findElement(enter_city).sendKeys("Jubili hills road no 1");

		driver.findElement(enter_Zip_Code).sendKeys("500033");

		Select sel5=new Select(driver.findElement(select_Country));
		sel5.selectByValue("1681995291709922");

		driver.findElement(enter_Description).sendKeys("Street Address. City/State/Zip. Phone Number. AMLI 7th Street Statin.");
	}
	public void SaveB() {
		driver.findElement(save_click).click();
	}	
}



