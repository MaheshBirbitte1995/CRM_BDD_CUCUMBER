package page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Login {

	public WebDriver driver;



	public Login (WebDriver driver)
	{
		this.driver=driver;

	}

	public void credentialsuser(String use)
	{



		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement username = driver.findElement( By.xpath("//*[@id='username']"));


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


		Actions act = new Actions(driver);
		username.sendKeys(use);

		act.sendKeys(Keys.ENTER).build().perform();
	}





	public void credentialspass(String pas) {




		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement pass = driver.findElement(By.xpath("//*[@id='password']"));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		Actions act = new Actions(driver);



		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		pass.sendKeys(pas);

		act.sendKeys(Keys.ENTER).build().perform();

	}


}

