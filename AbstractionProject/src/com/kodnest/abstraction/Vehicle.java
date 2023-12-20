package com.kodnest.abstraction;

abstract class Vehicle {

	// concrete method
	void starts(int a, int b) {
		System.out.println("Vehicle moves");
		int c = a + b;
	}

	// abstract method
	abstract void stops();

}
