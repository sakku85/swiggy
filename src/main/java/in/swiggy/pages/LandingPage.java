package in.swiggy.pages;
import java.time.Duration;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {
	
	WebDriverWait wait;
	@FindBy(id="location")
	private WebElement location;
		
	@FindBy(xpath="//h2[contains(@class,_1E3AJ)]")
	private WebElement welcomeMsg;
	
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver,Duration.ofSeconds(100));
	}
	
	public void enterLocation(String string) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(location));
		location.sendKeys(string);
		Thread.sleep(3000);
	}
	
	public void clickOnFindFoodBtn() throws InterruptedException {
		location.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		location.sendKeys(Keys.ENTER);
	}
	
	public String getMsg() {
		String msg= welcomeMsg.getText();
		return msg;
	}
	
}
