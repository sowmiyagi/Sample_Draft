package com.dsalgo.testcases;

import org.openqa.selenium.JavascriptExecutor;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dsalgo.pageobject.Arraypage;
import com.dsalgo.pageobject.Getstartedpage;
import com.dsalgo.pageobject.Homepage;
import com.dsalgo.pageobject.Loginpage;
import com.dsalgo.utilities.Baseclass;

public class Arraypagetest extends Baseclass{

	String text = "print('hello..testing array pages')";
	
	@Test(priority =1)
	public void  Arraypagetest1() throws InterruptedException
	{	
	Getstartedpage gp = new Getstartedpage(driver);
	gp.getstart();
	Homepage hp = new Homepage(driver);
	hp.clicksignin();
	Loginpage lp = new Loginpage(driver);
	lp.enterusername(username);
	lp.enterpassword(password);
	lp.submit();
	hp.clickarray();
	logger.info("user is on Array page");
	Arraypage ap = new Arraypage(driver);
	ap.clicklink1();	
	logger.info("<---------user is on Arrays in Python page-------->");
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,450)", "");
	ap.clicktry();	
	ap.entertextarea(text);
	ap.clickrun();
	driver.navigate().back();
	
	}
	@Test(priority=2)
	public void  Arraypagetest2()
	{
		Arraypage ap = new Arraypage(driver);
		ap.clicklink2();	
		logger.info("<---------user is on Arrays Using List page-------->");
		ap.clicktry();
		ap.entertextarea(text);
		ap.clickrun();
		driver.navigate().back();
		
	}
	
	@Test(priority=3)
	public void  Arraypagetest3()
	{
	Arraypage ap = new Arraypage(driver);	
	ap.clicklink3();
	logger.info("<---------user is on Basic Operations in Lists page-------->");
	ap.clicktry();
	ap.entertextarea(text);
	ap.clickrun();
	driver.navigate().back();
	
	}
	
	@Test(priority=4)
	public void  Arraypagetest4()
	{
	Arraypage ap = new Arraypage(driver);
	ap.clicklink4();
	logger.info("<---------user is on Applications of Array page-------->");
	ap.clicktry();
	ap.entertextarea(text);
	ap.clickrun();
	logger.info("All array links are clicked");
	driver.navigate().back();
	
	}
	
	@Test(priority =5)
	public void validate_Praticelink1() throws InterruptedException
	{
		driver.get("https://dsportalapp.herokuapp.com/array/applications-of-array/");
		Arraypage ap = new Arraypage(driver);
		ap.clickpractice();
		logger.info("<--------user clicked practice questions link------->");
		ap.clickpractice1();
		logger.info("<--------user is on Search the array page------->");
		ap.enterpracticeeditor("print('testing practice question pages')");
		ap.clickrun_practice();
	    driver.navigate().back();
	}
	
	@Test(priority =6)
	public void validate_Praticelink2() throws InterruptedException
	{
		Arraypage ap = new Arraypage(driver);
		ap.clickpractice2();
		logger.info("<--------user is on Max Consecutive Ones page------->");
		ap.enterpracticeeditor("print('testing practice question pages')");
		ap.clickrun_practice();
	    driver.navigate().back();	
	}
	
	@Test(priority =7)
	public void validate_Praticelink3() throws InterruptedException
	{
		Arraypage ap = new Arraypage(driver);
		ap.clickpractice3();
		logger.info("<--------user is on Find Numbers with Even Number of Digits page------->");
		ap.enterpracticeeditor("print('testing practice question pages')");
		ap.clickrun_practice();
	    driver.navigate().back();	
	}
	
	@Test(priority =8)
	public void validate_Praticelink4() throws InterruptedException
	{
		Arraypage ap = new Arraypage(driver);
		ap.clickpractice4();
		logger.info("<--------user is on Squares of a Sorted Array page------->");
		ap.enterpracticeeditor("print('testing practice question pages')");
		ap.clickrun_practice();
	    driver.navigate().back();	
	}
}
