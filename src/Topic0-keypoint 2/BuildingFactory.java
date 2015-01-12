public class BuildingFactory {

	public Building getBuilding(String type) {
		if ("family".equals(type)) {
			return (new Home());
		} else {
			
			return new Office();
		}
	}
}
