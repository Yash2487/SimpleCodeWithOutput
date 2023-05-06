package com.solve;

/*
 * Q. WAP to check wether given string is palindrome or not
 * palindrome means string looks same from front & back 
 * e.g. aba->aba
 */
public class PalindromeString {

	public static void main(String[] args) {
		String a = "aba";
		String rev = "";
		for (int i = a.length()-1; i >= 0; i--) {
			rev = rev + a.charAt(i);
		}
		if (a.equals(rev)) {
			System.out.println("String Is Palindrome");
		} else {
			System.out.println("String Is Not palindrome");
		}

	}

}
