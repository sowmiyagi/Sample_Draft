package com.dsalgo.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Treepage {
	WebDriver ldriver;
	 
	 public Treepage(WebDriver rdriver)
	 {
		 ldriver = rdriver;
		 PageFactory.initElements(rdriver,this);
	 }

	 @FindBy(linkText ="Overview of Trees")WebElement Link1;
	 @FindBy(linkText ="Terminologies")WebElement Link2;
	 @FindBy(linkText ="Types of Trees")WebElement Link3;
	 @FindBy(linkText ="Tree Traversals")WebElement Link4;
	 @FindBy(linkText ="Traversals-Illustration")WebElement Link5;
	 @FindBy(linkText ="Binary Trees")WebElement Link6;
	 @FindBy(linkText ="Types of Binary Trees")WebElement Link7;
	 @FindBy(linkText ="Implementation in Python")WebElement Link8;
	 @FindBy(linkText ="Binary Tree Traversals")WebElement Link9;
	 @FindBy(linkText ="Implementation of Binary Trees")WebElement Link10;
	 @FindBy(linkText ="Applications of Binary trees")WebElement Link11;
	 @FindBy(linkText ="Binary Search Trees")WebElement Link12;
	 @FindBy(linkText ="Implementation Of BST")WebElement Link13;
	 @FindBy(xpath = "//a[@class = 'btn btn-info']")WebElement tryhere;
	 @FindBy(xpath="//form[@id='answer_form']/div/div/div/textarea")WebElement textarea1;
	 @FindBy(xpath = "//button[@type='button']")WebElement run;
	 @FindBy(linkText="Practice Questions")WebElement pratice;
	 
	 public void clicklink1() {
		 Link1.click();
	 }
	 
	 public void clicklink2() {
		 Link2.click();
	 }
	 
	 public void clicklink3() {
		 Link3.click();
	 }
	 public void clicklink4() {
		 Link4.click();
	 }
	 public void clicklink5() {
		 Link5.click();
	 }
	 
	 public void clicklink6() {
		 Link6.click();
	 }
	 
	 public void clicklink7() {
		 Link7.click();
	 }
	 public void clicklink8() {
		 Link8.click();
	 }
	 public void clicklink9() {
		 Link9.click();
	 }
	 
	 public void clicklink10() {
		 Link10.click();
	 }
	 
	 public void clicklink11() {
		 Link11.click();
	 }
	 public void clicklink12() {
		 Link12.click();
	 }
	 public void clicklink13() {
		 Link13.click();
	 }
	 public void clicktry()
	 {
		 tryhere.click(); 
	 }
	 
    public void entertextarea(String tryedit)
    {
    	textarea1.sendKeys(tryedit);	
    }
	 
    public void clickrun()
    {
    	run.click();
    }
    public void clickpratice()
    {
    	pratice.click();
    }
}

