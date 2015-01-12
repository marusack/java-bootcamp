public class Container {

	private int x1;// top
	private int y1;// left
	private int x2;// bottom
	private int y2;// right

	public Container(int x, int y, int width, int height) {

		this.setX1(x);
		this.setY1(y);
		this.setX2(x + width - 1);
		this.setY2(y + height - 1);

	}

	public String toString() {
		return "Container at (" + this.getX1() + "," + this.getY1() + ") to (" + this.getX2() + ", " + this.getY2() + ")";
	}

	public boolean collidesWith(Ball ball) {
		if (ball.getX() - ball.getRadius() <= this.getX1() || ball.getX() + ball.getRadius() >= this.getX2()) {
			ball.reflectHorizontal();
			return true;
		}

		if (ball.getY() - ball.getRadius() <= this.getY1() || ball.getY() + ball.getRadius() >= this.getY2()) {
			ball.reflectVertical();
			return true;
		}

		return false;
	}

	/**
	 * @return the x1
	 */
	public int getX1() {
		return x1;
	}

	/**
	 * @return the y1
	 */
	public int getY1() {
		return y1;
	}

	/**
	 * @return the x2
	 */
	public int getX2() {
		return x2;
	}

	/**
	 * @return the y2
	 */
	public int getY2() {
		return y2;
	}

	/**
	 * @param x1
	 *            the x1 to set
	 */
	public void setX1(int x1) {
		this.x1 = x1;
	}

	/**
	 * @param y1
	 *            the y1 to set
	 */
	public void setY1(int y1) {
		this.y1 = y1;
	}

	/**
	 * @param x2
	 *            the x2 to set
	 */
	public void setX2(int x2) {
		this.x2 = x2;
	}

	/**
	 * @param y2
	 *            the y2 to set
	 */
	public void setY2(int y2) {
		this.y2 = y2;
	}

}
