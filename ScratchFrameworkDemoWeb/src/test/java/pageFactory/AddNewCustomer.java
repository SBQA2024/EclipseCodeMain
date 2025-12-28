package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class AddNewCustomer extends BaseClass{
	
	WebDriver driver;
	
	public AddNewCustomer(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
	    @FindBy(xpath = "//a[text()='New Customer']")
	    WebElement newCustomer;
	
	
		@FindBy(xpath = "//input[@name='name']")
		WebElement customername;
		
		@FindBy(xpath = "(//input[@name='rad1'])[1]")
		WebElement gender;

		@FindBy(xpath = "//input[@id='dob']")
		WebElement dob;

		@FindBy(xpath = "//textarea[@name='addr']")
		WebElement address;

		@FindBy(xpath = "//input[@name='city']")
		WebElement city;
		
		@FindBy(xpath = "//input[@name='state']")
		WebElement state;
		
		
		@FindBy(xpath = "//input[@name='pinno']")
		WebElement PIN;
		
		@FindBy(xpath = "//input[@name='telephoneno']")
		WebElement telno;
		
		@FindBy(xpath = "//input[@name='emailid']")
		WebElement email;
		
		@FindBy(xpath = "//input[@value='Submit']")
		WebElement submitbtn;
		
		
		public void clicknewcustomer() {
			
			newCustomer.click();
		}
		
		
		
	public void enterCustname(String cname) {
			
		customername.sendKeys(cname);
	}
			
			public void selectgender() {
				
				gender.click();
			}
				
				public void enterdob(String dateob) {
					
					dob.sendKeys(dateob);
				}
					
				
					
					public void enteraddress(String caddress) {
						
						address.sendKeys(caddress);
					}
						
						public void entercity(String ccity) {
							
							city.sendKeys(ccity);
						}
							
							public void enterstate(String cstate) {
								
								state.sendKeys(cstate);
							}
								
								public void enterpin(String cpin) {
									
									PIN.sendKeys(cpin);
								}
									
									public void enterTel(String ctel) {
										
										telno.sendKeys(ctel);
									}
										
										public void enteremail(String cemail) {
											
											email.sendKeys(cemail);
										}
											
	                                      public void clickbutton() {
	                                      
	                                      submitbtn.click();
	                                      
	                                      }
	}
	
	
	
	

