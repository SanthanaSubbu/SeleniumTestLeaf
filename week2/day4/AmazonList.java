package week2.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonList {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver(); 
		 driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("smart phones");
		 driver.findElement(By.id("nav-search-submit-button")).click();
		 List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		 List<Integer> prices = new ArrayList<>();
		 for (WebElement priceElement : price) {
             String priceText = priceElement.getText().replaceAll("[^0-9]", "");
             int cost = Integer.parseInt(priceText);
             prices.add(cost);
            
		 }
		 System.out.println(Collections.min(prices));
	}
}
