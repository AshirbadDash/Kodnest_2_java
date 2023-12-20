package com.kodnest.programming;

import java.util.Scanner;

public class Solution2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();

		int a[] = new int[n];

		System.out.println("Enter the elements");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int total = 0;
		for (int i : a) {
			int m = i;
			int rem = m % 10;
			total = total * 10 + rem;
			System.out.println(total);

		}
		if (total / 10 == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();
	}

}