package com.kodnest.aggregation; // this program is an example of aggregation

public class AggregationDemo {
	public static void main(String[] args) {

		pilot rahul = new pilot("Rahul");
//		new Airlines("Indigo", rahul);// constructor call---- is a part of creation of 
		// object but constructor call
		// itself
		// will not crate a object

		Airlines airlines = new Airlines("Indigo", rahul);
		// indigo is passed as pass by value
		// but rahul is passed as pass by reference

		airlines.Operate();
		airlines = null;
//		airlines.Operate();
		rahul.fly();
		

	}

}

class pilot {
	String name;

	void fly() {
		System.out.println(name + " is flying a plane");
		
	}

	public pilot(String name) {
		this.name = name;

	}

}

class Airlines {
	
	String airname;
	pilot pilot;

	public Airlines(String airname, pilot pilot) {
		this.pilot = pilot;
		this.airname = airname;

	}

	void Operate() {
		System.out.println(airname + " is operating...");
		pilot.fly();
	}

}
