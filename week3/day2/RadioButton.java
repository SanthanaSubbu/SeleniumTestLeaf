package week3.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver(); 
		 driver.get("https://www.leafground.com/radio.xhtml");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 //Click on Radio Button-Any fav Browser 
		 driver.findElement(By.xpath("//label[@for='j_idt87:console1:2']")).click();
		 Thread.sleep(2000);
		//Click on Radio Button-Any fav City 
		 driver.findElement(By.xpath("//label[@for='j_idt87:city2:1']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//label[@for='j_idt87:city2:1']")).click();
		 Thread.sleep(2000);
		 boolean isSelected = driver.findElement(By.xpath("//label[@for='j_idt87:city2:1']")).isSelected();
		 System.out.println("City Radio Button is Selected  "+isSelected);
		 Thread.sleep(2000);
		 //get the text of Default Radio Button selected for Browser
		 List<WebElement> radioButtons =driver.findElements(By.xpath("//input[@name='j_idt87:console2']")); 
		 for (int i=0;i< radioButtons.size();i++) {
			 			 if (radioButtons.get(i).isSelected()==true) {	
				 WebElement label = driver.findElement(By.xpath("//label[@for='" + radioButtons.get(i).getAttribute("id") + "']"));
				 System.out.println("Browser Radio Button  Selected By Default is "+ label.getText());
			 }
		 }
		  Thread.sleep(2000);
		  //Click on age 21-40yrs
		  WebElement age = driver.findElement(By.xpath("//label[text()='21-40 Years']"));
		  if(age.isSelected()==false) {
			  age.click();
		  }
		  Thread.sleep(2000);
		 driver.close();

	}

}
