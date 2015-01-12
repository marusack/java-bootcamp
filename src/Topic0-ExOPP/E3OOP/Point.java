public class Point {

	private int x;
	private int y;

	public Point(int x, int y) {
		this.setX(x);
		this.setY(y);
	}

	public String toString() {
		return "Point: (" + this.getX() + "," + this.getY() + ")";
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setXY(int x, int y) {
		this.setX(x);
		this.setY(y);
	}
}