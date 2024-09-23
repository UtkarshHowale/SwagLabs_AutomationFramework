package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class loginTest {

	public WebDriver driver;

	@Given("Navigate to the url {string}")
	public void navigate_to_the_url(String url) {

		driver = new ChromeDriver();
		driver.get(url);
	}

	@Given("Enter the username {string}")
	public void enter_the_username(String username) {

		driver.findElement(By.id("user-name")).sendKeys(username);
	}

	@Given("Enter the password {string}")
	public void enter_the_password(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@Given("Click on to the login button")
	public void click_on_to_the_login_button() {
		driver.findElement(By.id("login-button")).click();
	}

	@Then("Verify the homepage title")
	public void verify_the_homepage_title() {

		String title = driver.getTitle();
		System.out.println("Homepage title is:  " + title);

		if (title.equalsIgnoreCase("Swag Labs")) {

			System.out.println("login successful...!");
		} else {

			System.out.println("login failed...!");
		}

		driver.quit();
	}
}
