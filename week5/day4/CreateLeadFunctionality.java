package week5.day4;

import org.testng.annotations.Test;

public class CreateLeadFunctionality extends BaseClass{

	@Test
	public void runCreateLead() {
		LoginPage l = new LoginPage(driver);
		l.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.clickCRMSFALink()
		.clickOnLeadsButton()
		.clickOnCreateLeadLink()
		.enterCompanyname()
		.enterFirstname()
		.enterLastName()
		.clickCreateLeadButton()
		.verifyLead();
	}

}
