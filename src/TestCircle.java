public class TestCircle {
	public static void main(String[] args) {
		// Declare and allocate an instance of class Circle called c1
		// with default radius and color
		Circle c1 = new Circle();
		// Use the dot operator to invoke methods of instance c1.
		System.out.println("The circle has radius of " + c1.getRadius() + " and area of " + c1.getArea());

		// Declare and allocate an instance of class circle called c2
		// with the given radius and default color
		Circle c2 = new Circle(2.0);
		// Use the dot operator to invoke methods of instance c2.
		System.out.println("The circle has radius of " + c2.getRadius() + " and area of " + c2.getArea());

		// Test constructor n�3
		Circle c3 = new Circle(2.5, "pink");
		System.out.println("The circle has radius of" + c3.getRadius() + ", area of " + c3.getArea() + " and color of " + c3.getColor());
		System.out.println(c3.toString());

		Circle c4 = new Circle(1.2);
		System.out.println(c4.toString()); // explicit call
		System.out.println(c4); // println() calls toString() implicitly, same
								// as above
		System.out.println("Operator '+' invokes toString() too: " + c4); // '+'
																			// invokes
																			// toString()
																			// too

	}
}