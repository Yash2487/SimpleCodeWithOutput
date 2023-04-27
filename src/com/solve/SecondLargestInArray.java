package com.solve;

/*Find 2nd highest element in array without searching and sorting logic
        //  int arr[]={10,50,20,580,690};*/
public class SecondLargestInArray {

	public static int getSecondLargest(int a[]) {// a contains [10,20,50,580,690]
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				// step1- Compare the first two elements of the array
				/*
				 * Step3- Then, compare 2nd and 3rd elements if the second element is greater
				 * than the 3rd swap them
				 */
				if (a[i] > a[j]) {
					// step2- If the first element is greater than the second swap them.
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		/*
		 *  we have to get second largest element thats why a[a.length - 2]
		 *  for first largest a[a.length - 1]
		 */
		return a[a.length - 2];

	}

	public static void main(String[] args) {
		int arr[] = { 10, 50, 20, 580, 690 };
		System.out.println("Second largest element is>> " + getSecondLargest(arr));

	}

}
