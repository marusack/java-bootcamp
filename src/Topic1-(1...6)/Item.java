public class Item extends Product {

	private String name;

	public Item(double price, int units, String name, MailList ML) {
		super(price, units, ML);
		this.setName(name);
		this.getML().SendEmail("one product was created", this.description());

		// TODO Auto-generated constructor stub
	}

	public Item(double price, String name, MailList ML) {
		super(price, 1, ML);
		this.setName(name);
		this.getML().SendEmail("one product was created", this.description());

		// TODO Auto-generated constructor stub
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
