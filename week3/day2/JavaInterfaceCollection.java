package week3.day2;

public class JavaInterfaceCollection implements DatabaseConnection {
	
	//Concrete class for Interface execution 

	@Override
	public void connect() {
		System.out.println("Connect");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnect");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Execute Update from Concrete class");
		//DatabaseConnection.super.executeUpdate();
	}

	public static void main(String[] args) {
		
		//Object instantiation for current class
		JavaInterfaceCollection jc = new JavaInterfaceCollection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
		
	}

}
