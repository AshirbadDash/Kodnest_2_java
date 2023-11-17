package com.kodnest.company;

public class MergingArray {
	public static void main(String[] args) {

		// First array
		int a[] = { 1, 2, 3 };

		// second array
		int b[] = { 4, 5, 6 };

		// length of first array
		int a1 = a.length;
		// length of second array
		int b1 = b.length;

		// result array size
		int c1 = a1 + b1;

		// Creating a new array
		int[] c = new int[c1];

		// array into resultant array
		for (int i = 0; i < a1; i++) {

			// the resultant array
			c[i] = a[i];
			// System.out.println("First array is: "+a[i]);
		}
		// System.out.println("First array is: "+a[i]);

		// array into resultant array
		for (int i = 0; i < b1; i++) {

			// Storing the elements in the
			// resultant array
			c[a1 + i] = b[i];
			// System.out.println("Second array is: "+a[i]);
		}

		// resultant array after merging
		System.out.println("Merge array is: ");
		for (int i = 0; i < c1; i++) {

			// print the element
			System.out.print(c[i] + " ");
		}

	}

}
