package stepDefination;

import org.openqa.selenium.WebDriver;

import Utilities.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageFactory.LoginPage;

public class StepDefination extends BaseClass{
	
	WebDriver driver = BaseClass.initializedriver();
	LoginPage obj = new LoginPage(driver);
	
	
	@Given("user loads the URL")
	public void user_loads_the_url() {
		gettitleofwebpage();
		
	
	}

	@Given("user enters the username in {string} field")
	public void user_enters_the_username_in_field(String Username) {
	    obj.enterusername(Username);
		
		
		
	    
	}
	
	@Then("user enters the password in {string} field")
	public void user_enters_the_password_in_field(String Password) {
		
		obj.enterpassword(Password);
	}
	


	@Then("user click on the login button")
	public void user_click_on_the_login_button() {
		
		obj.loginbuttonclick();
	    
	}
	
	@Then("User navigates to the dashboard of the application")
	public void user_navigates_to_the_dashboard_of_the_application() {
	    
		
	}

	
	 @Given("user is logged into Guru99 application")
	    public void user_is_logged_into_guru99_application() {

	        user_loads_the_url();
	        user_enters_the_username_in_field("mngr650981");
	        user_enters_the_password_in_field("pEbedAv");
	        user_click_on_the_login_button();
	        user_navigates_to_the_dashboard_of_the_application();
	    }



}
