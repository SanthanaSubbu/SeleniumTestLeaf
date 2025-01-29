package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Create Lead")).click();
		 driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Dassos");
		 driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Abby");
		 driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Thomas");
		 driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("Ab");
		 driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("MR");
		 driver.findElement(By.name("departmentName")).sendKeys("Retail");
		 driver.findElement(By.name("description")).sendKeys("Management");
		 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("arer@gmail.com");
		 WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		 Select st = new Select(state);
		 st.selectByVisibleText("New York");
		 driver.findElement(By.className("smallSubmit")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.linkText("Edit")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.name("description")).clear();
		 Thread.sleep(2000);
		 driver.findElement(By.name("importantNote")).sendKeys("Edit Lead");
		 driver.findElement(By.className("smallSubmit")).click();
		 Thread.sleep(2000);
		 String Title = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		 System.out.println(Title);
		 

	}

}
