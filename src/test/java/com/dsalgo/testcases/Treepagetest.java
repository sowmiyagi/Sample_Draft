package com.dsalgo.testcases;

import org.testng.annotations.Test;

import com.dsalgo.pageobject.Getstartedpage;
import com.dsalgo.pageobject.Homepage;
import com.dsalgo.pageobject.Loginpage;
import com.dsalgo.pageobject.Treepage;
import com.dsalgo.utilities.Baseclass;

public class Treepagetest extends Baseclass
{
	String text = "print('hello..testing tree pages')";
	@Test
	public void treetest()
	{
		Getstartedpage gp = new Getstartedpage(driver);
		gp.getstart();
		Homepage hp = new Homepage(driver);
		hp.clicksignin();
		Loginpage lp = new Loginpage(driver);
		lp.enterusername(username);
		lp.enterpassword(password);
		lp.submit();
		hp.clickTree();
		logger.info("Tree page is clicked");
		Treepage tp = new Treepage(driver);
		tp.clicklink1();
		logger.info("<---------user is on Overview of Trees--->");
		tp.clicktry();		
		tp.entertextarea(text);
		tp.clickrun();
		driver.navigate().back();		
	}
	
	@Test(priority=2)
	public void validate_treelink2()
	{
		Treepage tp = new Treepage(driver);
		tp.clicklink2();
		logger.info("<------------user is on Terminologies pages-------->");
		tp.clicktry();
		tp.entertextarea(text);
		tp.clickrun();
		driver.navigate().back();
	}
	
	@Test(priority=3)
	public void validate_treelink3()
	{
		Treepage tp = new Treepage(driver);
		tp.clicklink3();	
		logger.info("<----------user is on Types of Trees pages------->");
		tp.clicktry();
		tp.entertextarea(text);
		tp.clickrun();
		driver.navigate().back();
	}
		
	@Test(priority=4)
	public void validate_treelink4()
	{
		Treepage tp = new Treepage(driver);
		tp.clicklink4();	
		logger.info("<----------user is on Tree Traversals page --------->");
		tp.clicktry();
		tp.entertextarea(text);
		tp.clickrun();
		driver.navigate().back();
	}
	
	@Test(priority=5)
	public void validate_treelink5()
	{
		Treepage tp = new Treepage(driver);
		tp.clicklink5();	
		logger.info("<-------user is on Traversals-Illustration page ---------->");
		tp.clicktry();
		tp.entertextarea(text);
		tp.clickrun();
		driver.navigate().back();
	}
	
	@Test(priority=6)
	public void validate_treelink6()
	{
		Treepage tp = new Treepage(driver);
		tp.clicklink6();	
		logger.info("<-----------user is on Binary Trees page -------->");
		tp.clicktry();
		tp.entertextarea(text);
		tp.clickrun();
		driver.navigate().back();
	}
		
	@Test(priority=7)
	public void validate_treelink7()
	{
		Treepage tp = new Treepage(driver);
		tp.clicklink7();
		logger.info("<----------user is on Types of Binary Trees page ---------->");
		tp.clicktry();
		tp.entertextarea(text);
		tp.clickrun();
		driver.navigate().back();
	}
	
	@Test(priority=8)
	public void validate_treelink8()
	{
		Treepage tp = new Treepage(driver);
		tp.clicklink8();	
		logger.info("<--------user is on Implementation in Python page --------->");
		tp.clicktry();
		tp.entertextarea(text);
		tp.clickrun();
		driver.navigate().back();
	}
	
	@Test(priority=9)
	public void validate_treelink9()
	{
		Treepage tp = new Treepage(driver);
		tp.clicklink9();	
		logger.info("<------------user is on Binary Tree Traversals page --------->");
		tp.clicktry();
		tp.entertextarea(text);
		tp.clickrun();
		driver.navigate().back();
	}
	
	@Test(priority=10)
	public void validate_treelink10()
	{
		Treepage tp = new Treepage(driver);
		tp.clicklink10();
		logger.info("<---------user is on Implementation of Binary Trees --------->");
		tp.clicktry();
		tp.entertextarea(text);
		tp.clickrun();
		driver.navigate().back();
	}
	
	@Test(priority=11)
	public void validate_treelink11()
	{
		Treepage tp = new Treepage(driver);
		tp.clicklink11();	
		logger.info("<--------user is on Applications of Binary trees --------->");
		tp.clicktry();
		tp.entertextarea(text);
		tp.clickrun();
		driver.navigate().back();
	}
	
	@Test(priority=12)
	public void validate_treelink12()
	{
		Treepage tp = new Treepage(driver);
		tp.clicklink12();	
		logger.info("<-----------user is on Binary Search Trees page --------->");
		tp.clicktry();
		tp.entertextarea(text);
		tp.clickrun();
		driver.navigate().back();
	}
	
	@Test(priority=13)
	public void validate_treelink13()
	{
		Treepage tp = new Treepage(driver);
		tp.clicklink13();	
		logger.info("<-------------user is on Implementation Of BST page ----------->");
		tp.clicktry();
		tp.entertextarea(text);
		tp.clickrun();
		driver.navigate().back();
		logger.info("<-----All Treepages links are clicked------>");
	}
		
	
		
		
		
	
	
	public void validate_practice()
	{
		Treepage tp = new Treepage(driver);
		tp.clickpratice();
		logger.info("<----------user navigates to practice questions page ---------->");
	}

	
}
