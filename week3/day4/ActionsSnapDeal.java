package week3.day4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsSnapDeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		//Initialise the driver and launch SnapDeal in Chrome
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().refresh();
		
		//Select Category from Menu
		
		WebElement menu = driver.findElement(By.linkText("Men's Fashion"));
		Actions a = new Actions(driver);
		a.moveToElement(menu).perform();
		Thread.sleep(2000);
		WebElement shoes = driver.findElement(By.xpath("//span[@class='linkTest'][1]"));
		a.moveToElement(shoes).click().perform();
		Thread.sleep(2000);

		// Get total number of products
		
		String items = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		System.out.println("Products count:" + items);

		// Choose a specific need of shoes
		
		WebElement selectType = driver.findElement(By.xpath("//div[text()='Training Shoes']"));
		a.moveToElement(selectType).click().perform();
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		Thread.sleep(5000);
		
		// Sort the elements by product price
		
		List<WebElement> prices = wait.until(
				ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//span[@class='lfloat product-price']")));
		System.out.println(prices.size());
		List<Integer> priceList = new ArrayList<Integer>();
		for (int i = 0; i < prices.size(); i++) {
			priceList.add(Integer.parseInt(prices.get(i).getAttribute("data-price")));
		}
		System.out.println("Non Sorted Pricelist: " + priceList);
		Collections.sort(priceList);
		System.out.println("Sorted Pricelist: " + priceList);
		
		//Click on Sort by Low to High

		WebElement sort = driver.findElement(By.xpath("//div[@class='sort-selected']"));
		a.moveToElement(sort).click().perform();
		Thread.sleep(2000);
		WebElement sortType = driver.findElement(By.xpath("//li[@data-sorttype='plth']"));
		a.moveToElement(sortType).click().perform();
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		Thread.sleep(5000);
		List<WebElement> newPrices = wait.until(
				ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//span[@class='lfloat product-price']")));
		System.out.println(newPrices.size());
		List<Integer> newPricesList = new ArrayList<Integer>();
		for (int i = 0; i < newPrices.size(); i++) {
			newPricesList.add(Integer.parseInt(newPrices.get(i).getAttribute("data-price")));
		}
		System.out.println("The sorted PriceList : " + newPricesList);
		
		//Validate the prices get sorted after click on Sort by Low to High by comparing the list of prices before and after sort
		
		if (priceList.equals(newPricesList)) {
			System.out.println("Sorted");
		} else {
			System.out.println("Not Sorted");

		}

		// Filter By Cost 500 to 700

		WebElement from = driver.findElement(By.xpath("//input[@name='fromVal']"));
		a.moveToElement(from).perform();
		from.clear();
		a.click(from).sendKeys("500");
		WebElement to = driver.findElement(By.xpath("//input[@name='toVal']"));
		a.moveToElement(to).perform();
		to.clear();

		a.moveToElement(to).click(to).sendKeys("700").perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
		Thread.sleep(2000);

		// Filter by Color Blue
		
		WebElement color = driver.findElement(By.xpath("//label[@for='Color_s-White%20%26%20Blue']"));
		if (color.isEnabled() == true) {
			a.moveToElement(color).click().perform();
			Thread.sleep(2000);
		}

		// Verify the filtered products count after selecting Color Blue
		
		String filteredProductCount = driver
				.findElement(By.xpath("//a[text()=' White & Blue']/following-sibling::span")).getText();
		System.out.println(filteredProductCount);
		List<WebElement> sortprices = driver.findElements(By.xpath("//div[@class='product-tuple-description ']"));
		int c = sortprices.size();
		int b = Integer.parseInt(filteredProductCount);
		boolean validateColorSelected = (c == b);
		System.out.println("Is the color shoe selected " + validateColorSelected);
		a.moveToElement(sortprices.get(0)).perform();
		WebElement QuickView = driver.findElement(By.xpath("//div[contains(@class,'center quick-view-bar')]"));

		// Select QUICK VIEW
		
		a.moveToElement(QuickView).click().perform();
		Thread.sleep(2000);

		// Take Screenshot of Product

		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("C:/Users/santh/FinalChallenge/Training/screenshots/shoes.png");
		FileUtils.copyFile(screenshot, destination);
		System.out.println(driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText());
		System.out.println(driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'close close1')]//i[1]")).click();
		driver.close();

	}

}
