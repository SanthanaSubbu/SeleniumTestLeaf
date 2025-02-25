package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class Login extends BaseClass {
	@Test
	public void runLogin() {
		LoginPage l = new LoginPage(driver);
		l.enterUsername()
		.enterPassword()
		.clickLoginButton();

	}

}
