package in.swiggy.testscripts;

import org.openqa.selenium.chrome.ChromeDriver;

import in.swiggy.pages.AllFoodItemsPage;
import in.swiggy.pages.CheckOutPage;
import in.swiggy.pages.LandingPage;
import in.swiggy.pages.RestaurentPage;

public class Driver extends Tools {
	
	
	protected static LandingPage landingPage;
	protected static RestaurentPage restaurentPage;
	protected static AllFoodItemsPage allFoodItemsPage;
	protected static CheckOutPage checkOutPage;
	
	public static void init() {
		System.setProperty("webdriver.chrome.driver","resource//chromedriver.exe");
		driver=new ChromeDriver();
		
		landingPage=new LandingPage(driver);
		restaurentPage=new RestaurentPage(driver);
		allFoodItemsPage=new AllFoodItemsPage(driver);
		checkOutPage=new CheckOutPage(driver);
	}

}
