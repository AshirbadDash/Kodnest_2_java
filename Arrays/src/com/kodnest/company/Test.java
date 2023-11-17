package com.kodnest.company;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		int L, i, mid, flag = 0;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("User! please enter the size of the Array");

		L = scan.nextInt();
		int[] a = new int[L];

		System.out.println("Enter the Elements of array ");
		for (i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}
		System.out.println("Enter the Element to be searched");
		int n = scan.nextInt();
		int low = 0, high = L - 1;
		mid = (low + high) / 2;
		while (low <= high) {
			mid = (low + high) / 2;
			if (a[mid] > n) {

				low = mid + 1;
			} else if (a[mid] < n) {
				high = mid - 1;

			} else {
				System.out.println("ELement found at the index " + mid);

				// flag = 1;
				System.exit(0);
				// break;
			}

		}
		if (flag == 0) {

			System.out.println("Element not found");
		}

		scan.close();
	}

}