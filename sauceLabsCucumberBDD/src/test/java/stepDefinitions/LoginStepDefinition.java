package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.PageFactory.Pages.LoginPage;
import com.PageFactory.Pages.ProductsPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDefinition {

	WebDriver driver;
	
	LoginPage lpobj;
	ProductsPage prodobj;
	
	@Given("user is on login page of website")
	public void user_is_on_login_page_of_website() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		lpobj = new LoginPage(driver);
	}
	@Given("title of page is as expected")
	public void title_of_page_is_as_expected() {
		lpobj.checkTitle();
	}
	@Given("username field is visible")
	public void username_field_is_visible() {
		lpobj.checkUsername();
	}
	@Given("password field is visible")
	public void password_field_is_visible() {
		lpobj.checkPassword();
	}
	@When("user enters valid username")
	public void user_enters_valid_username() {
		lpobj.enterUsername();
	}
	@When("user enters valid password")
	public void user_enters_valid_password() {
		lpobj.enterPassword();
	}
	@Then("website successfully logs in")
	public void website_successfully_logs_in() {
		lpobj.clickLoginButton();
		prodobj = new ProductsPage(driver);
		prodobj.checkLogin();
	}
	@Then("products page is displayed")
	public void products_page_is_displayed() {
		prodobj.checkHeadingValue();
		driver.quit();
	}

	@When("user enters invalid username and password")
	public void user_enters_invalid_username_and_password() {
		lpobj.enterUsernamePassword();
		lpobj.clickLoginButton();
	}
	@Then("error message should be displayed on page")
	public void error_message_should_be_displayed_on_page() {
	    lpobj.checkErrorMessage();
		driver.quit();
	}
}
