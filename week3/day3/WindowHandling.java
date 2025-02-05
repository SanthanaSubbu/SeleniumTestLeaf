package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver(); 
		 driver.get("https://www.irctc.co.in/");
		 driver.navigate().refresh();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 //Close the popup
		 driver.findElement(By.id("disha-banner-close")).click();
		 Thread.sleep(2000);
		 //Click on the menu
		 driver.findElement(By.xpath("//div[@class='h_menu_drop_button hidden-xs']")).click();
		 Thread.sleep(2000);
		 //Click on Flights
		 driver.findElement(By.xpath("//label[text()='FLIGHTS']")).click();
		 Thread.sleep(2000);
		 //Go to child Window
		 Set<String> allWindowAddress = driver.getWindowHandles();
		 List<String> allWindows = new ArrayList<String>(allWindowAddress);
		 driver.switchTo().window(allWindows.get(1));
		 Thread.sleep(2000);
		 //get Child window Title
		 System.out.println("Child WIndow Title is "+driver.getTitle());
		 Thread.sleep(2000);
		 driver.close();
		 //navigate back to parent window and get title
		 driver.switchTo().window(allWindows.get(0));
		 System.out.println("Parent WIndow Title is "+driver.getTitle());
		 driver.close();
		 }

}
