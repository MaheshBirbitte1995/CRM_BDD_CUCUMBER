package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.Login;

public class BaseClass {
	
	WebDriver driver = new ChromeDriver();
	 Login login  = new Login(driver);

}
