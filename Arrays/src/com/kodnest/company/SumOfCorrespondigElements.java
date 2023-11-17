package com.kodnest.company;

import java.util.Scanner;

public class SumOfCorrespondigElements {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("User ! please enter the size of 1st array ");
		int size1 = scan.nextInt();
		System.out.println("User ! please enter the size of 2nd array ");
		int size2 = scan.nextInt();
		System.out.println("User ! please enter the size of 3rd array ");
		int size3 = scan.nextInt();

		int a[] = new int[size1];
		int b[] = new int[size2];
		int c[] = new int[size3];

		System.out.println("User ! please enter the elements of arrays");
		for (int i = 0; i < a.length; i++) {

			a[i] = scan.nextInt();
			b[i] = scan.nextInt();

		}

		for (int i = 0; i < a.length; i++) {
			c[i] = a[i] + b[i];
			System.out.print("size of 3rd array: " + c[i] + " ");
		}
		scan.close();

	}

}
