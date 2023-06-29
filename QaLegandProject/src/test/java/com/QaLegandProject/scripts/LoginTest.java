package com.QaLegandProject.scripts;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.QaLegandProject.Pages.LoginPage;
import com.QaLegandProject.Utilities.ExcelRead;
import com.QaLegandProject.Base.TestBase;
import com.QaLegandProject.Constants.Constants;

public class LoginTest extends TestBase {
  
  LoginPage objLogin;
	@Test(dataProvider="validUserinvalidPassword",description="verifying valid Username with invalidPassword", priority=1,groups= {"smoke"})
	public void verifySignInvalidUserinvalidPassword(String userName,String password1) {

		  objLogin=new LoginPage(driver);
		  objLogin.setUsername(userName);
		  objLogin.setPassword(password1);
		  objLogin.clickSignIn();
		  Assert.assertEquals(objLogin.verifyLogin(), Constants.LoginPage);
		
		  
	}
	@Test(dataProvider="invalidUservalidPassword",description="verifying invalid Username with  validPassword",priority=2,groups= {"smoke"})
	public void verifySignIninvalidUservalidPassword(String userName,String password1) {

		  objLogin=new LoginPage(driver);
		  objLogin.setUsername(userName);
		  objLogin.setPassword(password1);
		  objLogin.clickSignIn();
		 Assert.assertEquals(objLogin.verifyLogin(), Constants.LoginPage);
		 
		  
	}
	@Test(dataProvider="invalidUserinvalidPassword",description="verifying invalid Username with  invalidPassword",priority=3,groups= {"smoke"})
	public void verifySignIninvalidUserinvalidPassword(String userName,String password1) {

		  objLogin=new LoginPage(driver);
		  objLogin.setUsername(userName);
		  objLogin.setPassword(password1);
		  objLogin.clickSignIn();
		 Assert.assertEquals(objLogin.verifyLogin(), Constants.LoginPage);
		  
		  
	}
	@Test(dataProvider="validUservalidPassword",description="verifying valid Username with  validPassword",priority=4)
	public void verifySignInvalidUservalidPassword(String uName,String pword1) {

		  objLogin=new LoginPage(driver);
		  objLogin.setUsername(uName);
		  objLogin.setPassword(pword1);
		  objLogin.clickSignIn();
		  Assert.assertEquals(objLogin.verifyHome(), Constants.HomePage);
		
		 
		  
	}
	@DataProvider
	public Object[][] validUserinvalidPassword() {
		  Object[][] data=new Object[1][2];
		  data[0][0]=ExcelRead.getCellStringData(0, 0, Constants.Sheet1);
		  data[0][1]=ExcelRead.getCellStringData(0, 1,Constants.Sheet1);
		  return data;
	}
	@DataProvider
	public Object[][] invalidUservalidPassword() {
		  Object[][] data=new Object[1][2];
		  data[0][0]=ExcelRead.getCellStringData(1, 0, Constants.Sheet1);
		  data[0][1]=ExcelRead.getCellStringData(1, 1,Constants.Sheet1);
		  return data;
	}
	@DataProvider
	public Object[][] invalidUserinvalidPassword() {
		  Object[][] data=new Object[1][2];
		  data[0][0]=ExcelRead.getCellStringData(2, 0, Constants.Sheet1);
		  data[0][1]=ExcelRead.getCellStringData(2, 1,Constants.Sheet1);
		  return data;
	}
	@DataProvider
	public Object[][] validUservalidPassword() {
		  Object[][] data=new Object[1][2];
		  data[0][0]=ExcelRead.getCellStringData(3, 0, Constants.Sheet1);
		  data[0][1]=ExcelRead.getCellStringData(3, 1,Constants.Sheet1);
		  return data;
	}
	
}
