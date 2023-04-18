package com.solve;

import java.util.ArrayList;
import java.util.stream.Collectors;

//Write a program to remove duplicates from arraylist.
public class RemoveDuplicatesFirst {

	public static void main(String[] args) {
		// create Arraylist & add duplicates element to it
		ArrayList arrayList = new ArrayList<>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(30);
		arrayList.add(10);
		System.out.println(arrayList);
		ArrayList newList = (ArrayList) arrayList.stream().distinct().collect(Collectors.toList());
		System.out.println(newList);
	}

}
