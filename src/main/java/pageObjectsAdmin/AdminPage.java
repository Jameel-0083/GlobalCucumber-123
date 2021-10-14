package pageObjectsAdmin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.Base;

public class AdminPage extends Base {
	
	public WebDriver driver;
	public AdminPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id = "menu_admin_viewAdminModule")
	public WebElement Admin;
	
	@FindBy(id = "searchSystemUser_userName")
	public WebElement SearchUserName;
	
	@FindBy(id = "searchBtn")
	public WebElement SearchButton;
		

}
