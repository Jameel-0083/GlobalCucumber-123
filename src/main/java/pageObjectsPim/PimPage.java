package pageObjectsPim;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PimPage {
	
	public WebDriver driver;
	
	public PimPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "menu_pim_viewPimModule")
	WebElement Pim;
	
	@FindBy(id = "menu_pim_Configuration")
	WebElement PimConfiguration;
	
	@FindBy(id = "menu_pim_listCustomFields")
	WebElement CustomFields;
	
	@FindBy(css = "input#buttonAdd")
	WebElement AddCustomField;
	
	@FindBy(css = "input.delete")
	WebElement DeleteCustomField;
	
	@FindBy(id = "customField_name")
	WebElement FieldName;
	
	@FindBy(id = "customField_screen")
	WebElement FieldScreen;
	
	@FindBy(id = "customField_type")
	WebElement FieldType;
	
	@FindBy(id = "customField_extra_data")
	WebElement SelectOptions;
	
	public WebElement getPim() {
		return Pim;
	}
	
	public WebElement getPimConfiguration() {
		return PimConfiguration;
	}
	
	public WebElement getCustomFields() {
		return CustomFields;
	}
	
	public WebElement getAddCustomField() {
		return AddCustomField;
	}
	
	public WebElement getDeleteCustomField() {
		return DeleteCustomField;
	}
	
	public WebElement getFieldName() {
		return FieldName;
	}
	
	public WebElement getFieldType() {
		return FieldType;
	}
	
	public WebElement getSelectOptions() {
		return SelectOptions;
	}

}
