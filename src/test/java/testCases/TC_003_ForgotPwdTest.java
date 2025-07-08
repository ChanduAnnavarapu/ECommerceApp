package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.forgotPwdPage;
import pageObjects.homePage;
import testBase.BaseClass;

public class TC_003_ForgotPwdTest extends BaseClass{
	
	@Test(groups={"sanity","Master"})
	public void forgotPwd() {
	logger.info("** Starting TC_003_forgotPassword **");
	try {
	homePage hp=new homePage(driver);
	hp.clkmyaccount();
	logger.info("clicked on my account");
	hp.clklogin();
	logger.info("clicked on login");
	
	LoginPage lp=new LoginPage(driver);
	lp.forgotPassword();
	logger.info("clicked on forgotPassword");
	
	forgotPwdPage fpp=new forgotPwdPage(driver);
	fpp.emailid(p.getProperty("email"));
	fpp.continuebtn();
	logger.info("provided emailid and clicked on continue");
	Assert.assertTrue(lp.isDisplayedforgotPwdSubmit());
	}
	catch(Exception e) {
		logger.error("Test failed..");
		logger.debug("debug info...");
		Assert.fail();
	}
	logger.info("**execution of TC_003_forgotPassword completed **");
}}
