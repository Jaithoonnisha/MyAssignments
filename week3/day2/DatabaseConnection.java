package week3.day2;

public interface DatabaseConnection {
	
	public void connect();
	public void disconnect();
	default void executeUpdate()
	{
		
	}

	
}
