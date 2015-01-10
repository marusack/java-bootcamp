public class TestMyComplex {

	public static void main(String[] args) {
		MyComplex complex = new MyComplex(4, 2);
		MyComplex complex2 = new MyComplex(2, 2);
		System.out.println(complex.toString());
		System.out.println("in degrees" + complex.argumentDegrees());
		System.out.println("in radians" + complex.argumentInRadians());
		System.out.println("is Imaginary?:" + complex.isImaginary());
		System.out.println("is real?:" + complex.isReal());
		System.out.println("equals to himself?:" + complex.equals(complex));
		System.out.println("equals to another?:" + complex.equals(new MyComplex(8, 2)));
		System.out.println("magnitude:" + complex.magnitude());
		System.out.println("conjugate:" + complex.conjugate());
		System.out.println("add" + complex2 + " :" + complex.add(complex2));
		System.out.println("substract" + complex2 + " :" + complex.subtract(complex2));
		System.out.println("multiply with" + complex2 + " :" + complex.multiplyWith(complex2));
		System.out.println("divide by" + complex2 + " :" + complex.divideBy(complex2));
	}

}
