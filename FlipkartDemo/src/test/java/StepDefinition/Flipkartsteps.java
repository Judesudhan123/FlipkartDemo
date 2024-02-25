package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import PageObjects.Homepage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.common.ConfigReader;
import util.common.TakeScreenShot;

public class Flipkartsteps {
	
	private WebDriver driver;
	private Homepage homePage;
	private TakeScreenShot takeScreenShot;
	


	@Given("User is on Flipkart homepage")
	public void user_is_on_flipkart_homepage() {
		
		//String driverPath = ConfigReader.getDriverPath();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agnes Jude\\Jude-WorkSpace\\Converge-Workspace\\FlipkartDemo\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		homePage = new Homepage(driver);
		
		homePage.navigatetoFlipkartPage();
		//takeScreenShot = new TakeScreenShot(driver);
	    
	}

	@When("User clicks on Fashion and selects Mens Top Wear")
	public void user_clicks_on_fashion_and_selects_mens_top_wear() {
		
              homePage.FashionandmenTopwear();
	    
	}

	@When("User filters products by Average customer review of four stars and Up")
	public void user_filters_products_by_average_customer_review_of_four_stars_and_up() {
		
		  homePage.filterByPriceRange();
		
	    
	}

	@When("User selects Allen Solley in Brands")
	public void user_selects_allen_solley_in_brands() throws InterruptedException {
		
		homePage.AllensollyBrand();
	    
	}

	@When("User counts the number of results in the first page")
	public void user_counts_the_number_of_results_in_the_first_page() throws InterruptedException {
		
		homePage.countOftheProduct();
	    	}

	@When("User clicks on the second product and add it to Cart {string}")
	public void user_clicks_on_the_second_product_and_add_it_to_cart(String expectedValue) throws InterruptedException {
		
		
	    homePage.clickAddtocart();
	}

	@Then("User validates that the number on the Cart is increased by {string}")
	public void user_validates_that_the_number_on_the_cart_is_increased_by(String string) {

	}

	@Then("User proceed to buy the item")
	public void user_proceed_to_buy_the_item() {
		
		homePage.buyProduct();
	  
	}




}
