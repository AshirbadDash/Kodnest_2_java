package com.kodnest.company;

public class FrequencyOfCharacter {

	public static void main(String[] args) {

		int count = 0;
		String s = "string";
		char ch = 'r';
		for (int i = 0; i < s.length(); i++) {
			if(ch==s.charAt(i))
			count++;
		}
		System.out.println("Frequency of " + ch + " is " + count);

	}

}
