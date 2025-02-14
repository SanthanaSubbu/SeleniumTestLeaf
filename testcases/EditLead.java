package testcases;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class EditLead extends BaseClass {
	@DataProvider
	
	public String[][] data() {
	    return new String [][] { 
	    	{"TestLeaf","99"},
	    	{"XXX","55"}
	    	
	    	
	    };
	}
	@Test(dataProvider="data")
	
	public  void editLead(String cName,String phoneNo) throws InterruptedException {
		
		driver.findElement(By.linkText("Leads")).click();	
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phoneNo);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.name("submitButton")).click();
		
}
}






