/**
 * @author mariel
 *
 */
public class Home implements BuildingBuilder {

	private Building building;

	public Home() {
		building = new Building();
	}

	@Override
	public void BuildType() {
		building.setType("*Home*");

	}

	@Override
	public void BuildDoor() {
		building.setDoor("1");

	}

	@Override
	public void BuildWindow() {
		building.setWindows("2");

	}

	@Override
	public void BuildBathroom() {
		building.setBathroom("1");

	}

	@Override
	public Building getBuilding() {
		return building;
	}

}
