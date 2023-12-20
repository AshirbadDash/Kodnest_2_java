class Application1 {
	public static void main(String[] args) {
		child1 child = new child1();
		System.out.println(child.cmoney);
//		System.out.println(child.pmoney);
		System.out.println(child.getPmoney());

		Parent1 parent1 = new Parent1();
//		System.out.println(parent1.pmoney);
		System.out.println(parent1.getPmoney());
	}

}
