package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;
import io.cucumber.java.en.When;

public class WelcomePage extends BaseClass {
	
	 @When("I click on Toggle Menu Button")
	 public WelcomePage clickOnToggle() throws InterruptedException {
		 getDriver().findElement(By.xpath("//button[@class='slds-button slds-context-bar__button slds-icon-waffle_container slds-show']")).click();
			Thread.sleep(2000);
			
		return this;
			
		}
	 @When("I click on View All option")
	 public Homepage clickOnViewAll() throws InterruptedException {
		 getDriver().findElement(By.xpath("//button[text()='View All']")).click();
		 return new Homepage();
	 }
	 
	 
	 public LoginPage clickLogout() {
		 getDriver().findElement(By.xpath("//div[contains(@class,'profileTrigger branding-user-profile')]//span[1]")).click();
		 getDriver().findElement(By.xpath("//a[contains(@class,'profile-link-label logout')]")).click();
	        return new LoginPage();
		}
	 
	
}
