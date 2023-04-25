package com.solve;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Q. Write a program to remove duplicates from arraylist.
public class RemoveDuplicatesSecond {

	public static ArrayList<Integer> removeDuplicates() {
		// create a new ArrayList
		ArrayList<Integer> newList = new ArrayList<>();
		for (Integer integer : list) {

		}

	}

	public static void main(String[] args) {
		// create one arrayList with duplicates element
		ArrayList<Integer> list = new ArrayList<>(
				Arrays.asList(1, 10, 20, 10, 30, 20, 40, 60, 70, 40, 50, 30, 90, 40, 90));

		// print the array list
		System.out.println("ArrayList before Swaping>> " + list);

		ArrayList<ArrayList<Integer>> newList = new ArrayList<>();

		for (Integer in : list) {
			if (newList.contains(in)) {
			}
		}

	}

}
