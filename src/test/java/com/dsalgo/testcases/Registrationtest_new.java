package com.dsalgo.testcases;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dsalgo.pageobject.Loginpage;
import com.dsalgo.pageobject.Registrationpage;
import com.dsalgo.utilities.Baseclass;

public class Registrationtest_new extends Baseclass{

	@DataProvider(name = "Registration_data")
	public static Object[][] dataprovidermethod(Method m)
	{
		
		
		if(m.getName().equalsIgnoreCase("valid_data"))
		{
			 return new Object[][] {{"Sowmiyaalgods","Sowmiya@123","Sowmiya@123"}};
		}
		else if(m.getName().equalsIgnoreCase("invalid_data")) 
		{	
			return new Object[][] {{"Sowa1234", "nsdfjshj", "jshfjsjj"}};		
		}	
		
		else if(m.getName().equalsIgnoreCase("Validate_withpwdempty")) 
		{
			return new Object[][] {{"Dsalgouser"}};			
		}
		else if(m.getName().equalsIgnoreCase("Validate_with_cfmpwd_empty"))
		
		{
			return new Object[][] {{"Sowmiyaalgods","Sowmiya@123"}};
		}
		else
		{
			return null;
		}
	}	
	
	//@Test(dataProvider="Registration_data",priority =1)
	public void valid_data(String uname, String pwd, String cpwd)
	{
		driver.get("https://dsportalapp.herokuapp.com/login");
		Loginpage lp = new Loginpage(driver);
		lp.clickreg();
		logger.info("user is on registration page");
		Registrationpage rp = new Registrationpage(driver);
		rp.enteruname(uname);
		rp.enterpass(pwd);
		rp.confirm(cpwd);
		rp.register();
	}
	
	@Test(dataProvider="Registration_data",priority =2)
	public void invalid_data(String uname, String pwd, String cpwd)
	{
		driver.get("https://dsportalapp.herokuapp.com/login");
		Loginpage lp = new Loginpage(driver);
		lp.clickreg();
		logger.info("user is on registration page");
		Registrationpage rp = new Registrationpage(driver);
		rp.enteruname(uname);
		rp.enterpass(pwd);
		rp.confirm(cpwd);
		rp.register();
		String Expectedalert = "password_mismatch:The two password fields didn’t match.";
		String Actualalert = rp.mismatchalert();
		Assert.assertEquals(Expectedalert,Actualalert);
		logger.info("validated alert for password mismatch");
	}
	
	@Test(priority =3)
	public void Validate_withallempty()
	{
		
		logger.info("user is on registration page");
		Registrationpage rp = new Registrationpage(driver);	
		rp.register();
		String Expectedalert = "Please fill out this field.";
		String Actualalert = rp.uname_alert();
		Assert.assertEquals(Expectedalert,Actualalert);
		logger.info("validated alert for all empty fields");
	}
	
	@Test(dataProvider="Registration_data",priority =4)
	 public void Validate_withpwdempty(String uname1)
	{
		
		logger.info("user is on registration page");
		Registrationpage rp = new Registrationpage(driver);
		rp.enteruname(uname1);
		rp.register();
		String Expectedalert = "Please fill out this field.";
		String Actualalert = rp.pwd_alert();
		Assert.assertEquals(Expectedalert,Actualalert);
		logger.info("validated alert for leaving the password and confirm passwords fields empty");
	}
	
	
	
	@Test(dataProvider="Registration_data",priority =5)
	public void Validate_with_cfmpwd_empty(String uname, String pwd)
	{
		logger.info("user is on registration page");
		Registrationpage rp = new Registrationpage(driver);
		rp.enteruname(uname);
		rp.enterpass(pwd);
		rp.register();
		String Expectedalert = "Please fill out this field.";
		String Actualalert = rp.cfmpwd_alert();
		Assert.assertEquals(Expectedalert,Actualalert);
		logger.info("validated alert for leaving the confirm password field empty");
	}
}
