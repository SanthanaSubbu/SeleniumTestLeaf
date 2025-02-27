package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import base.BaseClass;
import io.cucumber.java.en.When;


public class Homepage extends BaseClass {
	
	 @When("I click on Sales option from App Launcher")
	public MyAccount clickOnSalesButton() throws InterruptedException {
		Actions a= new Actions(getDriver());
		WebElement sales = getDriver().findElement(By.xpath("//p[text()='Sales']"));
		a.moveToElement(sales).click().perform();
		Thread.sleep(2000);
          return new MyAccount();
	}

}
