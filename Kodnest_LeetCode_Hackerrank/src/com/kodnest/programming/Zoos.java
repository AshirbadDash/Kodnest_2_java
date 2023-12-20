package com.kodnest.programming;

import java.util.Scanner;

public class Zoos {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		String s = sc.nextLine();
		s = s.toLowerCase();

		int zCount = 0;
		int oCount = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'z') {
				zCount++;
			} else if (s.charAt(i) == 'o') {
				oCount++;
			}
		}
			if (oCount == 2 * zCount) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		sc.close();

	}
}
