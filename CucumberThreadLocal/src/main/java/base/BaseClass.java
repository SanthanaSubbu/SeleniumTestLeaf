package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import utils.ReadExcel;

public class BaseClass  extends AbstractTestNGCucumberTests{
	
	public String fileName;
	private static final ThreadLocal<ChromeDriver> cDriver = new ThreadLocal<ChromeDriver>();
	public void setDriver() {
		cDriver.set(new ChromeDriver());
	}
	
	public ChromeDriver getDriver() {
		ChromeDriver chromeDriver = cDriver.get();
		return chromeDriver;
	}
	@BeforeMethod
	public void preConditions() {
		setDriver();
		getDriver().manage().window().maximize();
		getDriver().get("https://login.salesforce.com/");
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}
	
	@AfterMethod
	public void postConditions() {
		getDriver().close();
	}
	@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException {
		return ReadExcel.readData(fileName);

	}

}


