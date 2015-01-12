public class Hospital implements HospitalBuilder {

	private Wing wing;

	public Hospital() {
		wing = new Wing();
	}

	@Override
	public void buildReception() {
		wing.setReception(1);

	}

	@Override
	public void buildRooms() {
		wing.setRooms(50);

	}

	@Override
	public void buildNursesCenter() {

		wing.setNursesCenter(true);
	}

	@Override
	public Wing getWing() {
		return wing;

	}

}
