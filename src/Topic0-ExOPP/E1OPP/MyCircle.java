public class MyCircle {

	private MyPoint center;
	private int radius;

	public MyCircle(int x, int y, int radius) {
		this.setCenterXY(x, y);
		this.setRadius(radius);
	}

	public MyCircle(MyPoint center, int radius) {
		this.setCenter(center);
		this.setRadius(radius);
	}

	public String toString() {
		return ("Circle @ " + this.getCenter().toString() + " radius=" + this.getRadius());

	}

	public double getArea() {
		return (Math.PI * this.getRadius() * this.getRadius());
	}

	public void setCenterXY(int x, int y) {
		this.center = new MyPoint(x, y);
	}

	public MyPoint getCenter() {
		return center;
	}

	public void setCenter(MyPoint center) {
		this.center = center;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

}
