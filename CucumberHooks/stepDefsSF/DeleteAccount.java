package CucumberHooks.stepDefsSF;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteAccount extends BaseClass{

@When("I click on Delete from Menu")
public void i_click_on_delete_from_menu() throws InterruptedException {
	WebElement downArrowMenu = driver.findElement(By.xpath("//span[@class='slds-icon_container slds-icon-utility-down']"));
	a= new Actions(driver);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true);", downArrowMenu);
	downArrowMenu.click();
	Thread.sleep(2000);
	WebElement editClick = driver.findElement(By.xpath("//a[@data-target-selection-name='sfdc:StandardButton.Account.Delete']"));
	js.executeScript("arguments[0].scrollIntoView(true);", editClick);
	editClick.click();	
	Thread.sleep(2000);
}
@When("I confirm Delete")
public void i_confirm_delete() {
	driver.findElement(By.xpath("//button[@title='Delete']//span[1]")).click();
}
@Then("I verify the account gets Deleted")
public void i_verify_the_account_gets_deleted() {
	WebElement alertMsg = driver.findElement(By.xpath("//div[@class='slds-theme--success slds-notify--toast slds-notify slds-notify--toast forceToastMessage']"));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='slds-theme--success slds-notify--toast slds-notify slds-notify--toast forceToastMessage']")));
	System.out.println(alertMsg.isDisplayed());
	System.out.println(alertMsg.getText());
	if (alertMsg.isDisplayed()) {
		System.out.println("The success message is : " + alertMsg.getText());
	} else {
		System.out.println("No Confirmation Message");
	}
}

}
