package CucumberHooks.Hooks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import CucumberHooks.stepDefsSF.BaseClass;

public class HooksImplementation extends BaseClass {
	public static ChromeDriver driver;
	public static Actions a;

	@Before
	public void preCondition() {
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("vidyar@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Sales@123");
		driver.findElement(By.id("Login")).click();
		
		

	}
	
	@After
	public void postCondition() {
		driver.close();

	}
	

}

