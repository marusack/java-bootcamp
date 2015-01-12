public class Wing {
	private int reception;
	private int rooms;
	private boolean nursesCenter;

	public String toString() {
		return "the Hospital has     reception:" + reception + "rooms:" + rooms + " nurses Center :" + nursesCenter;

	}

	/**
	 * @return the reception
	 */
	public int getReception() {
		return reception;
	}

	/**
	 * @return the rooms
	 */
	public int getRooms() {
		return rooms;
	}

	/**
	 * @return the nursesCenter
	 */
	public boolean isNursesCenter() {
		return nursesCenter;
	}

	/**
	 * @param reception
	 *            the reception to set
	 */
	public void setReception(int reception) {
		this.reception = reception;
	}

	/**
	 * @param rooms
	 *            the rooms to set
	 */
	public void setRooms(int rooms) {
		this.rooms = rooms;
	}

	/**
	 * @param nursesCenter
	 *            the nursesCenter to set
	 */
	public void setNursesCenter(boolean nursesCenter) {
		this.nursesCenter = nursesCenter;
	}

}
