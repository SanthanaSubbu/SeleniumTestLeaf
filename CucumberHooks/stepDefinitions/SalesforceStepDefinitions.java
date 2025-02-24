package CucumberHooks.stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SalesforceStepDefinitions{
	public static ChromeDriver driver;
	Actions a ;

@Given("Launch the browser")
public void launch_the_browser() {
		 driver = new ChromeDriver();
    driver.manage().window().maximize();
    
   
}
@Given("I launch the URL {string}")
public void i_launch_the_url(String url) {
	driver.get(url);	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}
@When("I enter the credentials {string} and {string}")
public void i_enter_the_credentials_and(String uname, String pwd) {
	driver.findElement(By.id("username")).sendKeys(uname);
	driver.findElement(By.id("password")).sendKeys(pwd);
	
}
@When("I click on Login Button")
public void i_click_on_login_button() throws InterruptedException {
	driver.findElement(By.id("Login")).click();
	Thread.sleep(2000);
}
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
@When("I click on New Button")
public void i_click_on_new_button() {
	driver.findElement(By.xpath("//div[text()='New']")).click();
}
@When("I enter the account name")
public void i_enter_the_account_name() {
	driver.findElement(By.xpath("//label[text()='Account Name']/following::input")).sendKeys("SFTest1NewAccountName");
}
@When("I enter the account name as (.*)$")
public void i_enter_the_account_name_as(String accountName) {
	driver.findElement(By.xpath("//label[text()='Account Name']/following::input")).sendKeys(accountName);
}
@When("select ownership as Public")
public void select_ownership_as_public() {
	WebElement ownership = driver.findElement(By.xpath("(//span[text()='--None--'])[3]"));
	driver.executeScript("arguments[0].click();", ownership);
	driver.findElement(By.xpath("//span[text()='Public']")).click();
}
@When("I click on Save")
public void i_click_on_save() {
	driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
}
@Then("I verify the Accouint Name")
public void i_verify_the_accouint_name() {
	boolean alert = driver.findElement(By.xpath("//div[contains(@class,'toastContent')]")).isDisplayed();
	String alertmsg = driver.findElement(By.xpath("//span[contains(@class,'toastMessage ')]/a/div")).getText();
	if (alert) {
		System.out.println("The success message is : " + alertmsg);
	} else {
		System.out.println("No Confirmation Message");
	}
	driver.close();
}


}
