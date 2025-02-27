package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class CreateAccountSF extends BaseClass {
	@BeforeTest
	public void setValue() {
	 fileName="CreateAccount";
	}
	
	@Test(dataProvider = "fetchData")	
	
	public void createAccount(String username,String pass,String accountName) throws InterruptedException {
		LoginPage c = new LoginPage(driver);
		c.enterUsername(username)
		.enterPassword(pass)
		.clickLoginButton()
		.clickOnToggle()
		
		.clickOnSalesButton()
		.clickOnCreateAccountLink()
		
		.enterAccountName(accountName)
		.selectOwnership()
		.clickCreateAccountButton()
		.verifyAccount();
		
		
	}


}
