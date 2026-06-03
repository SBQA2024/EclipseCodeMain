package stepDefination;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import Utilities.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageFactory.AddNewCustomer;

public class AddCustomerStepDefination extends BaseClass{
	
	
	
	AddNewCustomer obj1; 
	
	WebDriver driver = BaseClass.getDriver();
	
	@Given("user clicked on New Customer link")
	public void user_clicked_on_new_customer_link() {
		
		waitmethod();
		
        obj1 = new AddNewCustomer(driver); 
		obj1.clicknewcustomer();

	}

	@Then("user filled up the form with all details")
	public void user_filled_up_the_form_with_all_details(io.cucumber.datatable.DataTable regform) {
		
		List<Map<String,String >> data = regform.asMaps(String.class, String.class);
		Map<String , String> customer = data.get(0);
		
		obj1.enterCustname(customer.get("CustomerName"));
		obj1.selectgender();
		obj1.enterdob(customer.get("DateOfBirth"));
		obj1.enteraddress(customer.get("Address"));
		obj1.entercity(customer.get("City"));
		obj1.enterstate(customer.get("State"));
		obj1.enterpin(customer.get("PIN"));
		obj1.enterTel(customer.get("telephoneNumber"));
		obj1.enteremail(customer.get("Email"));
		
	
	}

	@Then("user clicked on the submit button")
	public void user_clicked_on_the_submit_button() {
		
		waitmethod();
		
		obj1.clickbutton();
	   
	}
	
	
	



}
