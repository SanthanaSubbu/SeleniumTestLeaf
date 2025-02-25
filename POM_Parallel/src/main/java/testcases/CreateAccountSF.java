package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.CreateAccount;
import pages.LoginPage;

public class CreateAccountSF extends BaseClass {
	@Test
	public void createAccount() throws InterruptedException {
		LoginPage c = new LoginPage(driver);
		c.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.clickOnToggle()
		.clickOnSalesButton()
		.clickOnCreateAccountLink()
		.enterAccountName()
		.selectOwnership()
		.clickCreateAccountButton()
		.verifyAccount();
		
		
	}

}
