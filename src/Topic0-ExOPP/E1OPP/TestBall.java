public class TestBall {

	public static void main(String[] args) {

		Ball B1 = new Ball(2.3f, 2.4f, 5, 1, 1);
		System.out.println(B1.toString());
		B1.move();
		System.out.println(B1.toString());
		B1.reflectHorizontal();
		System.out.println(B1.toString());
		B1.reflectVertical();
		System.out.println(B1.toString());
		System.out.println();
	}

}
