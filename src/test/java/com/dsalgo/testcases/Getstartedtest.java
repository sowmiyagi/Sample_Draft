package com.dsalgo.testcases;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.dsalgo.pageobject.Getstartedpage;
import com.dsalgo.utilities.Baseclass;
import com.dsalgo.utilities.Executionlistener;

@Listeners(Executionlistener.class)
public class Getstartedtest extends Baseclass
{
	
	
	@Test
	public void Getstarted() throws InterruptedException
	{
		
	//Change Test
	
		Getstartedpage gp = new Getstartedpage(driver);
		gp.getstart();
		logger.info("<-----Getstarted is clicked -------->");
		
		
		
		
		
		
	}

}
