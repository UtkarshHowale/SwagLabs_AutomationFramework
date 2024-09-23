package StepDefination;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addCart {

	public WebDriver driver;

	@Given("the user is on the Swag Labs login page")
	public void the_user_is_on_the_swag_labs_login_page() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}

	@When("the user logs in with valid credentials")
	public void the_user_logs_in_with_valid_credentials() {
		// Enter username and password
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	}

	@Then("the user should be redirected to the homepage")
	public void the_user_should_be_redirected_to_the_homepage() {
		// Verify that the user is on the homepage
		String currentUrl = driver.getCurrentUrl();
		assertEquals("https://www.saucedemo.com/inventory.html", currentUrl);
	}

	@When("the user adds a product to the cart")
	public void the_user_adds_a_product_to_the_cart() {
		// Add the first product (e.g., Sauce Labs Backpack) to the cart
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	}

	@Then("the product should be successfully added to the cart")
	public void the_product_should_be_successfully_added_to_the_cart() {
		// Verify that the product is added to the cart
		String cartBadge = driver.findElement(By.className("shopping_cart_badge")).getText();
		assertEquals("1", cartBadge);
		// Close the browser
		driver.quit();
	}
}
