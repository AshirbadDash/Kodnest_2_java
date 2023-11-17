package com.kodnest.company;
//wajp to display first half of String in reverse order

public class Solution5 {

	public static void main(String[] args) {

		String s = "programming";
		for (int i = s.length() / 2; i >= 0; i--) {
			System.out.print(s.charAt(i));

		}

	}

}
