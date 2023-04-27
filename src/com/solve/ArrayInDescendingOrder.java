package com.solve;

// Q. WAP to print given array in descending order
public class ArrayInDescendingOrder {

	public static void main(String[] args) {
		// create one array
		int a[] = { 10, 20, 30, 40 };
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.println(a[i]);
		}

	}

}
