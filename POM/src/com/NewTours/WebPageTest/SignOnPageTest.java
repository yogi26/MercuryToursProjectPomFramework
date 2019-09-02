package com.NewTours.WebPageTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.NewTours.BaseTest.BaseTest;
import com.NewTours.Utilities.TestDataProvider;
import com.NewTours.WebPage.SignOnPage;

public class SignOnPageTest extends BaseTest
{
	SignOnPage signOn;
	
	@Test(priority=1)
	public void verifyTitleTest()
	{
		signOn=PageFactory.initElements(driver, SignOnPage.class);
		signOn.clickOnsignOnLink();
		if(signOn.getPageTitle().equals("Sign-on: Mercury Tours"))
			System.out.println("Pass");
		else
			System.out.println("Fail");
	}
	@Test(priority=2, dataProvider="getTestData")
	public void signOnTest(String userName, String password)
	{
		signOn=PageFactory.initElements(driver, SignOnPage.class);
		signOn.setUserName(userName);
		signOn.setPassword(password);
		signOn.clickOnLogin();
	}
	@DataProvider
	public Object[][] getTestData()
	{
		return TestDataProvider.getTestdata("LoginTestData");
	}
	
}
