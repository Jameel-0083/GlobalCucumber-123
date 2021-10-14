package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class ForgotPassword {

	public WebDriver driver;

	public ForgotPassword(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "a[href*='/index.php/auth/requestPasswordResetCode']")
	WebElement forgotpassword;

	@FindBy(id = "securityAuthentication_userName")
	WebElement RegisteredEmail;
	
	@FindBy(css = "button.ui.fluid.large.blue.submit.button")
	WebElement ClickResetPwd;
	
	@FindBy(css = "input.cancel")
	List<WebElement> ResetCancel;
	
	

	public WebElement getForgotPassword() {
		return forgotpassword;
	}
	
	public WebElement getRegisteredEmail() {
		return RegisteredEmail;
	}
	
	public WebElement getClickResetPwd() {
		return ClickResetPwd;
	}
	
	public List<WebElement> getResetCancel() {
		return ResetCancel;
	}

}
