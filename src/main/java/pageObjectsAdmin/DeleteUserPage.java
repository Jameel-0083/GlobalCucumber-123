package pageObjectsAdmin;

import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteUserPage {
	
	public WebDriver driver;
	public DeleteUserPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(css = "input.delete")
	WebElement DeleteButton;
	
	@FindBy(css = "input#searchSystemUser_userName")
	WebElement SearchUser;
	
	@FindBy(id = "searchBtn")
	WebElement SearchButton;
	
	@FindBy(xpath = "//input[starts-with(@id, 'ohrmList_chkSelectRecord_')]")
	WebElement DisplayedSearchUserLink;
	
	@FindBy(css = "input#dialogDeleteBtn")
	WebElement ConfirmDelete;
	
	@FindBy(css = "div.message.success.fadable")
	WebElement DynamicValidateMessage;
	
	//@FindBy(className = "toast-title")
	
	public WebElement getDeleteButton() {
		return DeleteButton;
	}
	
	public WebElement getSearchUser() {
		return SearchUser;
	}
	
	public WebElement getSearchButton() {
		return SearchUser;
	}
	

	public WebElement getDisplayedSearchUserLink() {
		// TODO Auto-generated method stub
		return DisplayedSearchUserLink;
	}
	
	public WebElement getConfirmDelete() {
		return ConfirmDelete;
	}
	
	public WebElement getDynamicValidateMessage() {
		return DynamicValidateMessage;
	}

}
