package com.solve;
/* You have String-> my name swati
 * Output give the count of m,n,a,s
 * ascci value for alphabates starts from 97-a & 65-A
 */
public class StringCount {

	public static void main(String[] args) {
		String y = "my name swati";
		// m=109,n=110,a=97,s=115
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		for (int i = 0; i < y.length(); i++) {
			char ch = y.charAt(i);
			if (ch == 109) {
				a++;
			}
			if (ch == 110) {
				b++;
			}
			if (ch == 97) {
				c++;
			}
			if (ch == 115) {
				d++;
			}
		}
		System.out.println("m: " + a);
		System.out.println("n: " + b);
		System.out.println("a: " + c);
		System.out.println("s: " + d);

	}

}
