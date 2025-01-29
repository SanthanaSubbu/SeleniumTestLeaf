package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBCreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver(); 
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		 driver.findElement(By.name("firstname")).sendKeys("XYZ");
		 driver.findElement(By.name("lastname")).sendKeys("abc");
		 driver.findElement(By.name("firstname")).sendKeys("XYZ");
		 driver.findElement(By.name("lastname")).sendKeys("abc");
		 driver.findElement(By.name("reg_email__")).sendKeys("cfdtrd@gmail.com");
		 driver.findElement(By.id("password_step_input")).sendKeys("12345678");
		 driver.findElement(By.xpath("//input[@value=1]")).click();
		 
		 WebElement day = driver.findElement(By.id("day"));
		 Select d = new Select(day);
		 d.selectByValue("29");
		 WebElement month = driver.findElement(By.id("month"));
		 Select m = new Select(month);
		 m.selectByVisibleText("Jun");
		 WebElement year = driver.findElement(By.id("year"));
		 Select y = new Select(year);
		 y.selectByValue("1990");
		 driver.findElement(By.name("websubmit")).click();
	}

}
