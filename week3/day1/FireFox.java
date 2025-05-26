package week3.day1;

public class FireFox extends Edge{
	
	//Overriding parent class method - takeSnap();
	
	public void takeSnap()
	{
		System.out.println("Overriding take snap method in Edge");
		System.out.println("Now calling the Edge class method");
		super.takeSnap();
	}

	public static void main(String[] args) {
		FireFox f = new FireFox();
		f.takeSnap();
	}

}
