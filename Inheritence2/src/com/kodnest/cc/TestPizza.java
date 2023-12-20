package com.kodnest.cc;

class Pizza {
	// constructor
	public Pizza() {
		System.out.println("Making a basic pizza");

	}

}

class PepperoniPizza {
	// constructor
	public PepperoniPizza() {
		System.out.println("Adding pepperoni on top");

	}

	

	public class TestPizza {
		public static void main(String[] args) {
			PepperoniPizza pizza = new PepperoniPizza();
			pizza.getClass();
		}
	}

}
