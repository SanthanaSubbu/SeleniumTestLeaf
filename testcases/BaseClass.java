package testcases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;


public class BaseClass {
	public ChromeDriver driver;
	public String fileName;
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void preConditions(String URL,String uname,String pwd) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		

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
