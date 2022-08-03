package com.dsalgo.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro = new Properties();;
	public ReadConfig()
	{
		File src = new File("./configuration/config.properties");
		try
		{
			FileInputStream fis = new FileInputStream(src);
			pro.load(fis);
			}catch(Exception e) {
				System.out.println("Exception is" + e.getMessage());
			}
		
			}
	
	public String getApplicationURL()
	{
	String url = pro.getProperty("baseurl");
	return url;
	}
	
	public String getusername()
	{
	String uname = pro.getProperty("username");
	return uname;
	}
	
	public String getpassword()
	{
	String pass = pro.getProperty("password");
	return pass;
	}
	
	public String getbrowser()
	{
	String browsername = pro.getProperty("browser");
	return browsername;
	}
}
