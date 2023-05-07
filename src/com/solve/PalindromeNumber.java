package com.solve;
/*
 * Q. WAP to check wether given number is palindrome or not
 * e.g.-: 123321
 */
public class PalindromeNumber {

	public static void main(String[] args) {
		int num = 123321;
		int sum = 0;
		int temp = num;
		while (num > 0) {
			int rem = num % 10;
			sum = (sum * 10) + rem;
			num = num / 10;
		}
		if (temp == sum) {
			System.out.println("Number Is Palindrome");
		} else {
			System.out.println("Number Is Not Palindrome");
		}

	}

}
