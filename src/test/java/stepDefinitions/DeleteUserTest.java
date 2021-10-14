package stepDefinitions;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import pageObjectsAdmin.AddUserPage;
import pageObjectsAdmin.AdminPage;
import pageObjectsAdmin.DeleteUserPage;
import pageObjectsAdmin.UserManagementPage;
import pageObjectsPim.PimPage;
import resources.Base;

public class DeleteUserTest extends Base {
	
	
	AdminPage ap;
	AddUserPage aup;
	PimPage pp;
	UserManagementPage um;
	DeleteUserPage dup;
	
	public DeleteUserTest() {
		ap = new AdminPage(driver);
		aup = new AddUserPage(driver);
		pp = new PimPage(driver);
		um = new UserManagementPage(driver);
		dup = new DeleteUserPage(driver);
	}
	
	@Then("Delete user")
	public void delete_user() throws InterruptedException {
		
		ap.Admin.click();
		Thread.sleep(2000);
		ap.SearchUserName.sendKeys("Jameel12");
		ap.SearchButton.click();
		
			System.out.println("User already exists");
			Thread.sleep(2000);
			dup.getDisplayedSearchUserLink().click();
			Thread.sleep(2000);
			dup.getDeleteButton().click();
			Thread.sleep(2000);	
			dup.getConfirmDelete().click();
			Thread.sleep(1000);
				 
	}

	@Then("Check if the user deleted successfully")
	public void check_if_the_user_deleted_successfully() {
		System.out.println(dup.getDynamicValidateMessage().getText());
	   Assert.assertTrue(dup.getDynamicValidateMessage().isDisplayed());
	}

}
