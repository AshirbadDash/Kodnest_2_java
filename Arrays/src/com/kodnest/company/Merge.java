package com.kodnest.company;

public class Merge {
	public static void main(String[] args) {

		int a[] = { 1, 2, 3 };
		int b[] = { 4, 5, 6 };
		int c[] = new int[6];

		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		int j = 0;
		for (int i = a.length; i < (a.length + b.length); i++) {
			c[i] = b[j++];

		}
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i] + " ");
		}

	}
}
