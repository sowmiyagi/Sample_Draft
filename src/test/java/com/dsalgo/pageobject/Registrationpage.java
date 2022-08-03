package com.dsalgo.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registrationpage {
	
	WebDriver ldriver;
	 
	 public Registrationpage(WebDriver rdriver)
	 {
		 ldriver = rdriver;
		 PageFactory.initElements(rdriver,this);
	 }
		@FindBy(id= "id_username")WebElement uname;
		@FindBy(id= "id_password1")WebElement userpass;
		@FindBy(id= "id_password2")WebElement confirmpass;
		@FindBy(xpath="//input[@type='submit']")WebElement submit;
		@FindBy(xpath="//div[@class='alert alert-primary']")WebElement pwdmismatchalert;
		
		
		
		public void enteruname(String user)
		{
			uname.sendKeys(user);	
			
		}
		public void enterpass(String password)
		{
			userpass.sendKeys(password);	
		}

		public void confirm(String cpassword)
		{
			confirmpass.sendKeys(cpassword);	
		}
		
		public void register()
		{
			submit.click();
		}
		
		public String mismatchalert()
		{
			
			String text = pwdmismatchalert.getText();
			return text;	 
			 
		}
		public String uname_alert()
		{
			String text = uname.getAttribute("validationMessage");
			return text;
		}
		
		public String pwd_alert()
		{
			String text = userpass.getAttribute("validationMessage");
			return text;
		}
		
		public String cfmpwd_alert()
		{
			String text = confirmpass.getAttribute("validationMessage");
			return text;
		}	
}
