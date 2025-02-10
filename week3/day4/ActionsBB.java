package week3.day4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsBB {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions a = new Actions(driver);
		// Select Category
		
		a.moveToElement(driver.findElement(By.xpath("(//button[contains(@class,'h-full px-2.5')])[2]"))).click()
				.perform();
		Thread.sleep(2000);
		
		// Select Rice
		
		a.moveToElement(driver.findElement(By.xpath("//div[@id='headlessui-menu-items-:R9bab6:']/nav/ul/li[5]")))
				.perform();
		a.moveToElement(driver.findElement(By.xpath("//a[text()='Rice & Rice Products']"))).perform();
		a.moveToElement(driver.findElement(By.xpath("//a[text()='Boiled & Steam Rice']"))).click().perform();
		Thread.sleep(2000);
		a.moveToElement(driver.findElement(By.xpath("//h3[text()='Tamil Ponni Boiled - Rice']"))).click().perform();
		Thread.sleep(2000);
		
		// Switch to the product window
		
		Set<String> allWindowAddress = driver.getWindowHandles();
		List<String> allWindows = new ArrayList<String>(allWindowAddress);
		driver.switchTo().window(allWindows.get(1));
		Thread.sleep(2000);
		
		// Select quantity
		
		a.moveToElement(driver.findElement(By.xpath("//span[text()='5 kg']"))).click().perform();
		Thread.sleep(2000);
		
		// Check price
		
		String actualPrice = driver.findElement(By.xpath(
				"(//span[contains(@class,'Label-sc-15v1nk5-0 PackSizeSelector___StyledLabel5-sc-l9rhbt-5')])[2]"))
				.getText();
		String price = driver.findElement(By.xpath("//td[@class='Description___StyledTd-sc-82a36a-4 fLZywG']"))
				.getText();
		System.out.println(actualPrice);
		System.out.println(price);
		if (price.contains(actualPrice)) {
			System.out.println("Right price");
		}
		
		// Add the product and verify success message
		
		driver.findElement(By.xpath("//button[text()='Add to basket']")).click();
		Thread.sleep(3000);
		System.out.println(
				driver.findElement(By.xpath("//div[@class='Toast___StyledDiv-sc-1uergwq-0 kLrmgR']")).getText());
		Thread.sleep(3000);
		
		// Take Screenshot of Product
		
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("C:/Users/santh/FinalChallenge/Training/screenshots/AddCart.png");
		FileUtils.copyFile(screenshot, destination);		
		driver.close();		
		driver.switchTo().window(allWindows.get(0));		
		driver.close();
	}

}
