package com.QaLegandProject.Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage {
	public WebDriver driver;
	@FindBy(xpath="//input[@name='identity']")
	WebElement user;
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	@FindBy(xpath="//input[@name='submit']")
	WebElement login;
	@FindBy(xpath="//h1[text()='Home']")
	WebElement homePage;
	@FindBy(xpath="//p[text()='Sign in to start your session']")
	WebElement loginPage;
	
	
	
	
	public  LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}
	public void setUsername(String uName)
	{
		user.sendKeys(uName);
	}
	public void setPassword(String pword1)
	{
		password.sendKeys(pword1);
	}
	public void clickSignIn()
	{
		login.click();
	
	}
	public String verifyHome()
	{
		return homePage.getText();
	}
	public String verifyLogin()
	{
		return loginPage.getText();
	}
	
	
	
}

	


