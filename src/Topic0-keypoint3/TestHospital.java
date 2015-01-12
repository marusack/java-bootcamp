public class TestHospital {

	public static void main(String[] arg) {

		HospitalBuilder Builder = new Hospital();

		Director director = new Director(Builder);
		director.constructWing();
		Wing h1 = director.getWing();
		System.out.println(h1.toString());
	}
}
