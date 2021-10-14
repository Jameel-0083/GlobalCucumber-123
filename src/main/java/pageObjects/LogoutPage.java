package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	public WebDriver driver;
	
	public LogoutPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
				
	}
	
	
	@FindBy(xpath = "a.panelTrigger")
	WebElement settingsIcon;
	
	@FindBy(css = "a[href*='/index.php/auth/logout']")
	WebElement clickLogout;
	
	@FindBy(id = "forgotPasswordLink")
	WebElement ClickforgotPasswordLink;
	
	
	
	
public WebElement getSettingsIcon(){
	return settingsIcon;
	
}

public WebElement getClickLogout() {
	return clickLogout;
}

public WebElement getClickforgotPasswordLink()
{
	return ClickforgotPasswordLink;
}
	
	

}
