package com.testcase;

import org.testng.annotations.Test;

import com.pageobject.ContactPage;
import com.pageobject.HomePage;

public class TC_helpsearch_10 extends BaseClass{

	@Test
	public void entersearchbar() {
		HomePage hp= new HomePage(driver);
		ContactPage cp=new ContactPage(driver);
		hp.clickcontactpage();
		
		cp.enterdata("What is the estimated delivery time?");
		logger.info("Enter search data ");
		
	}
}
