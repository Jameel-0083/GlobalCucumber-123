package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.*;
import pageObjectsAdmin.AddUserPage;
import pageObjectsAdmin.AdminPage;
import pageObjectsAdmin.DeleteUserPage;
import pageObjectsAdmin.UserManagementPage;
import pageObjectsPim.PimPage;
import resources.Base;

public class AddUser extends Base {
	
	AdminPage ap;
	AddUserPage aup;
	PimPage pp;
	UserManagementPage um;
	DeleteUserPage dup;
	
	public AddUser() {
		ap = new AdminPage(driver);
		aup = new AddUserPage(driver);
		pp = new PimPage(driver);
		um = new UserManagementPage(driver);
		dup = new DeleteUserPage(driver);
	}
		
	@Then("User clicks on Admin")
	public void user_clicks_on_admin() throws InterruptedException {
		//ap.getAdmin();
		ap.Admin.click();
		
		
	}

	@Then("User clicks on Add User")
	public void user_clicks_on_add_user() throws InterruptedException {
		aup = new AddUserPage(driver);
		aup.getAddUserClick().click();
		Thread.sleep(3000);
	    
	}
	
	@Then("Add User details Successfully")
	public void add_user_details_successfully() throws InterruptedException {		
					
		/*WebElement Admin = aup.getUserRole();
		Select s = new Select(Admin);
		s.selectByVisibleText("Admin");*/
		ap.Admin.click();
		aup.getAddUserClick().click();
		Thread.sleep(2000);
		//aup.getUserRole().sendKeys("Admin");
		WebElement Admin = aup.getUserRole();
		Select s = new Select(Admin);
		s.selectByVisibleText("Admin");
		aup.getAddEmployeeName().sendKeys("Odis Adalwin");
		
		//aup.getUserName().sendKeys("Jam");
		//Assert.assertEquals("Should have at least 5 characters", aup.getUsernameValidation(), aup.getUsernameValidation().getText());
		
		//aup.getUserName().sendKeys("Jam");
		
		//Assert.assertTrue(aup.getUsernameValidation().equals("Should have at least 5 characters"));
		//System.out.println("Providing only 3 chars need to provide atleast five characters");
		
		aup.getUserName().sendKeys("Jameel12");
		//Assert.assertEquals(aup.getUsernameValidation(), "Should have at least 5 characters");
		System.out.println("Success, providing five characters");
		
		aup.getStatus().sendKeys("Enabled");
		aup.getPassword().sendKeys("Welcome@123");
		aup.getConfirmPassword().sendKeys("Welcome@123");
		Thread.sleep(3000);
		aup.getSaveButton().click();
		Thread.sleep(3000);
		System.out.println("User Added Successfully");
		log.info("User Added Successfully");
		}

	@And("Verify that a user is added successfully")
	public void verify_that_a_user_is_added_successfully() {
		System.out.println(aup.SuccessfullyAddedUserMessage.getText());
		   Assert.assertTrue(aup.SuccessfullyAddedUserMessage.isDisplayed());
	
		
	}

}
