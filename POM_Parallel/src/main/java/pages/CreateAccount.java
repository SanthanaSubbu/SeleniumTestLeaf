package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class CreateAccount extends BaseClass {

	public CreateAccount(ChromeDriver driver) {
		this.driver=driver;
	}
	public CreateAccount enterAccountName() {
		driver.findElement(By.xpath("//div[text()='New']")).click();
		driver.findElement(By.xpath("//label[text()='Account Name']/following::input")).sendKeys("SFTest1NewAccountName");
          return this;
	}
	public CreateAccount selectOwnership() {
		WebElement ownership = driver.findElement(By.xpath("(//span[text()='--None--'])[3]"));
		driver.executeScript("arguments[0].click();", ownership);
		driver.findElement(By.xpath("//span[text()='Public']")).click();
		return this;
	}
	public ViewAccount clickCreateAccountButton(){
		driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
		return new ViewAccount(driver);

	}

}
