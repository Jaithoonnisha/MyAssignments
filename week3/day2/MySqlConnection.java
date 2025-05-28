package week3.day2;

public abstract class MySqlConnection implements DatabaseConnection {
	
	public void executeQuery()
	{
		System.out.println("Execute Query Method from abstract class");
	}
	
	public void executeQuery2()
	{
		System.out.println("Execute Query2 Method from abstract class");
	}
	

}
