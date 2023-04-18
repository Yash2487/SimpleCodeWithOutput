package com.solve;

import java.util.ArrayList;
import java.util.Collections;

/* Q. {1,2,3,4,5} == which collection will you use to get in reverse order. 
 * (don’t use sort operation)
 */
public class ReverseArryList {

	public static void main(String[] args) {
		// create ArrayList with arguments {1,2,3,4,5}
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);

		// reversing the arraylist by using Collections.reverse() method
		Collections.reverse(arrayList);
		// printing the reversed arrayList
		System.out.println(arrayList);
		// Output-: [5, 4, 3, 2, 1]

	}

}
