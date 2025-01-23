package week1.day3;

public class Browser {
	
	public String launchBrowser(String browserName) {
		return browserName;		
	}
	
	public void loadURL() {
		System.out.println("URL Loaded Successfully");
	}

	public static void main(String[] args) {
		Browser b = new Browser();		
		System.out.println(b.launchBrowser("Chrome") + " browser launched succesfully");
		b.loadURL();	

	}

}
