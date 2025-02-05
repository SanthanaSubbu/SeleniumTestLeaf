package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver(); 
		 driver.get("https://leafground.com/checkbox.xhtml");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[text()='Basic']")).click();	
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[text()='Ajax']")).click();	
		 Thread.sleep(2000);
		 //verify if Checkbox checked
		 String text1="Checked";
		 String text2=driver.findElement(By.className("ui-growl-title")).getText();
		 boolean isBoxChecked= (text2).equals(text1);	
		 System.out.println("Verify if checkbox Checked = " + isBoxChecked);
		 Thread.sleep(3000);
		 //verify if state changed
		 driver.findElement(By.xpath("//label[text()='Java']")).click();	
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//div[@id='j_idt87:ajaxTriState']//div)[2]")).click();
		 Thread.sleep(2000);
		 boolean isStateChanged= (driver.findElement(By.className("ui-growl-title")).getText()).equals("State has been changed.");	
		 System.out.println("Verify if state changed = " + isStateChanged);
		 //verify if toggle changed
		 driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();	
		 Thread.sleep(2000);
		 boolean isToggled= (driver.findElement(By.className("ui-growl-title")).getText()).equals("Checked");	
		 System.out.println("Verify if toggle changed = " + isToggled);
		 Thread.sleep(2000);
		 //verify if checkbox disabled
		 boolean isDisabled= (driver.findElement(By.xpath("//div[@id='j_idt87:j_idt102']")).isEnabled());	
		 System.out.println("Verify if checkbox enabled = " + isDisabled);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-triangle-1-s']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[@id='j_idt87:multiple_panel']/div[2]/ul[1]/li[1]/div[1]/div[2]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[@id='j_idt87:multiple_panel']/div[2]/ul[1]/li[3]/div[1]/div[2]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-triangle-1-s']")).click();
		 Thread.sleep(2000);
		 driver.close();

	}

}
