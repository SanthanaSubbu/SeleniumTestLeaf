package week3.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver(); 
		 driver.get("https://www.leafground.com/alert.xhtml");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		 Alert alert = driver.switchTo().alert();
		 alert.sendKeys("My project is Alert");
		 Thread.sleep(2000);
		 alert.accept();
		 System.out.println(driver.findElement(By.id("confirm_result")).getText());
	}

}
