package week5.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyHomePage extends BaseClass {
	public MyHomePage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public MyLeadsPage clickOnLeadsButton() {
		driver.findElement(By.linkText("Leads")).click();
          return new MyLeadsPage(driver);
	}

}