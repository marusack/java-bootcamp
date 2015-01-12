public class Rectangle extends Shape {

	private double width;
	private double length;

	public Rectangle() {
		super();
		this.setWidth(1.0);
		this.setLength(1.0);
	}

	public Rectangle(double width, double length) {
		super();
		this.setWidth(width);
		this.setLength(length);
	}

	public Rectangle(double width, double length, String color, boolean filled) {
		this.setWidth(width);
		this.setLength(length);
		this.setColor(color);
		this.setFilled(filled);
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getArea() {
		return this.getWidth() * this.getLength();
	}

	public double getPerimeter() {
		return 2 * (this.getWidth() + this.getLength());
	}

	@Override
	public String toString() {
		return "A Rectangle with width=" + this.getWidth() + " and length=" + this.getLength() + ", which is a subclass of "
				+ super.toString();
	}
}
