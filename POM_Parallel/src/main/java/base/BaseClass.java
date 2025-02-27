package base;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import utils.ReadExcel;

public class BaseClass {
	public  ChromeDriver driver;
	public String fileName;
	
	
	@BeforeMethod
	public void preConditions() throws IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
	@AfterMethod
	public void postConditions() {
		
		driver.close();
	}
	@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException {
		return ReadExcel.readData(fileName);

	}

}


