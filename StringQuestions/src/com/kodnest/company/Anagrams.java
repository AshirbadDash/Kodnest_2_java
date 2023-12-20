package com.kodnest.company;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "silento";

		// Check if the strings are the same length
		if (str1.length() != str2.length()) {
			System.out.println("The strings are not anagrams.");
			return;
		}

		// Convert the strings to lowercase
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		// Convert the strings to character arrays
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();

		// Sort the character arrays
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		// Check if the sorted character arrays are equal
		if (Arrays.equals(arr1, arr2)) {
			System.out.println("The strings are anagrams.");
		} else {
			System.out.println("The strings are not anagrams.");
		}
	}
}