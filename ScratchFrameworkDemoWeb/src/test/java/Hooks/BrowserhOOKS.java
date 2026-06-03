package Hooks;

import org.testng.annotations.Parameters;

import Utilities.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BrowserhOOKS {
	
	@Before
	
	@Parameters("browser")
	public void setup() {
	    BaseClass.initializedriver();
	}

	@After
	public void teardown() {
	    BaseClass.cleanupDriver();
	}


}
