package week2.day3;

public class LoginTestData extends TestData {
	public  void enterUsername(String name) {
		System.out.println("ENtered String "+name);

	}
	public  void enterPassword(String pass) {
		System.out.println("ENtered password "+pass);

	}
	public static void main(String[] args) {
		LoginTestData l = new LoginTestData();
		l.enterCredentials();
		l.navigateToHomePage();
		l.enterUsername("Aryan");
		l.enterPassword("rqwrwqrwqr");
}

}
