package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.homePage;
import pageObjects.myAccountPage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass{

	@Test(groups={"sanity","Master","Regression"})
	public void login() {
		logger.info("** Starting TC_002_LoginTest **");
		try {
		homePage hp=new homePage(driver);
		hp.clkmyaccount();
		logger.info("clicked on my account");
		hp.clklogin();
		logger.info("clicked on login");
		LoginPage lp=new LoginPage(driver);
		lp.emailid(p.getProperty("email"));
		lp.password(p.getProperty("password"));
		lp.Loginbtn();
		logger.info("entered the login details and clicked on login");
		myAccountPage map=new myAccountPage(driver);
		boolean status=map.isDisplayedMyAccount();
		if(status==true) {
			logger.info("Myaccount heading is displayed");
			Assert.assertTrue(true);
		}
		else {
			logger.error("Test Failed...");
			logger.debug("Debug logs..");
			Assert.assertTrue(false);
		}
		}
		catch(Exception e) {
			Assert.fail();
		}
		logger.info("**Execution of TC_002_Logintest completed**");
	}
}
