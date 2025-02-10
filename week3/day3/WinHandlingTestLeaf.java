package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WinHandlingTestLeaf {
	public static void main(String[] args) {
		       //Iniatialise the driver and launch browser
		
				ChromeDriver driver = new ChromeDriver();				
				driver.get("http://leaftaps.com/opentaps/control/login");				
				driver.manage().window().maximize();
				
				//Implicit wait to ensure the web page elements are fully loaded
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
				//Input Credentials
				
				  driver.findElement(By.id("username")).sendKeys("Demosalesmanager");				  
				  driver.findElement(By.id("password")).sendKeys("crmsfa");				 	  
				  driver.findElement(By.className("decorativeSubmit")).click();
				  //Click on CRM/SFA link
				  driver.findElement(By.linkText("CRM/SFA")).click(); 				 
				  driver.findElement(By.xpath("(//div[@class='x-panel-header'])[3]/a")).click();
				  
				  //Click on Merge Contacts
				  driver.findElement(By.linkText("Merge Contacts")).click();
				  
				  //Click on the widget of the "From Contact"
				  driver.findElement(By.xpath("(//input[@id='partyIdFrom']/following::a)[1]")).click();
				  
				  //Navigate to Child Window
				           
					Set<String> windowHandles1 = driver.getWindowHandles();					  
					List<String> allWindows1 = new ArrayList<String>(windowHandles1 );
					
				          //Switch the focus into new window (From Contact)
				  driver.switchTo().window(allWindows1.get(1));
				          //First resulting contact
				  driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
				 
				          //Switch the focus into parent window
				  driver.switchTo().window(allWindows1.get(0));
				  
				          //Click the Widget of the To Contact
				  driver.findElement(By.xpath("(//input[@id='partyIdFrom']/following::a)[2]")).click();
				  
				  //Navigate to Child Window
				          
				  Set<String> windowHandles2 = driver.getWindowHandles();
			              
				  List<String> allWindows2 = new ArrayList<String>(windowHandles2);
				          //Switch the focus into new window (To Contact)
				  driver.switchTo().window(allWindows2.get(1));
				          //Second resulting contact
				  driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
				 
				          //Switch the focus into parent window
				  driver.switchTo().window(allWindows1.get(0));
				          //Merge button
				  driver.findElement(By.xpath("(//input[@id='partyIdFrom']/following::a)[3]")).click();
				  //Accept the alert
				          
				  Alert alert = driver.switchTo().alert();
				         
				  alert.accept();
				  //Verify the title of the page
				  System.out.println(driver.getTitle());
				  
				  //Close the browser
				  driver.quit();
	}

}