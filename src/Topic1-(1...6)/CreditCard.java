public class CreditCard extends PaymentMethod {

	private String name;
	private int creditNumber;
	private double discount = 0;

	public CreditCard(double amount, String name, int creditNumber, MailList ML) {
		super(amount, ML);
		this.setName(name);
		this.setCreditNumber(creditNumber);

	}

	@Override
	public double discount(ShoppingCart SC) {
		// its take all the amount
		double D = SC.subTotal() * 10 / 100;
		this.setDiscount(D);
		this.setAmount(this.getAmount() - D);
		return this.getAmount();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCreditNumber() {
		return creditNumber;
	}

	public void setCreditNumber(int creditNumber) {
		this.creditNumber = creditNumber;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Payment Method Credit Card\n  Total Amount: " + this.getAmount() + "   Discount:" + this.getDiscount();
	}

	/**
	 * @return the discount
	 */
	public double getDiscount() {
		return discount;
	}

	/**
	 * @param discount
	 *            the discount to set
	 */
	public void setDiscount(double discount) {
		this.discount = discount;
	}

}
