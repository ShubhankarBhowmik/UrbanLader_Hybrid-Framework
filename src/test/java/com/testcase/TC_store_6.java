package com.testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageobject.HomePage;

public class TC_store_6 extends BaseClass {

	@Test
	public void storetitle() throws IOException {
		HomePage hp=new HomePage(driver);
		
		hp.clickstorepage();
		
		if(driver.getTitle().equals("About Us"))
		{
			Assert.assertTrue(true);
			logger.info("store title test passed");
		}
		else
		{
			captureScreen(driver,"storetitle");
			Assert.assertTrue(false);
			logger.info("store title test failed");
		}
	}
}
