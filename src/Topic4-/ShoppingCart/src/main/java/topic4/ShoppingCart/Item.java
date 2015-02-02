package topic4.ShoppingCart;

public class Item extends Product {

	private String name;

	public Item(double price, int units, String name) {
		super(price, units);
		this.setName(name);

	}

	public Item(double price, String name) {
		super(price, 1);
		this.setName(name);

	}

	@Override
	public String description() {
		return (" - Item " + this.getName() + " ....... $" + this.getPrice());
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
