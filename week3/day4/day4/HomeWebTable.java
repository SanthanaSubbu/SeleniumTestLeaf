package week3.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWebTable {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Enter the From and To station
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("MAS");
		driver.findElement(By.xpath("//div[@title='Mgr Chennai Ctr']")).click();
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("MDU");
		driver.findElement(By.xpath("//div[@title='Madurai Jn']")).click();
		driver.findElement(By.id("chkSelectDateOnly")).click();

		// Locate the table

		WebElement table = driver.findElement(
				By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody"));
		List<WebElement> allRows = table.findElements(By.tagName("tr"));
		int rowCount = allRows.size();
		System.out.println("Row count is: " + rowCount);

		// Get the Train Name Column

		List<WebElement> entireCol = driver.findElements(
				By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr/td[2]"));
		List<String> trains = new ArrayList<>();
		for (int i = 0; i < entireCol.size(); i++) {
			trains.add(entireCol.get(i).getText());

		}
		// Remove the Duplicates
		Set<String> uniqueTrains = new HashSet<>(trains);
		for (String t : uniqueTrains) {
			System.out.println(t);
		}
	}
}
