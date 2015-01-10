public class MyTriangle {

	private MyPoint v1;
	private MyPoint v2;
	private MyPoint v3;

	public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		this.setV1(new MyPoint(x1, y1));
		this.setV2(new MyPoint(x2, y2));
		this.setV3(new MyPoint(x3, y3));
	}

	public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
		this.setV1(v1);
		this.setV2(v2);
		this.setV3(v3);
	}

	public String toString() {
		return ("Triangle @ " + this.getV1().toString() + ", " + this.getV2().toString() + ", " + this.getV3().toString());
	}

	public double getPerimeter() {
		double sideA = this.getV1().distance(this.getV2());
		double sideB = this.getV2().distance(this.getV3());
		double sideC = this.getV3().distance(this.getV1());
		return (sideA + sideB + sideC);
	}

	public String printType() {
		double sideA = this.getV1().distance(this.getV2());
		double sideB = this.getV2().distance(this.getV3());
		double sideC = this.getV3().distance(this.getV1());
		if (Double.compare(sideA, sideB) == 0 && Double.compare(sideB, sideC) == 0) {
			return "equilateral";
		} else {
			if (sideA == sideB || sideA == sideC || sideB == sideC) {
				return "isosceles";
			} else {

				return "scalene";

			}
		}

	}

	public MyPoint getV1() {
		return v1;
	}

	public void setV1(MyPoint v1) {
		this.v1 = v1;
	}

	public MyPoint getV2() {
		return v2;
	}

	public void setV2(MyPoint v2) {
		this.v2 = v2;
	}

	public MyPoint getV3() {
		return v3;
	}

	public void setV3(MyPoint v3) {
		this.v3 = v3;
	}
}
