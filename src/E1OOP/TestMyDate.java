public class TestMyDate {

	public static void main(String[] args) {
		MyDate currentDate = new MyDate(2015, 1, 9);
		System.out.println("Current date: " + currentDate);

		MyDate d1 = new MyDate(2013, 1, 9);
		System.out.println(d1);
		System.out.println(d1.nextDay());
		System.out.println(d1.nextDay());
		System.out.println(d1.nextMonth());
		System.out.println(d1.nextYear());

		MyDate d2 = new MyDate(2012, 1, 2);
		System.out.println(d2);
		System.out.println(d2.previousDay());
		System.out.println(d2.previousDay());
		System.out.println(d2.previousMonth());
		System.out.println(d2.previousYear());

		MyDate d3 = new MyDate(2012, 2, 29);
		System.out.println(d3.previousYear());

	}
}