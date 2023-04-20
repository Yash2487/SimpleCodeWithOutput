package com.solve;

/*Given an array A of positive integers. Your task is to find the leaders in the array. 
 * An element of an array is leader if it is greater than or equal to all the elements to its right side. 
 * The rightmost element is always a leader. {16, 17, 4, 3, 5, 2}
 */
import java.util.Arrays;

public class LeaderInArray {

	public static void main(String[] args) {
		// array A of positive integers {16, 17, 4, 3, 5, 2}
		int A[] = { 16, 17, 4, 3, 5, 2 };

		// sort the array to get leader at rightmost end
		Arrays.sort(A);// {2,3,4,5,16,17}

		// why two lopps?-> because we need to compare one element of array with other
		for (int i = 0; i < A.length; i++) {
			for (int j = i; j < A.length; j++) {
				if (A[i] < A[j]) {
					break;
				}
				if (j == A.length - 1) {
					System.out.println(A[i] + " is a leader");
				}
			}
		}

	}

}
