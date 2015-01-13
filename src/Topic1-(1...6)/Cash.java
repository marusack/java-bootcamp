public class Cash extends PaymentMethod {
	private double discount = 0;

	public Cash(double amount, MailList ML) {
		super(amount, ML);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double discount(ShoppingCart SC) {

		// its take only the price of the more expensive item
		double D = SC.getMoreExpensive() * 90 / 100;
		this.setDiscount(D);
		this.setAmount(this.getAmount() - D);
		return this.getAmount();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Payment Method: Cash \n  Total Amount: " + this.getAmount() + "   Discount:" + this.getDiscount();

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
