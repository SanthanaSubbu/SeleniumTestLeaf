package week2.day4;

public class ConcreteClass implements DatabaseConnection {

	@Override
	public void connect() {
		System.out.println("...Connecting to DB....");
		
	}

	@Override
	public void disconnect() {
		System.out.println("...Disconnect DB....");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("...Execute and then UPDATE....");
		
	}
	public static void main(String[] args) {
		ConcreteClass c = new ConcreteClass();
		c.connect();
		c.disconnect();
		c.executeUpdate();
	}
}
