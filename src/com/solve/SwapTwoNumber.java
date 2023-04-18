package com.solve;

//Write a program to swap two numbers without using third number
public class SwapTwoNumber {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("Before Swapping  " + "a=" + a + "," + "b=" + b);
		a = a * b;//a = 10 * 20=200, i.e. a=200
		b = a / b;//b = 200 / 20=10, i.e. b=10  
		a = a / b;//a = 200 / 10=20, i.e. a=20
		System.out.println("After Swapping  " + "a=" + a + "," + "b=" + b);

	}

}
