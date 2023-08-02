package Test;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Add_accounts_module  extends BaseClass{

	
	@When("click on Accounts module")
	public void click_on_accounts_module() {
		
		
		account.Accounts_Module_wise();
		
	}

	@When("Click on add button")
	public void click_on_add_button() {
	   
		account.ClickAccountModule();
	}

	@When("enter All input")
	public void enter_all_input() {
	   
		account.Allinputs();
	}

	@Then("Accounts created successfully")
	public void accounts_created_successfully() {
	    
		account.savec();
		
	 System.out.println("Account is created successfully");	
	}
	
	
}
