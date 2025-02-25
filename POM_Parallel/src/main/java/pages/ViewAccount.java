package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class ViewAccount extends BaseClass{

	public ViewAccount(ChromeDriver driver) {
		this.driver=driver;
	}
	public void verifyAccount() {
		System.out.println("Lead is created");

	}

}
