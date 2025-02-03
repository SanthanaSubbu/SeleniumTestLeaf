package marathon1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class challenge1 {

	public static void main(String[] args) throws InterruptedException {
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("https://www.pvrcinemas.com/");
		 driver.manage().window().maximize();		 
		 driver.findElement(By.id("movie")).click();
		 driver.findElement(By.xpath("(//li[@data-pc-section='item']//span)[2]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//ul[@class='p-dropdown-items']//li[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//ul[@class='p-dropdown-items']//li[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//ul[@class='p-dropdown-items']//li[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[text()='Accept']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//span[@class='seat-current-pvr'])[2]")).click();
		 Thread.sleep(2000);
		 System.out.println("The seat booked is "+driver.findElement(By.xpath("//div[@class='seat-number']")).getText());
		 Thread.sleep(2000);
		 System.out.println("The total price is "+driver.findElement(By.xpath("//div[@class='grand-prices']")).getText());
		 driver.findElement(By.xpath("//div[@class='register-btn']")).click();
		 Thread.sleep(2000);
		 System.out.println(driver.getTitle());
	}

}
