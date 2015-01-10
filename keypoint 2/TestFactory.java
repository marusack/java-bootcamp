
public class TestFactory {

	public static void main(String[] args) {
		BuildingFactory Factory = new BuildingFactory();

		Building b1 = Factory.getBuilding("family");
		System.out.println(  b1.buildRoom());
		System.out.println(  b1.buildKitchen());
		System.out.println(  b1.buildBathroom());
		Building b2 = Factory.getBuilding("office");
		System.out.println(  b2.buildRoom());
		System.out.println(  b2.buildKitchen());
		System.out.println(  b2.buildBathroom());
		
	}
}
