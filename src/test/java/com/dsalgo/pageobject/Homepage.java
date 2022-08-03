package com.dsalgo.pageobject;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Homepage {
	WebDriver ldriver;
	 
	 public Homepage(WebDriver rdriver)
	 {
		 ldriver = rdriver;
		 PageFactory.initElements(rdriver,this);
	 }
	 
	@FindBy(linkText = "Sign in")WebElement signin;
	@FindBy(xpath= "//div[2]//*[text()='Get Started']")WebElement Arrayget;
	@FindBy(xpath= "//div[6]//*[text()='Get Started']")WebElement Treeget;
	@FindBy(linkText = "Data Structures")WebElement dropdown;
	@FindBy(xpath= "//div[@class='dropdown-menu show']//a[1]")WebElement selectarray;
	@FindBy(xpath="//div[@class='alert alert-primary']")WebElement alert;
	@FindBy(xpath="//div[@class='dropdown-menu show']//a[@class='dropdown-item']")List<WebElement> Datadropdown;
	@FindBy(xpath="//div[@class='card-body d-flex flex-column']//h5[@class='card-title']")List<WebElement> datastrupane; 
	@FindBy(linkText = "Register")WebElement Register;
	
	 public void clicksignin()
		{
			signin.click();	
		}
	 
	 public void clickarray()
		{
		 Arrayget.click();	
		}
	 
	 public void clickTree()
		{
		 Treeget.click();	
		}
	 
	public WebElement get_datastrcturedropdown()
	{
		return dropdown;
	}
	public void Click_datastructuredropdown()
	{
		dropdown.click();
	}
    public void select_drpdownvalue()
    {
	  selectarray.click(); 
    }
	 
	 public String get_alerttext()
	 {
	   String text = alert.getText();
	   return text;	 
	 }

public String get_Dropdowntext()
{
	String result = "";
	for(WebElement drop:Datadropdown)
	{
	  result = result + drop.getText() + ",";
	  //System.out.println(drop.getText());	
	}
	
	result = result.substring(0, result.length() -1);
	
	return result;	
}

public int get_panecount()
{
	int size = datastrupane.size();
	return size;
}
public void click_register()
{
Register.click();
}
}