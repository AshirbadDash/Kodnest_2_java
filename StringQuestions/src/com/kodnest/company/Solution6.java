package com.kodnest.company;
//wajp to display second half of String in reverse order

public class Solution6 {

	public static void main(String[] args) {

		String s = "programming";
		for (int i = s.length()-1; i > s.length()/2; i--) {
			System.out.print(s.charAt(i));

		}

	}

}
