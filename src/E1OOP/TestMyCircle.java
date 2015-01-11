public class TestMyCircle {

	public static void main(String[] args) {
		MyCircle c1 = new MyCircle(new MyPoint(1, 2), 3);
		MyCircle c2 = new MyCircle(2, 4, 3);
		System.out.println(c1.toString());
		System.out.println(c1.getArea());
		System.out.println(c2.toString());
		System.out.println(c2.getArea());
	}

}
