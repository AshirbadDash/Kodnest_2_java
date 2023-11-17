package com.kodnest.company;

//INPUT ="hello java program"
//OUTPUT ="program java hello"

public class Solution13 {
	public static void main(String[] args) {
		String s = "hello java program";
		String[] t = s.split(" ");
		for (int i = t.length - 1; i >= 0; i--) {
			System.out.print(t[i] + " ");
		}

	}

}
