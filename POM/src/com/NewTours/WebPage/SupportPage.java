package com.NewTours.WebPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SupportPage 
{
	public WebDriver driver;
	public SupportPage(WebDriver driver)
	{
		this.driver=driver;
	}
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a")
	WebElement backToHomeLink;
	
	public void clickOnBackToHomeLink()
	{
		backToHomeLink.click();
	}
	public String getPageTitle()
	{
		return driver.getTitle();
	}
}
