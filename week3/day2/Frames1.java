package week3.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver(); 
		 driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[text()='Try it']")).click();	
		 Thread.sleep(2000);
		 Alert a =driver.switchTo().alert();
		 a.accept();
		 System.out.println(driver.findElement(By.id("demo")).getText());
		 driver.switchTo().defaultContent();
	}

}
