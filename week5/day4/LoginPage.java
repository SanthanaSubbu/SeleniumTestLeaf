package week5.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage extends BaseClass {
	public LoginPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public LoginPage enterUsername() {
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		return this;
	}
	
	public LoginPage enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;

	}
	
	public WelcomePage clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage(driver);
	
	}

}
