package com.QaLegandProject.scripts;



import org.testng.Assert;
import org.testng.annotations.Test;
import com.QaLegandProject.Base.TestBase;
import com.QaLegandProject.Constants.Constants;

import com.QaLegandProject.Pages.Homepage;

public class HomeTest extends TestBase {
	 Homepage objHome;
 

  

@Test(priority=5,description="verify the user is able to check clieninfobutton",groups= {"smoke"})

  public void verifyingClientMoreInfoButton()
  {
	 objHome=new Homepage(driver);
	 objHome.clientInfo();
	 Assert.assertTrue(objHome.checkingClientpage());
	 
	
	 
	
	
  }


  

  
}




