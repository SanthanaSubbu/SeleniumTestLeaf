package week5.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WelcomePage extends BaseClass {
	 public WelcomePage(ChromeDriver driver) {
		 this.driver = driver;
	 }
	
	public MyHomePage clickCRMSFALink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
         return new MyHomePage(driver);
	}
	
	
	public LoginPage clickLogout() {
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
        return new LoginPage(driver);
	}

}
