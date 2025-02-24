package CucumberHooks.stepDefsSF;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditSalesforce extends BaseClass {
	
	@When("I click on Toggle Menu Button")
	public void i_click_on_toggle_menu_button() throws InterruptedException {
		driver.findElement(By.xpath("//button[@class='slds-button slds-context-bar__button slds-icon-waffle_container slds-show']")).click();
		Thread.sleep(2000);
	}
	@When("I click on View All option")
	public void i_click_on_view_all_option() {
		driver.findElement(By.xpath("//button[text()='View All']")).click();
	}
	@When("I click on Sales option from App Launcher")
	public void i_click_on_sales_option_from_app_launcher() throws InterruptedException {
		a= new Actions(driver);
		WebElement sales = driver.findElement(By.xpath("//p[text()='Sales']"));
		a.moveToElement(sales).click().perform();
		Thread.sleep(2000);
	}
	@When("I click on Accounts Tab")
	public void i_click_on_accounts_tab() throws InterruptedException {
		a= new Actions(driver);
		WebElement salesaccounts=driver.findElement(By.xpath("//a[@title='Accounts']//span[1]"));
		a.moveToElement(salesaccounts).click().perform();
		Thread.sleep(2000);
	}

	@When("I search the Account name {string}")
	public void i_search_the_account_name(String accName) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='Account-search-input']")).sendKeys(accName);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='Account-search-input']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	}
	@When("select Edit Account Name")
	public void select_edit_account_name() throws InterruptedException {
		
		WebElement downArrowMenu = driver.findElement(By.xpath("//span[@class='slds-icon_container slds-icon-utility-down']"));
		a= new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", downArrowMenu);
		downArrowMenu.click();
		Thread.sleep(2000);
		WebElement editClick = driver.findElement(By.xpath("//a[@data-target-selection-name='sfdc:StandardButton.Account.Edit']"));
		js.executeScript("arguments[0].scrollIntoView(true);", editClick);
		editClick.click();	
		Thread.sleep(2000);
	}
	@When("I edit the account name as {string}")
	public void i_edit_the_account_name_as(String editAccountName) {
		driver.findElement(By.xpath("//label[text()='Account Name']/following::input")).clear();
		driver.findElement(By.xpath("//label[text()='Account Name']/following::input")).sendKeys(editAccountName);
	}
//
//@When("I click on Save")
//public void i_click_on_save() throws InterruptedException {
//	driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
//	
//}
@Then("I verify the Account Name")
public void i_verify_the_account_name() {
	WebElement alertMsg = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']"));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")));
	System.out.println(alertMsg.isDisplayed());
	System.out.println(alertMsg.getText());
	if (alertMsg.isDisplayed()) {
		System.out.println("The success message is : " + alertMsg.getText());
	} else {
		System.out.println("No Confirmation Message");
	}

	
}


}
