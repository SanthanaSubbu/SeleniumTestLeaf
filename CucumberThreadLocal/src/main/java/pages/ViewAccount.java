package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;
import io.cucumber.java.en.Then;

public class ViewAccount extends BaseClass{

	@Then("I verify the Accouint Name")
	public void verifyAccount() {
		System.out.println("Account is created");
		boolean alert = getDriver().findElement(By.xpath("//div[contains(@class,'toastContent')]")).isDisplayed();
		String alertmsg = getDriver().findElement(By.xpath("//span[contains(@class,'toastMessage ')]/a/div")).getText();
		if (alert) {
			System.out.println("The success message is : " + alertmsg);
		} else {
			System.out.println("No Confirmation Message");
		}

	}

}
