package stepDefination;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;

import Utilities.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageFactory.AddNewCustomer;
import pageFactory.DeleteCustomer;

public class DeleteCustomerStepDef extends BaseClass {
	
	DeleteCustomer obj2;
	WebDriver driver = BaseClass.getDriver();
	
	@Given("User clicks on delete customer")
	public void user_clicks_on_delete_customer() {
		
		obj2= new DeleteCustomer(driver);
		obj2.deletecusst1();
        waitmethod();
	
	}

	@Then("user enter the cust id")
	public void user_enter_the_cust_id() throws FileNotFoundException {
		
		obj2.entercustid();
	    
	}

	@Then("user clicks on submit button")
	public void user_clicks_on_submit_button() {
		
		obj2.clickbtn();
	  
	}

	
	
	
	
	
	
	

}
