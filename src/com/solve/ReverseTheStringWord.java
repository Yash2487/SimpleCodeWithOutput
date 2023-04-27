package com.solve;
/*Q.WAP to reverse the string words
 * example- input- I Love India
 * output- India I love 
 */
public class ReverseTheStringWord {

	public static void main(String[] args) {
		String a = "I Love India";
		String word[] = a.split(" ");
		for (int i = word.length - 1; i >= 0; i--) {
			System.out.println(word[i]);
		}

	}

}
