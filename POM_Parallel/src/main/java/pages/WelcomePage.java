package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class WelcomePage extends BaseClass {
	 public WelcomePage(ChromeDriver driver) {
		 this.driver = driver;
	 }
	 public Homepage clickOnToggle() throws InterruptedException {
		 driver.findElement(By.xpath("//button[@class='slds-button slds-context-bar__button slds-icon-waffle_container slds-show']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='View All']")).click();
		return new Homepage(driver);
			
		}
	 public LoginPage clickLogout() {
		 driver.findElement(By.xpath("//div[contains(@class,'profileTrigger branding-user-profile')]//span[1]")).click();
		 driver.findElement(By.xpath("//a[contains(@class,'profile-link-label logout')]")).click();
	        return new LoginPage(driver);
		}
	 
	
}
