package in.swiggy.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllFoodItemsPage {
	
	WebDriverWait wait;
	
	@FindBy(xpath="(//div[contains(@class,'_1RPOp')])[1]")
	WebElement foodItem;
	
	@FindBy(xpath="//span[contains(@class,'_1W_TH')]")
	WebElement continueBtn;
	
	@FindBy(xpath="//button[contains(@class,'_1gPB7')]")
	WebElement checkOutBtn;
	public AllFoodItemsPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		wait=new WebDriverWait(driver,Duration.ofSeconds(100));
	}
	
	public void clickTheFoodItem() {
		
		//wait.until(ExpectedConditions.elementToBeClickable(foodItem)).click();
		wait.until(ExpectedConditions.visibilityOf(foodItem));
		foodItem.click();
	}
	public void clickContinueBtn() {
		
		continueBtn.click();
	}
	
	public void clickChekoutBtn() {
		wait.until(ExpectedConditions.visibilityOf(checkOutBtn));
		checkOutBtn.click();
	}

}
