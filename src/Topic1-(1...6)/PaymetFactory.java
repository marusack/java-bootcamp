public class PaymetFactory {

	public PaymentMethod getPayment(String type, double subTotal, ShoppingCart SC, MailList ML) {
		ML.SendEmail("a paymet was made", SC.getCustomer().getInfo());

		if ("Credit Card".equals(type) || "credit card".equals(type)) {
			return new CreditCard(subTotal, SC.getCustomer().getName(), SC.getCustomer().getCreditNumber(), ML);
		} else {
			if ("Paypal".equals(type) || "paypal".equals(type)) {
				return new Paypal(subTotal, SC.getCustomer().getEmail(), SC.getCustomer().getPass(), ML);
			} else {

				return new Cash(subTotal, ML);

			}
		}

	}

}
