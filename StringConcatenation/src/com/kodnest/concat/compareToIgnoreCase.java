package com.kodnest.concat;

public class compareToIgnoreCase {

	public static void main(String[] args) {

		String s1 = "Apple";
		String s2 = "apple";
		System.out.println(s1.compareToIgnoreCase(s2));

		String s3 = "Bpple";
		String s4 = "bpple";
		System.out.println(s3.compareToIgnoreCase(s4));

		String s6 = "apple";
		String s5 = "bpple";
		System.out.println(s5.compareToIgnoreCase(s6));

	}

}
