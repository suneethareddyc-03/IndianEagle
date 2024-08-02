package com.indianeagle.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver ldriver;
	
	public HomePage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//input[@id='sourceDiv']")
	WebElement source;
	@FindBy(xpath = "//input[@id='destinationDiv']")
	WebElement destination;
	@FindBy(how = How.XPATH, using = "//div[@id='searchFlights']")
    private WebElement searchflights;
	
	public void setSource(String src)
	{
		source.sendKeys(src);
	}
	
	public void setDestination(String dst)
	{
		destination.sendKeys(dst);
	}
	
	public void clickSearchFlights()
	{
		searchflights.click();;
	}


}
