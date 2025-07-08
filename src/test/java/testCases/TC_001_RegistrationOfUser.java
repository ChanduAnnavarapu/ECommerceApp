package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.homePage;
import pageObjects.registrationPage;
import testBase.BaseClass;

public class TC_001_RegistrationOfUser extends BaseClass{

	@Test(groups={"sanity","Master","Regression"})
	public void registration() {
		logger.info("**Starting the execution of TC_001_RegistrationOfUser**");
		try {
		homePage hp=new homePage(driver);
		hp.clkmyaccount();
		logger.info("Clicked on My account");
		hp.clkregister();
		logger.info("Clicked on register");
		registrationPage rp=new registrationPage(driver);
		rp.txt_first_name(randomAlphabetic().toUpperCase());
		rp.txt_last_name(randomAlphabetic().toUpperCase());
		rp.txt_email_id(randomAlphabetic()+"@gmail.com");
		rp.txt_telephone_no(randomNumeric());
		
		String password=randomPassword();
		rp.txt_password(password);
		rp.txt_confirm_password(password);
		rp.radio_subscribe();
		rp.chk_policy();
		logger.info("Entered the all required details");
		rp.btn_continue();
		logger.info("clicked on continue");
		logger.info("validating expected message");
		String confirm_msg=rp.getSuccessMsg();
		if(confirm_msg.equals("Your Account Has Been Created!")) {
			Assert.assertTrue(true);
			logger.info("message is as expected");
		}
		else {
			logger.error("Test Failed...");
			logger.debug("Debug logs..");
			Assert.assertTrue(false);
		}
		//Assert.assertEquals(confirm_msg, "Your Account Has Been Created!!!");
		}
		catch(Exception e) {
			Assert.fail();
		}
		logger.info("**execution of TC_001_RegistrationOfUser is completed**");
		}
	}
