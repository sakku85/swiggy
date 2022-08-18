package in.swiggy.testscripts;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="Features//food_order.feature"
			,glue="in.swiggy.testscripts"
			,plugin={"progress" , "html:target/Cucumber.html"}
	)
	public class TestRunner extends AbstractTestNGCucumberTests {

}
