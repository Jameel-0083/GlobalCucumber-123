package pageObjectsRecruitment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCandidatePage {
	
	public WebDriver driver;
	public AddCandidatePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "menu_recruitment_viewRecruitmentModule")
	public WebElement Recruitment;
	
	@FindBy(id = "btnAdd")
	public WebElement AddCandidateClick;
	
	@FindBy(id = "addCandidate_firstName")
	public WebElement Fullname;
	
	@FindBy(id = "addCandidate_lastName")
	public WebElement LastName;
	
	@FindBy(id = "addCandidate_email")
	public WebElement Email;
	
	@FindBy(id = "btnSave")
	public WebElement SaveButton;
	
	
	public WebElement getRecruitment() {
		return Recruitment;
	}
	

}
