package week2.day4;

public class JavaConnection extends MySqlConnection {

	@Override
	public void connect() {
		System.out.println("Connect to Database");		
	}
	@Override
	public void disconnect() {
		System.out.println("Connection ends");		
	}
	@Override
	public void executeUpdate() {
		System.out.println("Executin starts");		
	}
	public static void main(String[] args) {
		JavaConnection j = new JavaConnection();
		j.connect();
		j.disconnect();
		j.executeUpdate();
		j.executeQuery();
	}

}
