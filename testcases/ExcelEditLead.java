package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExcelEditLead extends BaseClass{



	
	@BeforeTest
	public void setValue() {
		fileName="EditExcelLead";

	}
	
  @Test(dataProvider = "sendData")
  public  void editLead(String phoneNo,String cName) throws InterruptedException {
		
		driver.findElement(By.linkText("Leads")).click();	
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phoneNo);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.name("submitButton")).click();

	}

}
