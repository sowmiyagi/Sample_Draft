package com.dsalgo.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Getstartedpage {
	
 WebDriver ldriver;
 
 public Getstartedpage(WebDriver rdriver)
 {
	 ldriver = rdriver;
	 PageFactory.initElements(rdriver,this);
 }
	@FindBy(xpath = "//button[@class='btn']")WebElement getstart;
	
	public void getstart()
	{
		getstart.click();	
	}
}
