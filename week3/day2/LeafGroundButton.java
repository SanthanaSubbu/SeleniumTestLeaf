package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundButton {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver(); 
		 driver.get("https://leafground.com/button.xhtml");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[text()='Click']")).click();
		 Thread.sleep(2000);
		 System.out.println(driver.getTitle());
		 System.out.println("IS title Dashboard "+(driver.getTitle().toString()).equals("Dashboard"));
		 Thread.sleep(2000);
		 driver.get("https://leafground.com/button.xhtml");
		 Thread.sleep(2000);
		 System.out.println("IS Button Enabled "+(driver.findElement(By.xpath("//button[@disabled='disabled']"))).isEnabled());
		 Thread.sleep(2000);
		 WebElement button = driver.findElement(By.xpath("//span[contains(@class,'ui-button-icon-left ui-icon')]/following-sibling::span"));
		 // Get the position of the button
	     int x = button.getLocation().getX();
	     int y = button.getLocation().getY();
	     System.out.println("Button Position: X = " + x + ", Y = " + y);
	     WebElement color = driver.findElement(By.xpath("//span[text()='Save']"));
	     // Get the background color of the button
	     String backgroundColor = color.getCssValue("background-color");
	     System.out.println("Button Background Color: " + backgroundColor);
	     WebElement submit=driver.findElement(By.xpath("(//span[text()='Submit'])[2]"));
	  // Get the height and width of the button
	     int width = submit.getSize().getWidth();
	     int height = submit.getSize().getHeight();
	     System.out.println("Button Height: " + height + " px");
	     System.out.println("Button Width: " + width + " px");
	     driver.close();
	     }

}
