package page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.mongodb.gridfs.CLI;

public class Contact_page {

	
	private WebDriver driver;
	
//	@FindBy (xpath = "//a[normalize-space()='Contacts']")
//			WebElement ContactModule ;
//	
	
	@FindBy (xpath = "//img[@class='mr-2 img-typ']")
	WebElement AddButton ;
	
	@FindBy (xpath = "//select[@id='1682488862163_field']")
	WebElement ContactOwner ;
	
	@FindBy (xpath = "//select[@id='1683022325757_field']")
	WebElement AccountName ;
	
	@FindBy (xpath = "//input[@id='1682489142121_field']")
	WebElement FirstName ;
	
	@FindBy (xpath = "//input[@id='1682489143807_field']")
	WebElement LastName ;
	
	@FindBy (xpath = "//input[@id='1682489228459_field']")
	WebElement Phone ;
	
	@FindBy (xpath = "//input[@placeholder='Email *']")
	WebElement Email ;
	
	@FindBy (xpath = "//input[@id='1682489364368_field']")
	WebElement Mobile ;
	
	@FindBy (xpath = "//input[@id='1682489366919_field']")
	WebElement Fax ;
	
	@FindBy (xpath = "//input[@placeholder='Secondary Email']")
	WebElement SecondaryEmail ;
	
	@FindBy (xpath = "//input[@id='1682491152844_field']")
	WebElement Address ;
	
	@FindBy (xpath = "//input[@id='1682491154750_field']")
	WebElement City ;
	
	@FindBy (xpath = "//input[@id='1682491195487_field']")
	WebElement ZipCode;
	
	@FindBy (xpath = "//select[@id='1682491199606_field']")
	WebElement Country ;
	
	@FindBy (xpath = "//textarea[@id='1681975329728_field']")
	WebElement Description;
	
	@FindBy (xpath = "//button[@id='1681975406605_field']")
	WebElement Save ;
	
	
	@FindBy (xpath = "//div[@id='grid-view-container-1690968364252']//div[1]//div[1]//div[2]//span[1]//span[1]//i[1]")
	WebElement MoreOption ;
	
	@FindBy (xpath = "//div[contains(@class,'dropdown-menu show')]//span[contains(@class,'text-truncate')][normalize-space()='Edit']")
	WebElement EditBotton ;
	@FindBy (xpath = "//input[@id='1682405324403_field']")
	WebElement NameEdit ;
	@FindBy (xpath = "//button[@id='1682315062752_field']")
	WebElement SaveEdit ;
	
	
	public Contact_page(WebDriver driver)
	{
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
//	public void Add_Contact_module()
//	{
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		ContactModule.click();
//		
//	}
	public void add_button() throws InterruptedException {
		
		Thread.sleep(20000);
		AddButton.click();
	}
	
	public void all_required_inputs() {
		
		
		Select  Con =new Select(ContactOwner);
		Con.selectByValue("saigaurav");
		
		AccountName.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		
		Select ac = new Select(AccountName);
		ac.selectByValue("3821800001705151");
		
		FirstName.sendKeys("Saigaurav");
		LastName.sendKeys("Dambhe");
		Phone.sendKeys("9988776655");
		Email.sendKeys("uncode@gmail.com");
		Mobile.sendKeys("8899776633");;
		Fax.sendKeys("66543");;
		SecondaryEmail.click();
		Address.sendKeys("madhapur");
		City.sendKeys("Hyderabad");
		ZipCode.sendKeys("500081");
		Country.click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Select Cn = new Select(Country);
		Cn.selectByValue("1681974631295375");
		
		Description.sendKeys("BDD Automation");
		
		
	}
	 public void save_button() throws InterruptedException
	 {Thread.sleep(4000);
		 Save.click();
	 }
	 
	 public void More_option_and_edit_button() throws InterruptedException {
		 
		 MoreOption.click();
			Thread.sleep(2000);
		 EditBotton.click();
	 }
	 
	 public void change_in_name() {
		 NameEdit.sendKeys("Edited");
	 }
	 public void update_button() {
		 SaveEdit.click();
	 }
}
