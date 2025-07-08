package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class forgotPwdPage extends basePage{
	//constructor
		public forgotPwdPage(WebDriver driver){
				super(driver);
		}
		
	//locators
	@FindBy(xpath="//input[@id='input-email']") WebElement	txt_email;
	@FindBy(xpath="//a[normalize-space()='Back']") WebElement	btn_back;
	@FindBy(xpath="//input[@value='Continue']") WebElement	btn_continue;
	@FindBy(xpath="//h1[normalize-space()='Forgot Your Password?']") WebElement	pagetext;
	
	//Actions
	public boolean isDisplayedForgetPassword() {
		try {
			return(pagetext.isDisplayed());
		}
		catch(Exception e){
			return false;
		}
	}
	
	public void emailid(String email) {
		txt_email.sendKeys(email);
	}
	
	public void backbtn() {
		btn_back.click();
	}
	
	public void continuebtn() {
		btn_continue.click();
	}
}
