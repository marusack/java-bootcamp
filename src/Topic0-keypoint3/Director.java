public class Director {

	private HospitalBuilder Hb = null;

	public Director(HospitalBuilder hb) {

		Hb = hb;
	}

	public void constructWing() {
		Hb.buildNursesCenter();
		Hb.buildReception();
		Hb.buildRooms();

	}

	public Wing getWing() {
		return Hb.getWing();
	}

}
