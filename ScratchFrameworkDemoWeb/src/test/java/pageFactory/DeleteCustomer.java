package pageFactory;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.FetchDataFromProperties;

public class DeleteCustomer {
	
	static WebDriver driver;
	
	public DeleteCustomer(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(xpath="//a[text()='Delete Customer']")
	 WebElement deletecusst;
	
	 public void deletecusst1() {
		 deletecusst.click();
	 }
	
	 @FindBy(xpath="//input[@name='cusid']")
	 WebElement custid;
	 
	 public void entercustid() throws FileNotFoundException {
	 }
		 @FindBy(xpath="//input[@name='AccSubmit']")
		 WebElement Submitbtn;
		 
		 public void clickbtn() {
			 
			 Submitbtn.click();
		
		 
		 
		 
		 
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
