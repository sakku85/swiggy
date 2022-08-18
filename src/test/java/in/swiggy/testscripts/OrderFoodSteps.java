package in.swiggy.testscripts;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderFoodSteps extends Driver {

	@Given("A user is on the landing page")
	public void a_user_is_on_the_landing_page() {
		String expectedMsg="Order food from favourite restaurants near you.";
		Assert.assertEquals(landingPage.getMsg(),expectedMsg);
	    
	}

	@When("he enters location As  Bangolore, Karnataka,India in location search box")
	public void he_enters_location_as_bangolore_karnataka_india_in_location_search_box() throws InterruptedException {
		
		landingPage.enterLocation("Bangalore, Karnataka, India");
	}

	@When("he clicks Go")
	public void he_clicks_go() throws InterruptedException {
		
		landingPage.clickOnFindFoodBtn();
	}

	@When("he clicks on the first restaurant on the next page")
	public void he_clicks_on_the_first_restaurant_on_the_next_page() throws InterruptedException {
		
		restaurentPage.clickRestName();
	//landingPage.clickRestName();
	 }

	@When("he add any one item of the restaurant")
	public void he_add_any_one_item_of_the_restaurant() {
		
		allFoodItemsPage.clickTheFoodItem();
	}

	@When("he clicks checkout button")
	public void he_clicks_checkout_button() {
		//allFoodItemsPage.clickContinueBtn();
		allFoodItemsPage.clickChekoutBtn();

	}

	@Then("he must be able to order the food successfully")
	public void he_must_be_able_to_order_the_food_successfully() {
		String expectedMsg="SECURE CHECKOUT";
		Assert.assertEquals(checkOutPage.CheckOutMeesage(), expectedMsg);
			    
	}
}
