package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import base.BaseClass;

public class MyAccount extends BaseClass{

	public MyAccount(ChromeDriver driver) {
		this.driver = driver;
	}
	public CreateAccount clickOnCreateAccountLink() throws InterruptedException {
		Actions a = new Actions(driver);
		WebElement salesaccounts=driver.findElement(By.xpath("//a[@title='Accounts']//span[1]"));
		a.moveToElement(salesaccounts).click().perform();
		Thread.sleep(2000);
        return new CreateAccount(driver);
	}
	
	

}
