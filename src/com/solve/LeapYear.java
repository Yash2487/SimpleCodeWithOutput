package com.solve;
/* Q. WAP to check weather given year is leap year or not
 * take input from user & take 5 year one after one & give output
 */
import java.util.Scanner;

public class LeapYear {
	public static void getLeapYear(int year) {
		if (year % 4 == 0) {
			System.out.println(year + " Is Leap Year");
		} else {
			System.out.println(year + " Is Not-Leap Year");
		}
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter The Year>>");
			Scanner scanner = new Scanner(System.in);
			int year = scanner.nextInt();
			getLeapYear(year);
		}

	}

}
