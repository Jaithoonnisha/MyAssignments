package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListMissingElement {

	public static void main(String[] args) {
		// Array declaration
		int[] array1 = { 1, 2, 3, 4, 10, 6, 8 };
		//List deceleration
		List<Integer> givenList = new ArrayList<Integer>();
		//Iterating through array and assiging it to list
		for (Integer i : array1) {

			givenList.add(i);

		}
		/*Printing the list
		System.out.println(givenList);*/
		//sorting
		Collections.sort(givenList);
		/*Printing Sorted List
		System.out.println(givenList);*/

		for (int i = 0; i < givenList.size() - 1; i++) {

			// Checking if the difference for numbers in the list is != 1 and getting the value
			if ((givenList.get(i + 1) - givenList.get(i) != 1)) {
				// using a temproray variable to store the missing value
				int temp = givenList.get(i) + 1;
				// Printing the missing numbers
				System.out.println("Missing number: " + temp);

			}
			
		}

	}

}
