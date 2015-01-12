public class Building {
	private String type;
	private String door;
	private String windows;
	private String bathroom;

	public String toString() {
		return "the" + this.getType() + "has door:" + this.getDoor() + "  windows:" + this.getWindows() + "  bathroom:"
				+ this.getBathroom();

	}

	/**
	 * @return the door
	 */
	public String getDoor() {
		return door;
	}

	/**
	 * @return the windows
	 */
	public String getWindows() {
		return windows;
	}

	/**
	 * @return the bathroom
	 */
	public String getBathroom() {
		return bathroom;
	}

	/**
	 * @param door
	 *            the door to set
	 */
	public void setDoor(String door) {
		this.door = door;
	}

	/**
	 * @param windows
	 *            the windows to set
	 */
	public void setWindows(String windows) {
		this.windows = windows;
	}

	/**
	 * @param bathroom
	 *            the bathroom to set
	 */
	public void setBathroom(String bathroom) {
		this.bathroom = bathroom;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

}
