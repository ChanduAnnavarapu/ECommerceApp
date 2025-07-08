package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class myAccountPage extends basePage{
	
	//constructor
	public myAccountPage(WebDriver driver){
			super(driver);
	}
	
	//locators
	@FindBy(xpath="//h2[normalize-space()='My Account']") WebElement msgHeading;
	@FindBy(xpath="//a[normalize-space()='Edit your account information']") WebElement linkEditAccInfo;
	@FindBy(xpath="//a[normalize-space()='Change your password']") WebElement linkChangePwd;
	@FindBy(xpath="//a[normalize-space()='Modify your address book entries']") WebElement LinkModifyAddress;
	@FindBy(xpath="//a[normalize-space()='Modify your wish list']") WebElement linkModifyWishList;
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']") WebElement linkLogout;
	
	//Action
	public boolean isDisplayedMyAccount() {
		try {
			return(msgHeading.isDisplayed());
		}
		catch(Exception e){
			return false;
		}
	}
	
	public void logoutbtn() {
		linkLogout.click();
	}
	
	
}

