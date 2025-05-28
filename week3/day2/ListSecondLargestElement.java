package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSecondLargestElement {

	public static void main(String[] args) {
		
		int[] array = {3, 2, 11, 4, 6, 7};
		//Intializing List
		List<Integer> list1 = new ArrayList<Integer>();
		//Assigning array elements to a list
		for (Integer i : array) {
			list1.add(i);
		}
		//sorting the array
		Collections.sort(list1);
		//System.out.println(list1);
		int n=list1.size();
		//System.out.println(n);
		int secondLargest= list1.get(n-2);
		System.out.println("The second Largest elemement in the list is "+secondLargest);
	}

}
