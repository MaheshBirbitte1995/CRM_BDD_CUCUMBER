package page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Accounts_creation  {


	private WebDriver driver;


	@FindBy(xpath="//body/app-root[1]/app-root[1]/app-home[1]/div[2]/div[2]/div[1]/app-app-id[1]/div[1]/app-sidemenu[1]/div[1]/div[1]/div[2]/div[4]/a[1]")
	private WebElement Accounts_click;


	@FindBy(xpath="//body/app-root[1]/app-root[1]/app-home[1]/div[2]/div[2]/div[1]/app-app-id[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-controller-id[1]/app-smart-view-render[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/img[1]")
	private WebElement Accounts_create_btn;

	@FindBy(xpath="//select[@id='1681970129304_field']")
	private WebElement select_Account_Owner;

	@FindBy(xpath="//input[@id='1681970888719_field']")
	private WebElement  enter_Account_Name;


	@FindBy(xpath="//input[@id='1681970556384_field']")
	private WebElement enter_Phone_number  ;

	@FindBy(xpath="//input[@id='1682427934920_field']")
	private WebElement    enter_Website ;

	@FindBy(xpath="//select[@id='1681971144391_field']")
	private WebElement  select_Industry   ;

	@FindBy(xpath="//input[@id='1682511318849_field']")
	private WebElement  enter_Annual_Revenue    ;

	@FindBy(xpath="//input[@id='1681972083951_field']")
	private WebElement  eneter_Employees_name   ;

	@FindBy(xpath="//input[@id='1681972133492_field']")
	private WebElement enter_fax_number;

	@FindBy(xpath="//input[@id='1681972372618_field']")
	private WebElement enter_Address;

	@FindBy(xpath="//input[@id='1681972424816_field']")
	private WebElement enter_City ;

	@FindBy(xpath="//input[@id='1681972478751_field']")
	private WebElement enter_Zip_code;

	@FindBy(xpath="//select[@id='1681974103671_field']")
	private WebElement select_Country ;


	@FindBy(xpath="//textarea[@id='1681974157915_field']")
	private WebElement enter_Description;

	@FindBy(xpath="//button[@id='1681974283087_field']")
	private WebElement save_click;



	//Initializing the Page Objects:
	public Accounts_creation(WebDriver driver) {
		//this.driver=driver;

		PageFactory.initElements(driver, this);

	}

	public void Accounts_Module_wise() {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Accounts_click.click();
	}	 

	public void ClickAccountModule() {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 

		Accounts_create_btn.click();
	}


	public void  Allinputs() {

		Select sel =  new Select(select_Account_Owner);
		sel.selectByVisibleText("saigaurav");

		enter_Account_Name.sendKeys("Allians serelium");

		enter_Phone_number.sendKeys("83920293833");

		enter_Website.sendKeys("www.Allians$wiiiams.com");

		Select sel2 = new Select(select_Industry) ;
		sel2.selectByValue("1681907920154351");



		enter_Annual_Revenue.sendKeys("54800");

		eneter_Employees_name.sendKeys("Allians VIMS");

		enter_fax_number.sendKeys("433443");

		enter_Address.sendKeys("texas williams street loadvala road 22");

		enter_City.sendKeys("teklon");

		enter_Zip_code.sendKeys("342344");

		Select sel3 = new Select(select_Country);
		sel3.deselectByValue("1681995291709922");		 


		enter_Description.click();

	}

	public void savec() {

		save_click.click();


	}


}







