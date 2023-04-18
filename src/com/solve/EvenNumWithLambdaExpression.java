package com.solve;

import java.util.ArrayList;

// Q. WAP to print Even numbers by using lambda expression
public class EvenNumWithLambdaExpression {

	public static void main(String[] args) {
		// Create ArrayList with elements {1,2,3,4}
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		
		// using lambda expression to print even numbers from ArrayList
		System.out.println("Even Numbers Are>>");
		arrayList.forEach(n->{if(n%2==0) System.out.println(n);});
		
		// using lambda expression to print odd number from ArrayList
		System.out.println("Odd numbers Are>>");
		arrayList.forEach(n->{if(n%2!=0) System.out.println(n);});
		
		/*
		 * Output-:
		 * Even Numbers Are>>
		 * 2
		 * 4
		 * Odd numbers Are>>
		 * 1
		 * 3
		 */

	}

}
