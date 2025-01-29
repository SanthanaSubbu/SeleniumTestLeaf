package week2.day1;

public class Safari extends Edge {
	public void readerMode() {
		System.out.println("SubClass3:Method1");

	}
	public void fullScreenMode() {
		System.out.println("SubClass3:Method2");

	}
	
	public static void main(String[] args) {
		Safari e = new Safari();
		e.openURL();
		e.closeBrowser();
		e.navigate();
		e.openIncognito();
		e.clearCache();
		e.takeSnap();
		e.clearCookies();
		e.readerMode();
		e.fullScreenMode();
		
		
	}

}
