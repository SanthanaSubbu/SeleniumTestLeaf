package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

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
		 driver.findElement(By.id("accountName")).sendKeys("Telecom");
		 driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		 driver.findElement(By.id("numberEmployees")).sendKeys("200");
		 driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		 driver.findElement(By.className("smallSubmit")).click();
			
	    boolean isTitleCorrect = driver.findElements(By.className("tabletext")).get(9).getText().equals("Selenium Automation Tester");	
	    System.out.println("Description matches "+isTitleCorrect);

	}

}
