package com.testcase;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Utilities.ReadData;
import com.pageobject.HomePage;

public class TC_email_2 extends BaseClass {

	@Test(dataProvider="EmailData")
	public void EnterEmail(String emailid) {
		HomePage hp= new HomePage(driver);
		logger.info("URL is open");
		
		hp.Emailtxtbar(emailid);
		logger.info("enter data");
		hp.clickEmailSubmit();
		driver.navigate().back();
	}
	
	@DataProvider(name="EmailData")
	public Object[][] passData()
	{
		ReadData config= new ReadData("D:\\maven testing\\UrbanhybridProject2\\src\\test\\java\\com\\testData\\EmailData.xlsx");
		
		int row= config.getRowCount(0);
		Object[][] data= new Object[row][1];
		
		for(int i=0;i<row;i++) {
			data[i][0]=config.getData(0, i, 0);
			
		}
		return data;
	}
}
