package week5.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyLeadsPage extends BaseClass {
	public MyLeadsPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public CreateLeadPage clickOnCreateLeadLink() {
		driver.findElement(By.linkText("Create Lead")).click();
        return new CreateLeadPage(driver);
	}

}