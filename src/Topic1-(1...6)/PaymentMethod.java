public abstract class PaymentMethod {

	private double amount;
	private MailList ML;

	public abstract double discount(ShoppingCart SC);

	public abstract String toString();

	public PaymentMethod(double amount, MailList ML) {
		this.amount = amount;
		this.setML(ML);
		this.getML().SendEmail("one transaction was made", "-");
	}

	private MailList getML() {

		return this.ML;
	}

	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * @param amount
	 *            the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}

	/**
	 * @param mL
	 *            the mL to set
	 */
	public void setML(MailList mL) {
		ML = mL;
	}

}
