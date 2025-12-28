package Utilities;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static WebDriver driver;
	static String browsername;
	
	public static WebDriver initializedriver() {
		
		
		try {
			browsername = FetchDataFromProperties.FetchDataFromPropertiesfile().getProperty("browser");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if(browsername.equalsIgnoreCase("chrome"))
		{
		driver= new ChromeDriver();
		try {
			driver.get(FetchDatafromExcel.FetchDatafromExcelsheet(1, 0));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		return driver;
		
	}
	
	public static void gettitleofwebpage() {
		
		String title = driver.getTitle();
		System.out.println("Page title is " + title);
	}
	
	
	public static void waitmethod() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	}

	
	
	
	


