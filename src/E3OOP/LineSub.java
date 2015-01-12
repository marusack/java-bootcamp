public class LineSub extends Point {
	// A line needs two points: begin and end.
	// The begin point is inherited from its superclass Point.
	// Private variables
	Point end; // Ending point

	// Constructors
	public LineSub(int beginX, int beginY, int endX, int endY) {
		super(beginX, beginY); // construct the begin Point
		this.end = new Point(endX, endY); // construct the end Point
	}

	public LineSub(Point begin, Point end) { // caller to construct the Points
		super(begin.getX(), begin.getY()); // need to reconstruct the begin
											// Point
		this.end = end;
	}

	@Override
	public String toString() {
		return "Line: " + super.toString() + " - " + this.getEnd() + "";
	}

	public Point getBegin() {
		return new Point(getX(), getY());
	}

	public Point getEnd() {
		return end;
	}

	public void setBegin(Point begin) {
		this.setXY(begin.getX(), begin.getY());
	}

	public void setEnd(Point end) {
		this.setXY(end.getX(), end.getY());
	}

	public int getBeginX() {
		return getX();
	}

	public int getBeginY() {
		return getY();
	}

	public int getEndX() {

		return end.getX();
	}

	public int getEndY() {
		return end.getY();
	}

	public void setBeginX(int x) {
		setX(x);
	}

	public void setBeginY(int y) {
		setY(y);
	}

	public void setBeginXY(int x, int y) {
		setXY(x, y);
	}

	public void setEndX(int x) {
		end.setX(x);
	}

	public void setEndY(int y) {
		end.setY(y);
	}

	public void setEndXY(int x, int y) {
		end.setXY(x, y);
	}

	public int getLength() {
		int xDiff = getEndX() - getBeginX();
		int yDiff = getEndY() - getBeginY();
		return (int) Math.sqrt(xDiff * xDiff + yDiff * yDiff);
	}

	public double getGradient() {
		int xDiff = getEndX() - getBeginX();
		int yDiff = getEndY() - getBeginY();
		return Math.atan2(yDiff, xDiff);
	}
}