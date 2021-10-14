package stepDefinitions;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pageObjects.LoginPage;
import resources.Base;



public class DemoLoginTest extends Base {
	
	//public static Logger log =LogManager.getLogger(Base.class.getName());
	
	 LoginPage lp;
	 
	 public DemoLoginTest() {
		 lp = new LoginPage(driver);
	 }
	
	

	@Given("Initialize the browser with chrome")
	public void initialize_the_browser_with_chrome() throws IOException {
		//driver = new ChromeDriver();
		driver = Base.initializeDriver();
	}

	@Given("Navigate to {string} Site")
	public void navigate_to_site(String url) throws InterruptedException {
		driver.get(url);
		Thread.sleep(4000);
	}

	@When("User enters {string} and {string} and logs in")
	public void user_enters_and_and_logs_in(String username, String password) throws InterruptedException {
		lp = new LoginPage(driver);
		lp.getEmailId().sendKeys(username);
		lp.getPassword().sendKeys(password);
		lp.getLoginClick().click();
		Thread.sleep(3000);
	}

	@Then("Verify that user is succesfully logged in")
	public void verify_that_user_is_succesfully_logged_in() {
		Assert.assertTrue(lp.getMarketPlace().isDisplayed());
	}
	
	@Then("Close browser")
	public void close_browser() {
	   driver.quit();
	}

}
