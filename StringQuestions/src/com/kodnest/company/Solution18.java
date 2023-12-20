package com.kodnest.company;
//INPUT =s-->"program"

//OUTPUT ="rgamrop"

import java.util.Scanner;

public class Solution18 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the sentence: ");
		String input = scan.nextLine();
		countCharacterTypes(input);
	}

	public static void countCharacterTypes(String str) {
		int vowels = 0;
		int consonants = 0;
		int digits = 0;
		int specialCharacters = 0;
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c >= 'a' && c <= 'z') {
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					vowels++;
				} else {
					consonants++;
				}
			} else if (c >= '0' && c <= '9') {
				digits++;
			} else {
				specialCharacters++;
			}
		}
		System.out.println("Vowels: " + vowels);
		System.out.println("Consonants: " + consonants);
		System.out.println("Digits: " + digits);
		System.out.println("Special Characters: " + specialCharacters);
	}
}
