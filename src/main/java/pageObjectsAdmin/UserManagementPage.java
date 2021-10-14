package pageObjectsAdmin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserManagementPage {
	
	public WebDriver driver;
	public UserManagementPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "a#menu_admin_UserManagement")
	WebElement UserManagement;
	
	@FindBy(name = "searchSystemUser[userName]")
	WebElement UserName;
	
	
	@FindBy(name = "searchSystemUser[userType]")
	WebElement UserType;
	
	@FindBy(id = "searchSystemUser_employeeName_empName")
	WebElement EmployeeName;
	
	@FindBy(name = "searchSystemUser[status]")
	WebElement Status;
	
	@FindBy(css = "input.searchbutton")
	WebElement SearchButton;
	
	@FindBy(id = "resetBtn")
	WebElement ResetButton;
	
	@FindBy(css = "input#btnAdd")
	WebElement AddButton;
	
	@FindBy(css = "input#btnDelete")
	WebElement DeleteButton;
			
	public WebElement getUserManagement() {
		return UserManagement;
	}
	
	public WebElement getUserName() {
		return UserName;
	}
	
	public WebElement getUserType() {
		return UserType;
	}
	
	public WebElement getEmployeeName() {
		return EmployeeName;
	}
	
	public WebElement getStatus() {
		return Status;
	}
	
	public WebElement getSearchButton() {
		return SearchButton;
	}
	
	public WebElement getResetButton() {
		return ResetButton;
	}
	
	public WebElement getAddButton() {
		return AddButton;
	}
	
	public WebElement getDeleteButton() {
		return DeleteButton;
	}
}
