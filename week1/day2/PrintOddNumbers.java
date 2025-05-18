package week1.day2;

public class PrintOddNumbers {

	public static void main(String[] args) {
		
		int limit=25;
		System.out.println("Odd numbers");
		for (int i=0;i<=limit;i++)
		{
			if(i%2==1)
			{
				System.out.println(i);
			}
		}
		
	}
}
