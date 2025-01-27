package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		 ChromeDriver driver=new ChromeDriver(); 
		 //EdgeDriver driver = new EdgeDriver();
		 driver.get("https://www.geeksforgeeks.org/");
		 driver.manage().window().maximize();
		 driver.close();

	}

}
