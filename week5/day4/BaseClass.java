package week5.day4;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseClass {
	public  ChromeDriver driver;
	public String fileName;
	
	@BeforeMethod
	public void preConditions() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}
	
	@AfterMethod
	public void postConditions() {
		driver.close();
	}

}
