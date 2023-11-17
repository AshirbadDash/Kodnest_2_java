package com.kodnest.company;
//INPUT =  hello java program 

//OUTPUT = olleh avaj margorp

public class Solution14 {
	public static void main(String[] args) {
		String s = "hello java program";
		String[] a = s.split(" ");
		for (int i = a.length-1; i >=0; i--) {

			StringBuffer str = new StringBuffer(a[i]);

			System.out.print(str.reverse() + " ");
		}

	}

}
