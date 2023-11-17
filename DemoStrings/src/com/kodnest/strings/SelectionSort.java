package com.kodnest.strings;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User! please enter the size of array");
		int size = scan.nextInt();

		int a[] = new int[size];

		System.out.println("User please enter the elements of array of size " + size);
		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();

		}

		for (int i = 0; i < a.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;
				}

				int temp = a[i];
				a[i] = a[min];
				a[min] = temp;
			}

		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		scan.close();

	}

}
