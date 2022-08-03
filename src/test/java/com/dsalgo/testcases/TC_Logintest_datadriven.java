package com.dsalgo.testcases;

import java.io.IOException;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.dsalgo.pageobject.Loginpage;
import com.dsalgo.utilities.Baseclass;
import com.dsalgo.utilities.XLUtility;



public class TC_Logintest_datadriven extends Baseclass {
	@Test(dataProvider="LoginData")
	public void logintest(String uname, String pwd) throws InterruptedException
	{
		driver.get("https://dsportalapp.herokuapp.com/login");
		Loginpage lp = new Loginpage(driver);
		Thread.sleep(2000);
		logger.info("<--------user is on login page ---------->");
		lp.enterusername(uname);
		
		lp.enterpassword(pwd);
		lp.submit();
		
		}
		
		
	@DataProvider(name="LoginData")
	public String[][] getData() throws IOException
	{
		String path = System.getProperty("user.dir")+"/src/test/java/com/dsalgo/testdata/logindata.xlsx";
		//System.out.println("path -" + path);
		
		XLUtility xl = new XLUtility(path);
		
		
		int rownum = xl.getRowCount("Sheet1");
		int colcount = xl.getCellCount("Sheet1",1);
		
		String logindata[][]=new String[rownum][colcount];
		//System.out.println("logindata -" + logindata[0]);
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				//System.out.println("i -" + i + "j -" + j);
				
				logindata[i-1][j]=xl.getCellData("Sheet1",i,j);
			//	System.out.println("logindata -" + logindata[i-1][j]);
				
			}
		}
		return logindata;
	}

}
