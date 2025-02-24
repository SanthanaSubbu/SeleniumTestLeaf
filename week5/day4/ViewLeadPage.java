package week5.day4;

import org.openqa.selenium.chrome.ChromeDriver;

public class ViewLeadPage extends BaseClass {
	public  ViewLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public void verifyLead() {
		System.out.println("Lead is created");

	}
	
	

}