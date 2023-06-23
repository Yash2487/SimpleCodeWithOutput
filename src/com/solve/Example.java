package com.solve;

public class Example {

	public static void main(String[] args) {
		try {
			int n = 0 / 2;
		} catch (Exception e) {
			// TODO: handle exception
		}
		/*
		 * Unreachable catch block for ArithmeticException. It is already handled by the
		 * catch block for Exception
		 */
//		catch (ArithmeticException arithmeticException) {
//			// TODO: handle exception
//		}
	}

}
