package stepDefinitions;
import pageObjectsRecruitment.AddCandidatePage;

import org.junit.runner.RunWith;

import io.cucumber.java.en.Then;
import pageObjectsAdmin.AddUserPage;
import pageObjectsAdmin.AdminPage;
import pageObjectsAdmin.DeleteUserPage;
import pageObjectsAdmin.UserManagementPage;
import pageObjectsPim.PimPage;
import resources.Base;


public class AddCandidate extends Base{
	
	AdminPage ap;
	AddUserPage aup;
	PimPage pp;
	UserManagementPage um;
	DeleteUserPage dup;
	AddCandidatePage acp;
	
	public AddCandidate() {
		ap = new AdminPage(driver);
		aup = new AddUserPage(driver);
		pp = new PimPage(driver);
		um = new UserManagementPage(driver);
		dup = new DeleteUserPage(driver);
		acp = new AddCandidatePage(driver);
	}

	@Then("Click on Recruitment and again click on Add Candidate Button")
	public void click_on_recruitment_and_again_click_on_add_candidate_button() throws InterruptedException {
	  acp.Recruitment.click();
	  Thread.sleep(2000);
	  acp.AddCandidateClick.click();
	
		
	}

	@Then("Provide candadate details and click on save button")
	public void provide_candadate_details_and_click_on_save_button() throws InterruptedException {
		
		  acp.Fullname.sendKeys("Jameel");
		  acp.LastName.sendKeys("Mohammed");
		  acp.SaveButton.click();
		  Thread.sleep(2000);
	    
	}

}
