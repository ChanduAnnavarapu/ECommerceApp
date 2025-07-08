package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class homePage extends basePage {
	//constructor
	public homePage(WebDriver driver){
		super(driver);
	}
	
	//locators
	@FindBy(xpath="//a[@title='My Account']") WebElement linkmyacc;
	@FindBy(xpath="//a[normalize-space()='Register']") WebElement linkregister;
	@FindBy(xpath="//a[normalize-space()='Login']") WebElement linklogin;
	
	public void clkmyaccount() {
		linkmyacc.click();
	}
	
	public void clkregister() {
		linkregister.click();
	}
	
	public void clklogin() {
		linklogin.click();
	}
}
