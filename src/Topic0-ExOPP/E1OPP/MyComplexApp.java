import java.util.Scanner;

public class MyComplexApp {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter complex number 1 (real part):");
		double a = keyboard.nextDouble();
		System.out.println("Enter complex number 1 (imaginary part):");
		double b = keyboard.nextDouble();
		System.out.println("Enter complex number 2 (real part):");
		double c = keyboard.nextDouble();
		System.out.println("Enter complex number 2 (imaginary part):");
		double d = keyboard.nextDouble();

		MyComplex complex1 = new MyComplex(a, b);
		MyComplex complex2 = new MyComplex(c, d);

		System.out.println("Number 1 is" + complex1.toString());

		if (complex1.isReal() == false) {
			System.out.println(complex1.toString() + "is NOT a pure real number");
		} else {
			System.out.println(complex1.toString() + "is a pure real number");
		}
		if (complex1.isImaginary() == false) {
			System.out.println(complex1.toString() + "is NOT a pure imaginary number");
		} else {
			System.out.println(complex1.toString() + "is a pure imaginary number");
		}

		System.out.println("Number 2 is" + complex2.toString());
		if (complex2.isReal() == false) {
			System.out.println(complex2.toString() + "is NOT a pure real number");
		} else {
			System.out.println("complex2.toString()+is a pure real number");
		}
		if (complex2.isImaginary() == false) {
			System.out.println(complex2.toString() + "is NOT a pure imaginary number");
		} else {
			System.out.println(complex2.toString() + "is a pure imaginary number");
		}

		System.out.println();
		if (complex1.equals(complex2) == true) {
			System.out.println(complex1.toString() + "is equal to " + complex2.toString());
		} else {
			System.out.println(complex1.toString() + "is NoT equal to " + complex2.toString());
		}

		System.out.println(complex1.toString() + "+" + complex2.toString() + "=" + complex1.add(complex2));
		System.out.println(complex1.toString() + "-" + complex2.toString() + "=" + complex1.subtract(complex2));

	}

}
