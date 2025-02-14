package week4.day4;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import testcases.ReadExcelData;

public class ProjectSpecificMethod {
	public ChromeDriver driver;
	public String fileName;
	@Parameters({"url","username","password"})
	
	
	@BeforeMethod
	public void preCondition(String URL,String uname,String pwd) throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("Login")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='slds-button slds-context-bar__button slds-icon-waffle_container slds-show']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		

	}
	@DataProvider
	public String[][] sendData() throws IOException {
		return ReadExcelData.readData(fileName);
	}
	@AfterMethod
	public void postConditions() {
		driver.close();

	}

}
