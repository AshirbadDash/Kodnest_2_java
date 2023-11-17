package com.kodnest.company;
//reverse of palindrome of string

public class Solution12 {

	public static void main(String[] args) {

		String s = "mam";
		StringBuffer str = new StringBuffer(s);
		StringBuffer reverse = str.reverse();
//		System.out.println(s.equals(reverse.toString()));
		String string = reverse.toString();
		if (s.equals(string)) {
			System.out.println("Is a palindrome");

		} else {
			System.out.println("Not a palindrome");
		}

	}

}
