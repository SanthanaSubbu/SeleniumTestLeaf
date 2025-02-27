package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import base.BaseClass;


public class LoginPage extends BaseClass {
	
	public LoginPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
		
		public LoginPage enterUsername(String username) {
			
			driver.findElement(By.id("username")).sendKeys(username);
			return this;
	}
	
		public LoginPage enterPassword(String pass) {
			driver.findElement(By.id("password")).sendKeys(pass);
			return this;

		}
	
	
	public WelcomePage clickLoginButton() {
		driver.findElement(By.id("Login")).click();
		return new WelcomePage(driver);
	
	}

}


