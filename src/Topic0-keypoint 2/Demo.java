
public class Demo {

	public static void main(String[] arg) {
		
		BuildingBuilder  buildingBuilder = new Home();
		
		BuildingDirector buildingDirector = new BuildingDirector(buildingBuilder);
		buildingDirector.ConstructBuilding();
		Building building = buildingDirector.getBuilding();
		System.out.println("the building is"+ building.toString());
	}
}
