package com.testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageobject.HomePage;

public class TC_contact_8 extends BaseClass {

	@Test
	public void contacttitle() throws IOException {
		
		HomePage hp= new HomePage(driver);
		
		hp.clickcontactpage();
		
		if(driver.getTitle().equals("About Us"))
		{
			Assert.assertTrue(true);
			logger.info("store title test passed");
		}
		else
		{
			captureScreen(driver,"contacttitle");
			Assert.assertTrue(false);
			logger.info("store title test failed");
		}
	}
}
