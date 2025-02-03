package marathon1;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Challenge2 {

	public static void main(String[] args) throws InterruptedException {
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();
		 driver.navigate().refresh();
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys");
		 driver.findElement(By.id("nav-search-submit-button")).click();
		 Thread.sleep(2000);
		 System.out.println(driver.findElement(By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']")).getText());
		  WebElement checkbox1 =driver.findElements(By.xpath("//input[@type='checkbox']")).get(2);
		 ((JavascriptExecutor) driver).executeScript("arguments[0].click();", checkbox1);
		 WebElement checkbox2 =driver.findElements(By.xpath("//input[@type='checkbox']")).get(1);
		 Thread.sleep(2000);
		 ((JavascriptExecutor) driver).executeScript("arguments[0].click();", checkbox2);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[text()='Featured']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.linkText("Newest Arrivals")).click();
		 Thread.sleep(2000);
		 String name = driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base']")).get(0).getText();
		 System.out.println("Product name: "+name);
		 String price = driver.findElements(By.xpath("//span[@class='a-price-whole']")).get(0).getText();
		 System.out.println("Product price: "+price);
		 System.out.println("Page Title: "+driver.getTitle());
		 
	}

}
