package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExcelCreateLead extends BaseClass {
	@BeforeTest
	public void setValue() {
		fileName="ExcelCreateLead";

	}
	
  @Test(dataProvider = "sendData")
	public void runCreateLead(String company, String fName, String lName ) {
	  
	    driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.name("submitButton")).click();
		
}
}


