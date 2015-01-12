public class BuildingDirector {

	private BuildingBuilder bb = null;

	public BuildingDirector(BuildingBuilder bb) {

		this.setBb(bb);
	}

	public void ConstructBuilding() {
		this.getBb().BuildBathroom();
		this.getBb().BuildType();
		this.getBb().BuildDoor();
		this.getBb().BuildWindow();

	}

	public Building getBuilding() {
		return this.getBb().getBuilding();
	}

	/**
	 * @return the bb
	 */
	public BuildingBuilder getBb() {
		return bb;
	}

	/**
	 * @param bb
	 *            the bb to set
	 */
	public void setBb(BuildingBuilder bb) {
		this.bb = bb;
	}

}
