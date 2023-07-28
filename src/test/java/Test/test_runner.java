package Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = "Folder\\login1.feature",
		glue = "Test",
	
		plugin = "pretty",
		 tags = "@login"S
		 
		
		)
public class test_runner extends AbstractTestNGCucumberTests {

}
