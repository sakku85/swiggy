package in.swiggy.pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RestaurentPage {
   WebDriverWait wait;
   JavascriptExecutor j;
	@FindBy(xpath="(//div[contains(@class,'nA6kb')])[2]")
	//@FindBy(xpath="(//div[contains(@class,_1HEuF)])[1]")
	private WebElement restName;
	
	public RestaurentPage(WebDriver driver) {
		
		PageFactory.initElements( driver, this); 
		wait=new WebDriverWait(driver,Duration.ofSeconds(300));
		 j = (JavascriptExecutor) driver;
		 //j.executeScript("window.scrollBy(0,600)");
	      
	}
	
	public void clickRestName() throws InterruptedException {
		j.executeScript("window.scrollBy(0,400)");
		//Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(restName));
		//wait.until(ExpectedConditions.elementToBeClickable(restName)).click();
		restName.click();
		
	}
	
}
