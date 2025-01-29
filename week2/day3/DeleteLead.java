package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Find Leads")).click();//10767
		 driver.findElement(By.name("id")).sendKeys("10767");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[contains(text(), 'Find Leads')]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[contains(text(), '10767')]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[contains(text(), 'Delete')]")).click();
		 Thread.sleep(2000);
		 
	}

}
