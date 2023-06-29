package com.QaLegandProject.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;


import com.QaLegandProject.Base.TestBase;
import com.QaLegandProject.Constants.Constants;
import com.QaLegandProject.Pages.Customerpage;
import com.QaLegandProject.Pages.Homepage;

public class CustomerTest extends TestBase{
	Customerpage objCustomer;
	
  @Test(priority=6,description="verifying the selected value is listed on the entries list",groups= {"smoke"})
  public void verifyingShowEntries() {
	  
	  objCustomer=new Customerpage(driver);
	  objCustomer.showEntries(Constants.INDEXVALUE);
	  Assert.assertEquals(objCustomer.checkingshowEntries(),Constants.value);
	 
	  
	  }
  
  
 @Test(priority=7,description="verify user is able to delete the selected row using action button",retryAnalyzer=com.QaLegandProject.Listeners.RetryAnalyzer.class,groups= {"smoke"})
     public void deleteselectedrow()
   {
	  objCustomer=new Customerpage(driver);
	 
	  objCustomer.selectingEntireRow();
	  objCustomer.deleteEntireRow();
	  Assert.assertTrue(objCustomer.checkingactiondeleteRow());
	 
	}
  
  @Test(priority=8,description="verifying the name of client is added to the specific row ",retryAnalyzer=com.QaLegandProject.Listeners.RetryAnalyzer.class,groups= {"smoke"})
  public void verifyingClientAddition()
   {
	  objCustomer=new Customerpage(driver);
	  objCustomer.clientNameAdded(Constants.name);
	  Assert.assertEquals(objCustomer.checkingAddClient(),Constants.checkAdd);
}
  

  @Test(priority=9,description="verify user is able to navigate to the page from the current location",retryAnalyzer=com.QaLegandProject.Listeners.RetryAnalyzer.class,groups= {"smoke"})

  public void verifyingPageNavigation ()
  {
	  objCustomer=new Customerpage(driver);
	  objCustomer.navigationToPage(Constants.path);
	  Assert.assertEquals(objCustomer.checkingnavigation(), Constants.page);
	  
  }
 @Test(priority=10,description="verifying the page is scroll upto calender text",retryAnalyzer=com.QaLegandProject.Listeners.RetryAnalyzer.class,groups= {"smoke"})

  
  public void checkcalender()
  {
	objCustomer=new Customerpage(driver);
	objCustomer.scrollIntoViewPage();
	Assert.assertTrue(objCustomer.checkScrollView());
  }
 /*@Test(priority=11,description="verifying the status of the product in the reparation page")//retryAnalyzer=com.QaLegandProject.Listeners.RetryAnalyzer.class,groups= {"smoke"})

 
 public void verifyingStatus()
 {
	objCustomer=new Customerpage(driver);
	objCustomer.changeStatus(Constants.repUrl);
	
	Assert.assertTrue(objCustomer.changeStatus(Constants.url));
 }*/
@Test(priority=11,description="verifying picture is uploaded in the add reparation page",retryAnalyzer=com.QaLegandProject.Listeners.RetryAnalyzer.class,groups= {"smoke"})

 
 public void verifyingpictureUpload()
 {
	objCustomer=new Customerpage(driver);
	objCustomer.uploadFile(Constants.picpath,Constants.repUrl);
	Assert.assertTrue(objCustomer.checkUpload());
 }
 
  
 
  
 
}
