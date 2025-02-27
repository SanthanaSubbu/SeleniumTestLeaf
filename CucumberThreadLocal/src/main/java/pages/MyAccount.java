package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import base.BaseClass;
import io.cucumber.java.en.When;

public class MyAccount extends BaseClass{
	
	@When("I click on Accounts Tab")
	public CreateAccount clickOnCreateAccountLink() throws InterruptedException {
		Actions a = new Actions(getDriver());
		WebElement salesaccounts=getDriver().findElement(By.xpath("//a[@title='Accounts']//span[1]"));
		a.moveToElement(salesaccounts).click().perform();
		Thread.sleep(2000);
        return new CreateAccount();
	}
	
	

}
