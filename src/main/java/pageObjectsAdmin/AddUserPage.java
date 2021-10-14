package pageObjectsAdmin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUserPage {
	
	public WebDriver driver;
	public AddUserPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "input#btnAdd")
	WebElement AddUserClick;
	
	@FindBy(css = "select.formSelect")
	WebElement UserRole;
	
	@FindBy(id = "systemUser_employeeName_empName")
	WebElement AddEmployeeName;
	
	
	@FindBy(name = "systemUser[userName]")
	WebElement UserName;
	
	@FindBy(id = "systemUser_status")
	WebElement Status;
	
	@FindBy(css = "input.formInputText.password")
	WebElement Password;
	
	@FindBy(id = "systemUser_confirmPassword")
	WebElement ConfirmPassword;
	
	@FindBy(css = "input#btnSave")
	WebElement SaveButton;
	
	@FindBy(id = "btnCancel")
	WebElement CancelButton;
	
	@FindBy(css = "div.inner")
	WebElement ListOfNames;
	
	@FindBy(linkText = "Jameel")
	WebElement VerifyLink;
	
	@FindBy(css = "//span[contains(text(),'Should have at least 5 characters')]")
	WebElement UsernameValidation;
	
	@FindBy(id = "searchBtn")
	WebElement SearchButton;
	
	@FindBy(css = "div.message.success.fadable")
	public WebElement SuccessfullyAddedUserMessage;
	
	
	public WebElement getAddUserClick() {
		return AddUserClick;
	}
	
			
	public WebElement getUserRole() {
		return UserRole;
	}
	
	public WebElement getAddEmployeeName() {
		return AddEmployeeName;
	}
	
	public WebElement getUserName() {
		return UserName;
	}
	
	public WebElement getStatus() {
		return Status;
	}
	
	public WebElement getPassword() {
		return Password;
	}
	
	public WebElement getConfirmPassword() {
		return ConfirmPassword;
	}
	
	public WebElement getSaveButton() {
		return SaveButton;
	}
	
	public WebElement getCancelButton() {
		return CancelButton;
	}
	
	public WebElement getListOfNames() {
		return ListOfNames;
	}
	
	public WebElement getVerifyLink() {
		return VerifyLink;
	}
	
	public WebElement getUsernameValidation() {
		return UsernameValidation;
	}
	
	public WebElement getSearchButton() {
		return SearchButton;
	}
	
	
	
	
}
