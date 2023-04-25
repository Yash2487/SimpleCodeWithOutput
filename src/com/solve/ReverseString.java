package com.solve;

//Q. WAP to reverse string without using reverse function
public class ReverseString {

	public static void main(String[] args) {
		// create string first
		String s = "my name is yash";

		System.out.println("after reverse string is>>");
		for (int i = s.length(); i > 0; i--) {
			System.out.print(s.charAt(i - 1));
		}

	}

}
