package week2.day1;

public class FindIntersection {
	
	public static void main(String[] args) {
		
		int[] array1 = {3,2,11,4,6,7};
		int[] array2 = {1,2,8,4,9,7};
		
		//Nested loop for comparision
		System.out.println("Matching elements are");
		
		for (int i = 0; i < array1.length; i++) {
			
			for (int j = 0; j < array2.length; j++) {
				
				if((array1[i]) == (array2[j]))
				{
					System.out.println(array1[i]);
				}
				
			}
			
		}
		
	}

}
