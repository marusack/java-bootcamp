public class Ball {

	private float x;
	private float y;
	private int radius;
	private float xDelta;
	private float yDelta;

	public Ball(float x, float y, int radius, int speed, int direction) {

		this.setX(x);
		this.setY(y);
		this.setRadius(radius);
		this.setxDelta((float) ((float) speed * (Math.cos(direction))));
		this.setyDelta(-(float) ((float) speed * (Math.sin(direction))));
	}

	public void setXY(int x, int y) {

		this.setX(x);
		this.setY(y);

	}

	public void move() {
		float movementx = this.getX() + this.getxDelta();
		this.setX(movementx);
		float movementy = this.getY() + this.getyDelta();
		this.setY(movementy);
	}

	public void reflectHorizontal() {
		this.setxDelta(-this.getxDelta());
	}

	public void reflectVertical() {
		this.setyDelta(-this.getyDelta());
	}

	public String toString() {
		return "Ball at (" + this.getX() + "," + this.getY() + ") of velocity (" + this.getxDelta() + "," + this.getyDelta() + " )";

	}

	/**
	 * @return the x
	 */
	public float getX() {
		return x;
	}

	/**
	 * @return the y
	 */
	public float getY() {
		return y;
	}

	/**
	 * @return the radius
	 */
	public int getRadius() {
		return radius;
	}

	/**
	 * @return the xDelta
	 */
	public float getxDelta() {
		return xDelta;
	}

	/**
	 * @return the yDelta
	 */
	public float getyDelta() {
		return yDelta;
	}

	/**
	 * @param x
	 *            the x to set
	 */
	public void setX(float x) {
		this.x = x;
	}

	/**
	 * @param y
	 *            the y to set
	 */
	public void setY(float y) {
		this.y = y;
	}

	/**
	 * @param radius
	 *            the radius to set
	 */
	public void setRadius(int radius) {
		this.radius = radius;
	}

	/**
	 * @param xDelta
	 *            the xDelta to set
	 */
	public void setxDelta(float xDelta) {
		this.xDelta = xDelta;
	}

	/**
	 * @param yDelta
	 *            the yDelta to set
	 */
	public void setyDelta(float yDelta) {
		this.yDelta = yDelta;
	}

}
