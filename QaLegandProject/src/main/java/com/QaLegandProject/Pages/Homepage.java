package com.QaLegandProject.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.QaLegandProject.Utilities.PageUtilities;




public class Homepage {
	
	public WebDriver driver;
	
	@FindBy(xpath="//div[@class='small-box bg-green']//child::a")
	WebElement client;
	@FindBy(xpath="//button[@id='search-btn']")
	WebElement checkClient;
	
	
	
	
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}
	
	
	public void clientInfo()
	{
		PageUtilities.clickOnElement(client);
	
	}
	public boolean checkingClientpage() {
		return checkClient.isDisplayed();
		
	}
	


}
