package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownCreateAccount {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Accounts")).click();
		 driver.findElement(By.linkText("Create Account")).click();
		 driver.findElement(By.id("accountName")).sendKeys("RTE");
		 driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		 WebElement industry = driver.findElement(By.name("industryEnumId"));
		 Select i = new Select(industry);
		 i.selectByValue("IND_SOFTWARE");
		 WebElement ownerShip = driver.findElement(By.name("ownershipEnumId"));
		 Select o = new Select(ownerShip);
		 o.selectByVisibleText("S-Corporation");
		 WebElement source = driver.findElement(By.name("dataSourceId"));
		 Select s = new Select(source);
		 s.selectByValue("LEAD_EMPLOYEE");
		 WebElement marketing = driver.findElement(By.id("marketingCampaignId"));
		 Select m = new Select(marketing);
		 m.selectByIndex(6);
		 WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
		 Select st = new Select(state);
		 st.selectByValue("TX");
		 driver.findElement(By.className("smallSubmit")).click();
		 

	}

}
