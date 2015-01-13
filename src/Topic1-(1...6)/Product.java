public abstract class Product {

	public double price;
	public int units;
	public MailList ML;

	public Product(double price, int units, MailList ML) {
		this.setUnits(units);
		this.setML(ML);
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

	/**
	 * @return the mL
	 */
	public MailList getML() {
		return ML;
	}

	/**
	 * @param mL
	 *            the mL to set
	 */
	public void setML(MailList mL) {
		ML = mL;
	}

}
