package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends basePage{
	//constructor
	public LoginPage(WebDriver driver){
		super(driver);
	}
	
	//locators
	@FindBy(xpath="//input[@id='input-email']") WebElement txt_email_id;
	@FindBy(xpath="//input[@id='input-password']") WebElement txt_password;
	@FindBy(xpath="//div[@class='form-group']//a[normalize-space()='Forgotten Password']") WebElement lnk_forgot_password;
	@FindBy(xpath="//input[@value='Login']") WebElement btn_login;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement Successmesg;
	
	//methods
	public void emailid(String email_id) {
		txt_email_id.sendKeys(email_id);
	}
	
	public void password(String password) {
		txt_password.sendKeys(password);
	}
	
	public void forgotPassword() {
		lnk_forgot_password.click();
	}
	
	public void Loginbtn() {
		btn_login.click();
	}
	
	public boolean isDisplayedforgotPwdSubmit() {
		try {
			return(Successmesg.isDisplayed());
		}
		catch(Exception e){
			return false;
		}
	}
}
