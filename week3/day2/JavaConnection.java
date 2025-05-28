package week3.day2;

public class JavaConnection extends MySqlConnection {
	
	

	@Override
	public void connect() {
		System.out.println("Connect Method execution");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnect Method Execution");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Execute Update method Execution");
		//Overriding the execute update method from interface and calling the same using super
		super.executeUpdate();
	}

	@Override
	public void executeQuery() {
		System.out.println("Execute Query Method execution");
		//Overriding execute Query method from abstract class and calling the same using super
		super.executeQuery();
	}

	public static void main(String[] args) {
		JavaConnection javaCon = new JavaConnection();
		javaCon.connect();
		javaCon.disconnect();
		javaCon.executeUpdate();
		javaCon.executeQuery();
		javaCon.executeQuery2();

	}

}
