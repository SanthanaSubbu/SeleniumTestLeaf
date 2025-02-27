package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class Login extends BaseClass {
	@BeforeTest
	public void setValue() {
		fileName="Login";

	}
	
	@Test(dataProvider = "fetchData")	
	public void runLogin(String username,String pass) {
		LoginPage l = new LoginPage(driver);
		l.enterUsername(username)
		.enterPassword(pass)
		.clickLoginButton();

	}


}
