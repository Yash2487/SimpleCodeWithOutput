package com.solve;

import java.util.Arrays;

// program on finding two array are equal or not?
public class ArrayEqualOrNot {
	// Returns true if arr1[0..n-1] and arr2[0..m-1] contain same elements.
	public static boolean areEqual(int arr1[], int arr2[]) {
		// calculate length of both arrays
		int m = arr1.length;
		int n = arr2.length;

		// if lengths of array are not equal means array are not equal
		if (n != m)
			return false;

		// sort both arrays
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		// linearly compare elements
		for (int i = 0; i < n; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}

		// if all elements were same
		return true;
	}

	public static void main(String[] args) {
		int arr1[] = { 3, 5, 2, 5, 2 };
		int arr2[] = { 2, 3, 5, 5, 2 };

		if (areEqual(arr1, arr2)) {
			System.out.println("Yes, Given Two Arrays Are Same");
		} else {
			System.out.println("No, Given Two Array Are Not Same");
		}
		// Output- Yes, Given Two Arrays Are Same

	}

}
