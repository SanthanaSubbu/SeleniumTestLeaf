package week3.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver(); 
		 driver.get("https://www.leafground.com/alert.xhtml");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		 Alert alert = driver.switchTo().alert();
		 System.out.println(alert.getText());
		 alert.accept();
	}

}
