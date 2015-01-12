public class Line {

	private Point begin; // beginning point
	private Point end; // ending point

	// Constructors
	public Line(Point begin, Point end) {
		this.setBegin(begin);
		this.setEnd(end);
	}

	public Line(int beginX, int beginY, int endX, int endY) {
		this.setBegin(new Point(beginX, beginY));
		this.setEnd(new Point(endX, endY));
	}

	@Override
	public String toString() {
		return "Line: [ " + this.getBegin() + ", " + this.getEnd() + " ]";
	}

	public Point getBegin() {
		return begin;
	}

	public Point getEnd() {
		return end;
	}

	public void setBegin(Point begin) {
		this.begin = begin;
	}

	public void setEnd(Point end) {
		this.end = end;
	}

	public int getBeginX() {
		return begin.getX();
	}

	public int getBeginY() {
		return begin.getY();
	}

	public int getEndX() {
		return end.getX();
	}

	public int getEndY() {
		return end.getY();
	}

	public void setBeginX(int x) {
		begin.setX(x);
	}

	public void setBeginY(int y) {
		begin.setY(y);
	}

	public void setBeginXY(int x, int y) {
		begin.setXY(x, y);
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
		int xDiff = this.getEndX() - this.getBeginX();
		int yDiff = this.getEndY() - this.getBeginY();
		return (int) Math.sqrt(xDiff * xDiff + yDiff * yDiff);
	}

	public double getGradient() {
		int xDiff = this.getEndX() - this.getBeginX();
		int yDiff = this.getEndY() - this.getBeginY();
		return Math.atan2(yDiff, xDiff);
	}

}