package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class registrationPage extends basePage{

	//constructor
	public registrationPage(WebDriver driver) {
		super(driver);
	}
	
	//locators
	@FindBy(xpath="//input[@id='input-firstname']") WebElement txt_first_name;
	@FindBy(xpath="//input[@id='input-lastname']") WebElement txt_last_name;
	@FindBy(xpath="//input[@id='input-email']") WebElement txt_email_id;
	@FindBy(xpath="//input[@id='input-telephone']") WebElement txt_telephone_no;
	@FindBy(xpath="//input[@id='input-password']") WebElement txt_password;
	@FindBy(xpath="//input[@id='input-confirm']") WebElement txt_confirm_password;
	@FindBy(xpath="//label[normalize-space()='Yes']") WebElement radio_subscribe;
	@FindBy(xpath="//input[@name='agree']") WebElement chk_policy;
	@FindBy(xpath="//input[@value='Continue']") WebElement btn_continue;
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']") WebElement success_msg;
	
	public void txt_first_name(String firstname) {
		txt_first_name.sendKeys(firstname);
	}
	
	public void txt_last_name(String lastname) {
		txt_last_name.sendKeys(lastname);
	}
	
	public void txt_email_id(String emailid) {
		txt_email_id.sendKeys(emailid);
	}
	
	public void txt_telephone_no(String telephoneno) {
		txt_telephone_no.sendKeys(telephoneno);
	}
	
	public void txt_password(String password) {
		txt_password.sendKeys(password);
	}
	
	public void txt_confirm_password(String password) {
		txt_confirm_password.sendKeys(password);
	}
	
	public void radio_subscribe() {
		radio_subscribe.click();
	}
	
	public void chk_policy() {
		chk_policy.click();
	}
	
	public void btn_continue() {
		btn_continue.click();
	}
	

	public String getSuccessMsg() {
		try {
			return (success_msg.getText());
		}
		catch(Exception e) {
			return (e.getMessage());	
		}
	}
}
