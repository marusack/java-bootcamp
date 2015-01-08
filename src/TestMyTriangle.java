
public class TestMyTriangle {

	public static void main(String[] args) {
		MyTriangle T1= new MyTriangle(new MyPoint(2,2), new MyPoint(1,2),
				new MyPoint(1,2));
		MyTriangle T2= new MyTriangle(new MyPoint(1,1),
				new MyPoint(2,2),
				new MyPoint(6,2));
		System.out.println("Triangle1");
		System.out.println("perimeter:"+T1.getPerimeter());
		System.out.println("class:"+T1.printType());
		System.out.println("triangle 2");
		System.out.println("perimeter:"+T2.getPerimeter());
		System.out.println("class:"+T2.printType());
	}

}
