package com.QaLegandProject.Utilities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Point;

public class PageUtilities {
	public Alert waitForAlert(WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		Alert alert=wait.until(ExpectedConditions.alertIsPresent());
		return alert;
	}
	public void hitenter(WebDriver driver, WebElement element)
	{
		element.sendKeys(Keys.ENTER);
	}
	public void sendTestUsingMouseActions(WebDriver driver, WebElement element, String text)
	{
		Actions action=new Actions(driver);
		action.sendKeys(element,text).build().perform();		
	}
		
public void moveToElement(WebDriver driver, WebElement element)
    {
    	Actions action=new Actions(driver);
		action.moveToElement(element).build().perform();	
    }

public static Select selectClassDropdown(WebElement element) {
	Select obj=new Select(element);
	return obj;
	}
public static void  scrollWindow(WebDriver driver,WebElement element) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView()",element);
	
}
public static void clickOnElement(WebElement element) 
{
	   element.click();
}
public static void submitOnElement(WebElement element) 
{
	   element.submit();
}
public boolean isDisplay(WebElement element) 
{
		boolean status = element.isDisplayed();
		return status;
}
public boolean isEnable(WebElement element) 
{
		boolean status = element.isEnabled();
		return status;
 }
public boolean isSelect(WebElement element)
{
		boolean status = element.isSelected();
		return status;
	}
	public static WebElement enterText(WebElement element, String value)
	{
	element.sendKeys(value);
	return element;
	}
	
	public static void sendKey(WebElement element, String s)
	{
		element.sendKeys(s);
	}

	public static String getElementText(WebElement element)
	{
	return element.getText();
	}
	public static List<WebElement> findRowElements(WebElement element)
	{
	return element.findElements(By.tagName("tr"));
	}
	
	public static void clickAndHoldOnElement(WebElement element, WebDriver driver)
	{
	Actions actions = new Actions(driver);
	actions.clickAndHold(element).build().perform();
	}

	public static void selectDropdownbyText(WebElement element, String text) 
	{
	Select select = new Select(element);
	select.selectByVisibleText(text);
	}
	public static void getLocationofX1(WebElement element) 
	{
		Point location=element.getLocation();
		int elementLocationX1=location.getX();
	}
	public static void getLocationofX2(WebElement element) 
	{
		Point location=element.getLocation();
		int elementLocationX2=location.getX();
	}
	public static List<WebElement> findRowElements1(WebElement element)
	{
	return element.findElements(By.tagName("tr"));
	}
	public  void pageForward(WebDriver driver){
	    driver.navigate().forward();
	}
	public  void pageBackward(WebDriver driver){
	    driver.navigate().back();

	
}
}



