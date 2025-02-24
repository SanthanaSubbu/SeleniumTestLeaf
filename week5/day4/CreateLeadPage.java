package week5.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeadPage extends BaseClass{
	public CreateLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public CreateLeadPage enterCompanyname() {
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	      return this;
	}
	
	public CreateLeadPage enterFirstname() {
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vineeth");
         return this;
	}
	
	public CreateLeadPage enterLastName() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajendran");
          return this;
	}
	
	
	public ViewLeadPage clickCreateLeadButton() {
		driver.findElement(By.name("submitButton")).click();
        return new ViewLeadPage(driver);
	}
}
