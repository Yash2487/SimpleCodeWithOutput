package com.solve;

//Q. How do you check if a string contains only digits?
public class StringContainDigitOnly {

	public static void main(String[] args) {
		// 53464esdg 12345678
		String a = "53464esdg";
		int b = 0;
		for (int i = 0; i < a.length(); i++) {
			char ch = a.charAt(i);
			// ascii value for digit ranges from 48 to 57
			if (ch > 48 && ch <= 57) {
				b++;
			}
		}
		System.out.println("String Contains " + b + " digits");
		// Output-: String Contains 5 digits

	}

}
