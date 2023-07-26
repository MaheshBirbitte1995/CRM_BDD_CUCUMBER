package Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = ".//Folder/login1.feature",
		glue = "stepdefinations",
	
		plugin = "pretty"
		
		)
public class test_runner extends AbstractTestNGCucumberTests {

}
