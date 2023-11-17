package com.kodnest.concat;

public class TwoDimen {
	public static void main(String[] args) {
		// fetch the individual characters
		String s = "programming";
		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i) + " ");

		}
		System.out.println();
		System.out.println("==============================");
		// using while loop
		int j = 0;
		while (j < s.length()) {
			System.out.print(s.charAt(j) + " ");
			j++;

		}
		System.out.println();

		String s2 = "HELLO";
		for (int j1 = s2.length() - 1; j1 >= 0; j1--) {
//			System.out.print(s.charAt(j1) + " ");//dislaying the string

		}
		
	}

}
