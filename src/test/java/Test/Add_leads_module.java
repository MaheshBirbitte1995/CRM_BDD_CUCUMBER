package Test;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Add_leads_module extends BaseClass{


	@When("Click on Lead module")
	public void click_on_lead_module() {
	  lead.ClickLeadModule();
	  
	}
	
	@When("click on add button")
	public void click_on_add_button() {
		lead.Leads_AddButton();
	  
	}
	@When("Enter All input")
	public void enter_all_input() {
		lead.AllInput();
	
	}
	@When("Click on save")
	public void click_on_save() {
		lead.SaveB();

	}
	@Then("Lead created successfully")
	public void lead_created_successfully() {
	    
		System.out.println("Successfully Created ");
	}

}
