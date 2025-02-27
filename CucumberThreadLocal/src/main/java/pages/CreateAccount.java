package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;
import io.cucumber.java.en.When;

public class CreateAccount extends BaseClass {
	
	@When("I click on New Button")
	public CreateAccount clickNewButton() {
		getDriver().findElement(By.xpath("//div[text()='New']")).click();
		return this;
	}
	@When("I enter the account name as {string}")
	public CreateAccount enterAccountName(String accountName) {
		
		getDriver().findElement(By.xpath("//label[text()='Account Name']/following::input")).sendKeys(accountName);
          return this;
	}
	@When("select ownership as Public")
	public CreateAccount selectOwnership() {
		WebElement ownership = getDriver().findElement(By.xpath("(//span[text()='--None--'])[3]"));
		getDriver().executeScript("arguments[0].click();", ownership);
		getDriver().findElement(By.xpath("//span[text()='Public']")).click();
		return this;
	}
	@When("I click on Save")
	public ViewAccount clickCreateAccountButton(){
		getDriver().findElement(By.xpath("(//button[text()='Save'])[2]")).click();
		return new ViewAccount();

	}

}
