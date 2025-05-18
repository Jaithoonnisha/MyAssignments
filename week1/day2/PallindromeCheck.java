package week1.day2;

public class PallindromeCheck {
	
	public int pallindrome(int input,int output)
	{
		
		for(int i=input;i>0;i=i/10)
		{
			int j=i%10;
			output=output*10+j;
			
		}

		return output;
	}
	public static void main(String[] args) {
		
		int input=11211,output=0;
		PallindromeCheck ch= new PallindromeCheck();
		int reversed= ch.pallindrome(input,output);
		
		if(input==reversed)
		{
			System.out.println("Pallindrome");
		}
		else
		{
			System.out.println("Not a Pallindrome");
		}
	}

}
