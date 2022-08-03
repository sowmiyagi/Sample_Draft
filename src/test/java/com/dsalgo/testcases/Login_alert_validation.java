package com.dsalgo.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.dsalgo.pageobject.Loginpage;
import com.dsalgo.utilities.Baseclass;

public class Login_alert_validation extends Baseclass{
	@Test
	public void logintest_pwdempty() throws InterruptedException
	{
		driver.get("https://dsportalapp.herokuapp.com/login");
		Loginpage lp = new Loginpage(driver);
		Thread.sleep(2000);
		
		logger.info("<--------user is on login page ---------->");
		lp.enterusername("dsalgouser");
		lp.enterpassword("    ");
		lp.submit();
	    String Expectedalert = "Please fill out this field.";
	    String Actualalert = lp.pwd_alert();
	    Assert.assertEquals(Expectedalert, Actualalert);
	    logger.info("alert is validated for leaving the password is empty");
	    
		}
	@Test
	public void logintest_userempty() throws InterruptedException
	{
		driver.get("https://dsportalapp.herokuapp.com/login");
		Loginpage lp = new Loginpage(driver);
		Thread.sleep(2000);
		logger.info("<--------user is on login page ---------->");
		lp.enterusername("     ");
		lp.enterpassword("Sowmiya@123");
		lp.submit();
	    String Expectedalert = "Please fill out this field.";
	    String Actualalert = lp.uname_alert();
	    Assert.assertEquals(Expectedalert, Actualalert);
	    logger.info("alert is validated for leaving the username is empty");
}
	@Test
	public void logintest_invalidcredential() throws InterruptedException
	{
		driver.get("https://dsportalapp.herokuapp.com/login");
		Loginpage lp = new Loginpage(driver);
		Thread.sleep(2000);
		logger.info("<--------user is on login page ---------->");
		lp.enterusername("dsuser");
		lp.enterpassword("Sowmiya@123");
		lp.submit();
		String Expectedalert = "Invalid Username and Password";
		String Actualalert = lp.invalidcredential();
		Assert.assertEquals(Expectedalert, Actualalert);
	    logger.info("alert is validated for entering invalid credentials");
    }
	
	
	
	
}