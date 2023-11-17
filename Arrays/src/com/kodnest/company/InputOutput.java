package com.kodnest.company;

import java.util.Scanner;

public class InputOutput {
	public static void main(String[] args) {

		System.out.println("Enter the size of array");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int[] a = new int[n];
		int[] rotate = new int[a.length];

		System.out.println("User !please enter the elements of array");
		for (int i = 0; i < a.length; i++) {

			a[i] = scan.nextInt();

		}
		System.out.println("User ! please enter the rotation no.");
		int k = scan.nextInt();
		scan.close();

		for (int i = 0; i < a.length; i++) {
			rotate[i] = a[(i + k) % n];

		}
		for (int num : rotate) {
			System.out.println(num);
		}

	}

}
