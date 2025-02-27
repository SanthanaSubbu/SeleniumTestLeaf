package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.CreateAccount;
import pages.LoginPage;

public class CreateAccountSF extends BaseClass {
	@BeforeTest
	public void setValue() {
	 fileName="CreateAccount";
	}
	
	@Test(dataProvider = "fetchData")	
	public void createAccount(String username,String pass,String accountName) throws InterruptedException {
		LoginPage c = new LoginPage();
		c.enterUsername(username)
		.enterPassword(pass)
		.clickLoginButton()
		.clickOnToggle()
		.clickOnViewAll()
		.clickOnSalesButton()
		.clickOnCreateAccountLink()
		.clickNewButton()
		.enterAccountName(accountName)
		.selectOwnership()
		.clickCreateAccountButton()
		.verifyAccount();
		
		
	}

}
