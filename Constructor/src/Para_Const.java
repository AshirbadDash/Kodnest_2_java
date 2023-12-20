class Para_Const {

	int x, y;

	Para_Const(int a, int b)// parameterized

	{
		x = a;
		y = b;

	}

	Para_Const(int a, String b)// parameterized
	{
		System.out.println(a + " " + b);
	}

	void show() {
		System.out.println(x + " " + y);

	}

}

class C {
	public static void main(String[] args) {
		Para_Const ref = new Para_Const(100, 200);
		ref.show();
		Para_Const ref2 = new Para_Const(10, "Hello");
		ref2.show();

	}

}
