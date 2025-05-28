package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListFindIntersection {

	public static void main(String[] args) {
		// Initializing arrays
		int[] array1 = { 3, 2, 11, 4, 6, 7 };
		int[] array2 = { 1, 2, 8, 4, 9, 7 };
		// Intializing lists
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		// Assigning arrays to lists
		for (Integer i : array1) {
			list1.add(i);
		}
		for (Integer i : array2) {
			list2.add(i);
		}
		// Sorting the arrays to find the logic
		Collections.sort(list1);
		Collections.sort(list2);
		
		/*System.out.println(list1);
		System.out.println(list2);*/
		
		//Finding the intersected elements
		for (int i = 0; i < list1.size() - 1; i++) {

			for (int j = 0; j < list2.size() - 1; j++) {
				if ((list1.get(i)) == (list2.get(j))) {
					System.out.println("Intersected Element " + list1.get(i));
				}
			}
		}

	}

}
