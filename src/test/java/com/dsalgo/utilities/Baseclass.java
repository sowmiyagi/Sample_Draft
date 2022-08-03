package com.dsalgo.utilities;




import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
//import com.beust.jcommander.Parameter;
//import com.beust.jcommander.Parameters;
import com.dsalgo.utilities.ReadConfig;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;



public class Baseclass {
	
	ReadConfig readcon = new ReadConfig();
	
	public String baseurl = readcon.getApplicationURL();
	public String username = readcon.getusername();
	public String password = readcon.getpassword();
	//public String browser = readcon.getbrowser();
	public static WebDriver driver;
	public static Logger logger;
	
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String browser)
	{
		logger = Logger.getLogger("ds-algo");
		PropertyConfigurator.configure("log4j.properties");
		if(browser.equals("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		else if (browser.equals("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		} else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}	
            
			driver.get("https://dsportalapp.herokuapp.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(2000));
			driver.manage().window().maximize();
	
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}
	
	
	@AfterClass
	public void quitbrowser()
	{
		
		driver.quit();
	}
	
	
}