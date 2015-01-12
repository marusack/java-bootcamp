public class Circle { // save as "Circle.java"

	// private instance variable, not accessible from outside this class
	private double radius;
	private String color;

	// 1st constructor, which sets both radius and color to default
	public Circle() {

		this.setRadius(1.0);
		this.setColor("red");

	}

	// 2nd constructor with given radius, but color default
	public Circle(double r) {
		this.setRadius(r);
		this.setColor("red");
		;
	}

	// 3th constructor with given radius and color
	public Circle(double r, String c) {
		this.setRadius(r);
		this.setColor(c);
	}

	// A public method for retrieving the radius
	public double getRadius() {
		return radius;
	}

	// A public method for computing the area of circle
	public double getArea() {
		return radius * radius * Math.PI;
	}

	public String getColor() {
		return color;
	}

	private void setColor(String color) {
		this.color = color;
	}

	private void setRadius(double radius) {
		this.radius = radius;
	}

	public String toString() {
		return "Circle: radius=" + this.getRadius() + " color=" + this.getColor();
	}
}