package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.Accounts_creation;
import page.Leads_creation;
import page.Login;

public class BaseClass {
	
	WebDriver driver = new ChromeDriver();
	 Login login  = new Login(driver);
     
	Leads_creation lead = new Leads_creation(driver);
	
	Accounts_creation account = new Accounts_creation(driver);
	
	
	
	
	
	 
}
