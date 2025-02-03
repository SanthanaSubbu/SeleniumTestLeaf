package week2.day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioCollection {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver(); 
		 driver.get("https://www.ajio.com/");
		 driver.manage().window().maximize();
//		 driver.findElement(By.id("closeBtn")).click();
		 driver.findElement(By.name("searchVal")).sendKeys("bags");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[@class='ic-search']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//label[@for='Men']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		 Thread.sleep(2000);
		 List<WebElement> productCount = driver.findElements(By.xpath("//div[@class='item rilrtl-products-list__item item']"));
		 System.out.println("Number of Products "+productCount.size());
		 Thread.sleep(2000);
		 List<WebElement> productBrand = driver.findElements(By.xpath("//div[@class='brand']"));
		 System.out.println("Brand Name of Products: ");
		 for(int i=0;i<productBrand.size();i++) {
		 System.out.println(productBrand.get(i).getText());
		 }
		 Thread.sleep(2000);
		 List<WebElement> productName = driver.findElements(By.xpath("//div[@class='nameCls']"));
		 System.out.println("Name of Products: ");
		 for(int i=0;i<productName.size();i++) {
			 System.out.println(productName.get(i).getText());
			 }
		 driver.close();
		 }

}
