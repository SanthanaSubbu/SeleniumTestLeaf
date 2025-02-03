package week2.day4;

public abstract class MySqlConnection implements DatabaseConnection{
	public abstract void connect();
	public abstract void disconnect();
	public abstract void executeUpdate();
	public void executeQuery() {
		System.out.println("Query executed");
	}

}
