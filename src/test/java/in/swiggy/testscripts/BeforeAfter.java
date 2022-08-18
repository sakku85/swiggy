package in.swiggy.testscripts;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BeforeAfter extends Tools {
	
	@Before
	public void setUp() {
			Driver.init();
			driver.manage().window().maximize();
			driver.get("https://www.swiggy.in");
			
	}
	
	@After
	public void tearDown() {
		
		//driver.quit();
	}

}
