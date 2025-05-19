package week2.day1;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		
		int[] numbers= {1,4,3,2,8,6,7};
		//Sorting the array
		Arrays.sort(numbers);
		
		
		for (int i = 0; i < numbers.length; i++) {
			
			int temp=i+1;
			if(numbers[i]!= temp)
			{
				System.out.println("Missing element found: "+ temp);
				break;
			}
			
			
			
		}

	}

}
