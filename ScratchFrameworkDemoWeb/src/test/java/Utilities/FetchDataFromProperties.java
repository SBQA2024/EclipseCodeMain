package Utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.poifs.property.Property;

public class FetchDataFromProperties {
	
	public static Properties FetchDataFromPropertiesfile() throws FileNotFoundException {
		
		FileReader file = new FileReader("src\\main\\java\\Constants\\Global.properties");
		
		Properties prop = new Properties();
		
		try {
			prop.load(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prop;
		
		
		
	}
	
	
	
	
	

}
