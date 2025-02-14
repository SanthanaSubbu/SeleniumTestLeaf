package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Salesforce extends ProjectSpecificMethod {
	@Test
	public void createEntity() throws InterruptedException {
		//Click on Legal Entities
		WebElement selectEntity = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
		Actions a = new Actions(driver);
		a.moveToElement(selectEntity).click().perform();		
		driver.findElement(By.xpath("//div[text()='New']")).click();		
		
		//Input text to New Entity form
		
		driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys("TestLeaf");

		//Select status using Execute Script------New concept
		
		WebElement status = driver.findElement(By.xpath(
				"//button[@class='slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value']"));
		driver.executeScript("arguments[0].click();", status);
		driver.findElement(By.xpath("//span[@class='slds-truncate' and text()='Active']")).click();
		driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys("Automation");
		Thread.sleep(2000);
		
		//Click on Save and validate the alert message
		
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand' and text()='Save']")).click();
		boolean alert = driver.findElement(By.xpath("//div[contains(@class,'toastContent')]")).isDisplayed();
		  String alertmsg = driver.findElement(By.xpath("//span[contains(@class,'toastMessage ')]/a/div")).getText();
		  if (alert) {
		   System.out.println("The success message is : " + alertmsg);
		  } else {
		   System.out.println("No Confirmation Message");
		  }
		Thread.sleep(2000);

	}

}
