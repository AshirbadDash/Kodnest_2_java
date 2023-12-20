package pack1;

public class Test1 {
	public static void main(String[] args) {
		int num = 50;
		System.out.println("Original number = " + num);
		modify(num);
		System.out.println("Modified number = " + num);
	}

	public static void modify(int numCopy) {
		numCopy = 100;
		System.out.println("numCopy after modification = " + numCopy);
	}
}
//pass by value