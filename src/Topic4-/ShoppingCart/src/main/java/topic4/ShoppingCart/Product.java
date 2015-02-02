package topic4.ShoppingCart;

public abstract class Product {

	public double price;
	public int units;

	public Product(double price, int units) {
		this.setUnits(units);

		this.setPrice(price);

	}

	public double subTotal() {
		return this.getPrice() * this.getUnits();
	}

	public abstract String description();

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(double price) {
		this.price = price;

	}

	/**
	 * @return the units
	 */
	public int getUnits() {
		return units;
	}

	/**
	 * @param units
	 *            the units to set
	 */
	public void setUnits(int units) {
		this.units = units;
	}

}
