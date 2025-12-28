package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class LoginPage extends BaseClass{
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(xpath = "//input[@name='uid']")
	WebElement Username;
	@FindBy(xpath = "//input[@type='password']")
	WebElement Password;
	@FindBy(xpath = "//input[@type='submit']")
	WebElement login;
	
	
	
	
	public  void enterusername(String uname) {
		
		Username.sendKeys(uname);
	}
public  void enterpassword(String pws) {
		
	    Password.sendKeys(pws);
	}
	
public  void loginbuttonclick() {
	login.click();
	    
}

	
	
	
	
	
	
	
	
	
	
	
	

}
