package week3.day4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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

public class ActionsAmazon {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver=new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();
		driver.navigate().refresh();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
		 driver.findElement(By.id("nav-search-submit-button")).click();
		 //List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		 List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-price']"));
		 String cartValue= price.get(0).getText();
		 System.out.println("Price of the first product: "+cartValue);
		 String rating = driver.findElement(By.xpath("//a[@class='a-popover-trigger a-declarative'][1]")).getAttribute("aria-label");
		 System.out.println("Rating for first product: "+rating);
		 //Click on First product
		 driver.findElement(By.xpath("//div[@data-cy='title-recipe'][1]")).click();
		 Thread.sleep(2000);
		 //Switch to the product window
		 Set<String> allWindowAddress = driver.getWindowHandles();
		 List<String> allWindows = new ArrayList<String>(allWindowAddress);
		 driver.switchTo().window(allWindows.get(1));
		 Thread.sleep(2000);
		 //Take Screenshot of Product
		 File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
         File destination = new File("C:/Users/santh/FinalChallenge/Training/screenshots/product.png");
         FileUtils.copyFile(screenshot, destination);
         //Add the product to cart
         Thread.sleep(2000);
          WebElement cart=driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]"));
        
         Actions a = new Actions(driver);
         a.moveToElement(cart).click().perform();
         
         Thread.sleep(3000);
         String subTotal =driver.findElement(By.xpath("//span[contains(@class,'a-size-base-plus a-color-price')]//span[1]")).getText();
         System.out.println(cartValue.toString());
         System.out.println(subTotal.toString());
         boolean isMatch = subTotal.contains(cartValue);
         System.out.println("Product total verified: "+isMatch);
         driver.quit();
         
	}

}
