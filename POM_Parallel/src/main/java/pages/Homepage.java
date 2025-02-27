package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import base.BaseClass;


public class Homepage extends BaseClass {
	
	 public Homepage(ChromeDriver driver) {
		 this.driver = driver;
	 }
	
	public MyAccount clickOnSalesButton() throws InterruptedException {
		Actions a= new Actions(driver);
		WebElement sales = driver.findElement(By.xpath("//p[text()='Sales']"));
		a.moveToElement(sales).click().perform();
		Thread.sleep(2000);
          return new MyAccount(driver);
	}

}
