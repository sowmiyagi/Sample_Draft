package com.dsalgo.testcases;



import org.testng.Assert;
import org.testng.annotations.Test;

import com.dsalgo.pageobject.Getstartedpage;
import com.dsalgo.pageobject.Homepage;
import com.dsalgo.utilities.Baseclass;


public class Homepagetest extends Baseclass{
	
	@Test(priority=1)
	public void hometest()
	{
		
		
	Getstartedpage gp = new Getstartedpage(driver);	
	gp.getstart();
	Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Numpyinja"));
	
	
	logger.info("<------user is on home page and title is validated------->");	
	}
	
	
	@Test(priority=2)
	public void validate_panecount()
	{
		//driver.get("https://dsportalapp.herokuapp.com/home");
		Homepage hp = new Homepage(driver);
		int totalpane = hp.get_panecount();
		int expectedpane = 7;
		Assert.assertEquals(totalpane, expectedpane);	
		logger.info("<------Validated total no of panes in home page------>");
	}
	
	@Test(priority =3)
	public void validate_dropdownoptions()
	{
		//driver.get("https://dsportalapp.herokuapp.com/home");
		Homepage hp = new Homepage(driver);
		hp.Click_datastructuredropdown();
		String[] exp = {"Arrays","Linked List","Stack","Queue","Tree","Graph"};
		String[] Actual = hp.get_Dropdowntext().split(",");
		Assert.assertEquals(exp,Actual);
		logger.info("<------------Validated that the dropdown values are matches with expected values------>");
	}
	

	@Test(priority=4)
	public void Getstart_withoutlogin()
	{
		//driver.get("https://dsportalapp.herokuapp.com/home");
		Homepage hp = new Homepage(driver);
		hp.clickarray();
		String Expectedalertmsg = "You are not logged in";
		String Actualalertmsg = hp.get_alerttext();
		Assert.assertEquals(Actualalertmsg,Expectedalertmsg);
		logger.info("<---------User clicked Getstarted under array without log in -------->");
	}
	
	@Test(priority=5)
	public void select_Arrays_dropdown()
	{
		//driver.get("https://dsportalapp.herokuapp.com/home");
		Homepage hp = new Homepage(driver);
		hp.Click_datastructuredropdown();
		hp.select_drpdownvalue();
		String Expectedalertmsg = "You are not logged in";
		String Actualalertmsg = hp.get_alerttext();
		Assert.assertEquals(Actualalertmsg,Expectedalertmsg);
		logger.info("<---------User clicked dropdown value without log in -------->");
	}

	@Test(priority=6)
	public void click_loginfrmhome()
	{
		Homepage hp = new Homepage(driver);
		hp.clicksignin();
		logger.info("<----------user clicked sign in from home page ---------->");
		driver.navigate().back();
	}
	
	@Test(priority =7)
	public void click_registerfrmhome()
	{
		Homepage hp = new Homepage(driver);
		hp.click_register();
		logger.info("<----------user clicked Register from home page ---------->");
		driver.navigate().back();
		
	}
}
