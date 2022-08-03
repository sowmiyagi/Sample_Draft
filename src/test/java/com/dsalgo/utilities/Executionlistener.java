package com.dsalgo.utilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import io.qameta.allure.Attachment;

public class Executionlistener implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		saveScreenshotOnFailure(Baseclass.getDriver());
		saveLogs(result.getMethod().getConstructorOrMethod().getName());		
	}
	
@Attachment(value="Screenshot", type="image/png")
public byte[] saveScreenshotOnFailure(WebDriver driver) {
	return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
}

@Attachment(value ="Screenshottest", type="text/plain")
public static String saveLogs(String message)
{
	return message;
}
}