package com.kodnest.company;

public class DemoSHape {
	public static void main(String[] args) {

		Shape shape = new Shape();// normal behaviour
		shape.draw();

		Circle circle = new Circle();// child class reference holding
//		--child object -- object of the class is trying to access the method of the same class
		circle.draw();

		Rectangle rectangle = new Rectangle();
		rectangle.draw();

	}

}
//this time child object but the reference is parent object 
//storing the child object is stored in parent reference is called upcasting
//holding the child object with the help of parent class reference
// upcasting
// Shape s;
//s =new Circle();
//s= new Rectangle();

//s.draw();
//s.draw();

//downcasting
//Shape s = new Circle();
//((circle)s).draw();
