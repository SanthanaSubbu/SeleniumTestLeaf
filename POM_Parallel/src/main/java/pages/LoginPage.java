package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;


public class LoginPage extends BaseClass {
	public LoginPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public LoginPage enterUsername() {
		
		driver.findElement(By.id("username")).sendKeys("vidyar@testleaf.com");
		return this;
	}
	
	public LoginPage enterPassword() {
		driver.findElement(By.id("password")).sendKeys("Sales@123");
		return this;

	}
	
	public WelcomePage clickLoginButton() {
		driver.findElement(By.id("Login")).click();
		return new WelcomePage(driver);
	
	}

}


