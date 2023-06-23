package com.solve;

public class PalindromeNumber2 {

	public static void main(String[] args) {
		int num = 121;

		// store the number into temporary variable
		int originalNumber = num;
		int reverse = 0;
		while (num != 0) {
			int remainder = num % 10;
			reverse = (reverse * 10) + remainder;
			num = num / 10;
		}
		if (originalNumber == reverse) {
			System.out.println("Is Plindrome");
		} else {
			System.out.println("Not Palindrome");
		}

	}

}
