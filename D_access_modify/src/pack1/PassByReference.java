package pack1;

public class PassByReference {

	public static void main(String[] args) {
		int x = 10;
		System.out.println("Primitive : " + x);
		StringBuilder sb = new StringBuilder("Hello");
		modifyObject(sb);
		System.out.println("Object: " + sb.toString());
	}

	public static void modifyPrimitive(int num) {
		// System.out.println("original numCopy = "+numCopy);
		num = 20;
	}

	public static void modifyObject(StringBuilder str) {
		// System.out.println("numCopy after modification = "+numCopy);
		str.append(" World");
	}
}
