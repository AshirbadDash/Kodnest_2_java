class A {
	// default constructor
	int a;
	String b;
	boolean c;

	A() {// default
		a = 100;
		b = "ankit";
		c = true;
	}

	void disp() {
		System.out.println(a + " " + b + " " + c);
	}

}

class B {
	public static void main(String[] args) {

		A ref = new A();
		ref.disp();
	}
}
