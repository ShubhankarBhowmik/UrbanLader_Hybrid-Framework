package com.testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageobject.AboutPage;
import com.pageobject.HomePage;

public class TC_aboutele_5 extends BaseClass {

	@Test
	public void checkAbout() throws IOException {
		HomePage hp=new HomePage(driver);
		AboutPage ap= new AboutPage(driver);
		hp.clickaboutpage();
		
		
		String head= ap.checkheading();
		
		if(head.equals("About Us"))
		{
			Assert.assertTrue(true);
			logger.info("About test passed");
		}
		else
		{
			captureScreen(driver,"aboutheading");
			Assert.assertTrue(false);
			logger.info("About test failed");
		}
	}
}
