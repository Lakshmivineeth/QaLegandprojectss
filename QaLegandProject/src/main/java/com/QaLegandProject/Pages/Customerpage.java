package com.QaLegandProject.Pages;





import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.QaLegandProject.Utilities.PageUtilities;
import com.QaLegandProject.Utilities.WaitUtilities;



public class Customerpage {
	
	public WebDriver driver;
	
	@FindBy(xpath="//select[@name='dynamic-table_length']")
	WebElement entries;
    @FindBy(xpath="//option[@value='10']")
	WebElement checkentries;
	@FindBy(xpath="//button[@class='add_c btn btn-primary']")
	WebElement addClient;
	@FindBy(id="titclienti")
	WebElement checkaddClient;
	
	
	@FindBy(id="submit")
	WebElement addClientClick;
	
	@FindBy(id="name1")
	WebElement addname;
	

	@FindBy(xpath="//table//tbody//tr[4]//td[1]")
	WebElement rowselect;
	@FindBy(xpath="//i[@class='icon fa fa-tasks tip']")
	WebElement actionbutton;
	
	@FindBy(xpath="//a[@class='bpo' and @data-html='true']")
	WebElement deleteicon;
	
	@FindBy(xpath="//button[@id='delete' and@class='btn-icon btn btn-danger']")
	WebElement alertmessage;
	
	@FindBy(xpath="//div[@class='alert alert-success']")
	WebElement clientsdeleted;
	
	@FindBy(xpath="//h1[text()='Home']")
	WebElement verifycurrentpage;
	
	@FindBy(xpath="//td[@rowspan='4'][1]")
	WebElement box;
	
	@FindBy(xpath="//h2[text()='June 2023']")
	WebElement scrollWindow;
	

	@FindBy(xpath="//button[text()='Cancel']")
	WebElement addCancel;
	
	@FindBy(xpath="//input[@class='bootbox-input bootbox-input-text form-control'] ")
	WebElement eventTitle;
	
	@FindBy(xpath="//span[@class='fc-icon fc-icon-right-single-arrow']")
	WebElement arrows;
	
	@FindBy(xpath="//span[@class='row_status label' and @data-repair='292']")
	WebElement status;
	@FindBy(xpath="//select[@id='status']")
	WebElement dropStatus;
	@FindBy(xpath="//select[@class='form-control']//child::option[1]")
	WebElement statusProgress;
	@FindBy(xpath="//span[@class='fc-icon fc-icon-right-single-arrow']")
	WebElement scrollCheck;
	@FindBy(xpath="//button[@class='add_reparation btn btn-primary' and text()=' Add Reparation            ']")
	WebElement addRepar;
	@FindBy(xpath="//a[@id='add_client']")
	WebElement clickclientRepar;
	@FindBy(xpath="//input[@id='image']")
	WebElement browse;
	@FindBy(xpath="//h4[text()='Add Client']")
	WebElement checkUpload;
	
	
	
	
	
	
	public Customerpage(WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}
	public void showEntries(int value)
	{
     PageUtilities.selectClassDropdown(entries).selectByIndex(value);
    
	}
	public String checkingshowEntries()
	{
	return checkentries.getText();
		
	}
	public void selectingEntireRow()
	{
	
	WaitUtilities.waitForElementToBeVisible(driver, rowselect);	
    PageUtilities.clickOnElement(rowselect);
	
	}
	 
	
	public void deleteEntireRow()
	{

	PageUtilities.clickOnElement(actionbutton);
	PageUtilities.clickOnElement(deleteicon);
	PageUtilities.clickOnElement(alertmessage);
	}
	public boolean checkingactiondeleteRow()
	{
		return clientsdeleted.isDisplayed();	
		
	}
	public void clientNameAdded(String n)
	
	{
	  
	PageUtilities.clickOnElement(addClient);
	PageUtilities.enterText(addname, n);
	PageUtilities.clickOnElement(addClientClick);
	}
	public String checkingAddClient()
	{
		return checkaddClient.getText();
	}
	
	
	
	public void navigationToPage(String url)
	{
	driver.navigate().to(url);
	
	}
	public String checkingnavigation()
	{
		return verifycurrentpage.getText(); 
	}
	public void scrollIntoViewPage()
	{
		PageUtilities.scrollWindow(driver,scrollWindow);
		PageUtilities.clickOnElement(box);
		
	}
	public boolean checkScrollView()
	{
		return scrollCheck.isDisplayed();
	}
	//Reparation page
	/*public void changeStatus(String urlPage)
	{
		
		
	}
	public boolean checkStatus()*/

	public void uploadFile(String path,String urlPage)
	{
		driver.navigate().to(urlPage);
		PageUtilities.clickOnElement(addRepar);
		WaitUtilities.waitForElementToBeVisible(driver,clickclientRepar);
		PageUtilities.clickOnElement(clickclientRepar);
		
		browse.sendKeys(path);
		
		
		
	}
	public boolean checkUpload()
	{
		return checkUpload.isDisplayed();
	}
	
	
}



