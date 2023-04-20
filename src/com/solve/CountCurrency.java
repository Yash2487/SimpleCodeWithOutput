package com.solve;

//program on counting notes from the given inputs(notes like 2000,500,200,100,50,5,1)
public class CountCurrency {

	public static void countCurrnecy(int amount) {// amount=35786
		int[] notes = new int[] { 2000, 500, 200, 100, 50, 5, 1 };
		int a = notes.length;
		int[] noteCounter = new int[a];

		for (int i = 0; i < a; i++) {
			if (amount >= notes[i]) {
				noteCounter[i] = amount / notes[i];
				amount = amount % notes[i];
			}
		}
		// print the notes
		System.out.println("Currency Count ->");
		for (int i = 0; i < a; i++) {
			if (noteCounter[i] != 0) {
				System.out.println(notes[i] + " : " + noteCounter[i]);
			}
		}
	}

	public static void main(String[] args) {
		// calling method
		countCurrnecy(35786);
		/*
		 * Output-:
		 * Currency Count -> 
		 * 2000 : 17 
		 * 500 : 3 
		 * 200 : 1 
		 * 50 : 1 
		 * 5 : 7 
		 * 1 : 1
		 */

	}

}
