package com.NewTours.WebPageTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.NewTours.BaseTest.BaseTest;
import com.NewTours.Utilities.TestDataProvider;
import com.NewTours.WebPage.HomePage;

public class HomePageTest extends BaseTest
{
	HomePage homePage;
	
	@Test(priority=1)
	public void verifyTitleTest()
	{
		homePage=PageFactory.initElements(driver, HomePage.class);
		if(homePage.validateLogin("Welcome: Mercury Tours"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	@Test(priority=2, dataProvider="getLoginData")
	public void signOnTest(String userName, String password)
	{
		homePage=PageFactory.initElements(driver, HomePage.class);
		homePage.setUserName(userName);
		homePage.setPassword(password);
		homePage.clickOnSignOn();
	}
	@DataProvider
	public Object[][] getLoginData()
	{
		return TestDataProvider.getTestdata("LoginTestData");
	}
	
}
