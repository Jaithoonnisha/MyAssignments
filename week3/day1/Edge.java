package week3.day1;

public class Edge extends Browser{
	
	public void takeSnap()
	{
		System.out.println("takeSnap() method, From Edge class");

	}
	
	public void clearCookies()
	{
		System.out.println("clearCookies() method, From Edge class");
	}
	
	

	public static void main(String[] args) {
		
		Edge ed = new Edge();
		//Parent class methods
		ed.openUrl();
		ed.closeBrowser();
		//Child class methods
		ed.takeSnap();
		ed.clearCookies();
		
	}

}
