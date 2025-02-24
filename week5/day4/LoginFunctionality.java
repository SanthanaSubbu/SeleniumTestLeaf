package week5.day4;

import org.testng.annotations.Test;

public class LoginFunctionality extends BaseClass {
		
	@Test
	public void login() {
		LoginPage l = new LoginPage(driver);
		l.enterUsername()
		.enterPassword()
		.clickLoginButton();
		

}
}
