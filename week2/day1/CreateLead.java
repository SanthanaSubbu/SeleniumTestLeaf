package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Create Lead")).click();
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("LG");
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Abraham");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Thomas");
		 driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("MR");
		 driver.findElement(By.className("smallSubmit")).click();
		 boolean isTitleCorrect = driver.findElement(By.id("viewLead_generalProfTitle_sp")).getText().equals("MR");	
		 System.out.println("Is Title of person matches "+isTitleCorrect);
		 
		 Thread.sleep(2000);
		 //driver.close();
		 
	}

}
