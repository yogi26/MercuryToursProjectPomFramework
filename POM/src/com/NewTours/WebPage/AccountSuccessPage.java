package com.NewTours.WebPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountSuccessPage 
{
	public WebDriver driver;
	public AccountSuccessPage(WebDriver driver)
	{
		this.driver=driver;
	}
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")
	WebElement accountSuccessOrNot;
	
	public boolean validateAccountSuccessOrNot(String email)
	{
		if(accountSuccessOrNot.getText().contains(email))
			return true;
		else
			return false;
	}
}
