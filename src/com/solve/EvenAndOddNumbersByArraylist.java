package com.solve;

import java.util.ArrayList;
import java.util.Collections;

// Q. WAP to print Even and Odd number by using arraylist 
public class EvenAndOddNumbersByArraylist {

	public static void main(String[] args) {
		// create one array having elements { 1, 3, 4, 2, 12, 10, 8, 7, 6, 5, 9, 14 };
		int[] a = { 1, 3, 4, 2, 12, 10, 8, 7, 6, 5, 9, 14 };

		// create Two Arrylist one for even number & another for odd number
		ArrayList<Integer> evenList = new ArrayList<>();
		ArrayList<Integer> oddList = new ArrayList<>();

		// traverse through given array
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				// if this condition satisfied then numbers will be add to evenList
				evenList.add(a[i]);
			} else {
				// else numbers will be add to oddList
				oddList.add(a[i]);
			}
		}

		// sort the lists in assending order by using Collections.sort()
		Collections.sort(evenList);
		Collections.sort(oddList);

		// printing the EvenList
		System.out.println("List Of Even Numbers>>" + evenList);

		// printing the OddList
		System.out.println("List of Odd Numbers>>" + oddList);

		/*
		 * output-: List Of Even Numbers>>[2, 4, 6, 8, 10, 12, 14] List of Odd
		 * Numbers>>[1, 3, 5, 7, 9]
		 */

	}

}
