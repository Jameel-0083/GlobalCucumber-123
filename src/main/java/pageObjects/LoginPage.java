package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//rahulonlinetutor@gmail.com
public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
				
	}
	
	
	@FindBy(id = "txtUsername")
	WebElement username;
	
	@FindBy(css = "input#txtPassword")
	WebElement password;
	
	@FindBy(css = "input#btnLogin")
	WebElement clickLogin;
	
	@FindBy(id = "MP_link")
	WebElement MarketPlace;
	
	
	
public WebElement getEmailId(){
	return username;
	
}
	
	public WebElement getPassword()
	{
		return password;
	}
	

	public WebElement getLoginClick()
	{
		return clickLogin;
	}
	
	public WebElement getMarketPlace() {
		return MarketPlace;
	}
		
	
		
}
