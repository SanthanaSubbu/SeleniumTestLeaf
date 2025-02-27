package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;
import io.cucumber.java.en.When;


public class LoginPage extends BaseClass {
	
	@When("I enter the username as {string}")
	public LoginPage enterUsername(String username) {
		
		getDriver().findElement(By.id("username")).sendKeys(username);
		return this;
	}
	@When("I enter the password as {string}")
	public LoginPage enterPassword(String pass) {
		getDriver().findElement(By.id("password")).sendKeys(pass);
		return this;

	}
	@When("I click on Login Button")
	public WelcomePage clickLoginButton() {
		getDriver().findElement(By.id("Login")).click();
		WebElement home = getDriver().findElement(By.xpath("(//span[text()='Home'])[3]"));
		if(home.isDisplayed()) {
			System.out.println(home.getText());
		}
		return new WelcomePage();
	
	}

}


