public class Paypal extends PaymentMethod {
	private String email;
	private String pass;
	private double discount = 0;

	public Paypal(double amount, String email, String pass, MailList ML) {
		super(amount, ML);
		this.setEmail(email);
		this.setPass(pass);
	}

	@Override
	public double discount(ShoppingCart SC) {
		// The cheapest item is for free when the user pay by Paypal
		double D = SC.getLessExpensive();
		this.setDiscount(D);
		this.setAmount(this.getAmount() - D);
		return this.getAmount();

	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Payment Method : Paypal\n  Total Amount: " + this.getAmount() + "   Discount:" + this.getDiscount();
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
