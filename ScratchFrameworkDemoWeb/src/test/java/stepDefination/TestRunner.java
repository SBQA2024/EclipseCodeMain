package stepDefination;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/featureFiles",
        glue = "stepDefination",
        tags = "@Sanity or @Regression",
        		plugin = {
        		        "pretty",
        		        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        		},
        monochrome = true
)





public class TestRunner extends AbstractTestNGCucumberTests{
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
	    return super.scenarios();
	}


}
