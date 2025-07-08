package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.homePage;
import pageObjects.myAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC_004_LoginDDT extends BaseClass{
	@Test(dataProvider="LoginData" ,dataProviderClass=DataProviders.class,groups={"DataDriven"})
	public void loginDDT(String UserName,String Password,String Expected) {
		logger.info("**Starting TC_004_LoginDDT test**");
		homePage hp=new homePage(driver);
		hp.clkmyaccount();
		logger.info("clicked on my account");
		hp.clklogin();
		logger.info("clicked on login");
		LoginPage lp=new LoginPage(driver);
		lp.emailid(UserName);
		lp.password(Password);
		lp.Loginbtn();
		logger.info("entered the login details and clicked on login");
		myAccountPage map=new myAccountPage(driver);
		boolean status=map.isDisplayedMyAccount();
		if(Expected.equalsIgnoreCase("valid")) {
			if(status==true) {
				logger.info("Able to login with Valid credential");
				map.logoutbtn();
				Assert.assertTrue(true);
			}
			else {
				logger.info("Unble to login with Valid credential");
				Assert.assertTrue(false);
			}}
		if(Expected.equalsIgnoreCase("Invalid")) {
			if(status==false) {
				logger.info("Unable to login with InValid credential");
				Assert.assertTrue(true);
			}
			else {
				logger.info("Able to login with InValid credential");
				map.logoutbtn();
				Assert.assertTrue(false);
			}
		}
	}
	}