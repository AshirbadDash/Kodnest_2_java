package com.kodnest.statickeyword;

class Citizen {
//	static int Nationality;
//	int age;

//	void display1() {
//		System.out.println("Instance method");
//
//	}
//
//	static void display2() {
//		System.out.println("Static method");
//
//	}

	{
		System.out.println("Block-1");
	}
	static {
		int b = 10; // initialization of variable can
//		be done before the loading of main method
		
		System.out.println("Block-2");

	} // first the static block is executed then the non static method after
		// constructor call

}

class DemoStatic {

	static {
		System.out.println("Block-3");

	} // static will be load before the main method

	public static void main(String[] args) {
//		int a;
//		System.out.println(a);local value no default value initialization
//		static and default values will get default values.
//		System.out.println(Citizen.Nationality);
//		Citizen citizen = new Citizen();
//		System.out.println(citizen.age);

//		citizen.display1();
//		Citizen.display2();//static method can be accessed in static way only

		System.out.println("This is the main method");
		Citizen citizen = new Citizen();

	}

}
