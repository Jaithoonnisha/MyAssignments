package week2.day1;

public class ReverseOddWords {

	public static void main(String[] args) {
	
		String test = "I am a software tester";
		
		String[] arr1=test.split(" ");
		
		for (int i = 0; i < arr1.length; i++) {
			
			if(i%2!=0)
			{
				char[] ch1=arr1[i].toCharArray();
				
				for(int j=ch1.length-1;j>=0;j--)
				{
					System.out.print(ch1[j]);
				}
				System.out.print(" ");
			}
			else
			{
				System.out.print(arr1[i]+" ");
			}
			
			
			
		}
		
		

	}

}
