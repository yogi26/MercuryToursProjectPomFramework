package com.NewTours.WebPageTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.NewTours.BaseTest.BaseTest;
import com.NewTours.Utilities.TestDataProvider;
import com.NewTours.WebPage.AccountSuccessPage;
import com.NewTours.WebPage.HomePage;
import com.NewTours.WebPage.RegisterPage;

public class RegisterPageTest extends BaseTest
{
	public RegisterPage register;
	public HomePage homePage;
	AccountSuccessPage accountSuccessPage;
	@Test(priority=1)
	public void verifyRegisterPageTitleTest()
	{
		register=PageFactory.initElements(driver, RegisterPage.class);
		homePage=PageFactory.initElements(driver, HomePage.class);
		homePage.clickOnRegisterLink();
		if(register.getPageTitle().equals("Register: Mercury Tours"))
			System.out.println("Pass");
		else
			System.out.println("Fail");
	}
	
	@Test(priority=2, dataProvider="registerTestData")
	public void newRegisterTest(String firstName,String lastName, String phone, String userName, String address1, String address2, String city, String state, String postalCode, String country, String email, String password, String cofirmPassword )
	{
		register=PageFactory.initElements(driver, RegisterPage.class);
		homePage=PageFactory.initElements(driver, HomePage.class);
		accountSuccessPage=PageFactory.initElements(driver, AccountSuccessPage.class); 
		homePage.clickOnRegisterLink();
		
		register.setFirstName(firstName);
		register.setLastName(lastName);
		register.setPhone(phone);
		register.setUserName(userName);
		register.setAddress1(address1);
		register.setAddress2(address2);
		register.setCity(city);
		register.setState(state);
		register.setPostalCode(postalCode);
		register.setCountry(country);
		register.setEmail(email);
		register.setPassword(password);
		register.setConfirmPassword(cofirmPassword);
		register.clickOnRegister();
		if(accountSuccessPage.validateAccountSuccessOrNot(email))
			System.out.println("Pass");
		else
			System.out.println("Fail");
	
		
	}
	@DataProvider
	public Object[][] registerTestData()
	{
		return TestDataProvider.getTestdata("RegisterTestData");
	}
}
