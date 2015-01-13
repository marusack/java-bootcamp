import java.util.ArrayList;

;

public class ShoppingCart {

	private Customer customer;
	private ArrayList<Product> OrderDetail;// Products->abs of (offer-item)
	private PaymentMethod PM = null;

	public ShoppingCart(Customer customer) {

		this.setCustomer(customer);
		this.setOrderDetail(new ArrayList<Product>());

	}

	public ShoppingCart(String name, String email, String pass, int creditNumber) {

		this.setCustomer(new Customer(name, email, pass, creditNumber));
		this.setOrderDetail(new ArrayList<Product>());

	}

	public ShoppingCart(String name, String email, String pass, int creditNumber, Product p) {

		this.setCustomer(new Customer(name, email, pass, creditNumber));
		this.setOrderDetail(new ArrayList<Product>());
		this.addProduct(p);

	}

	public double subTotal() {
		double count = 0.0;
		for (int i = 0; i < this.getOrderDetail().size(); i++) {

			count += this.getOrderDetail().get(i).subTotal();
		}
		return count;
	}

	public boolean addProduct(Product p) {
		this.getOrderDetail().add(p);
		return true;

	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * @return the orderDetail
	 */
	public ArrayList<Product> getOrderDetail() {
		return OrderDetail;
	}

	/**
	 * @param orderDetail
	 *            the orderDetail to set
	 */
	public void setOrderDetail(ArrayList<Product> orderDetail) {
		OrderDetail = orderDetail;
	}

	public PaymentMethod getPM() {
		return PM;
	}

	public void setPM(PaymentMethod pM) {
		PM = pM;

	}

	public String showDetail() {
		String count = "";
		for (int i = 0; i < this.getOrderDetail().size(); i++) {

			count += this.getOrderDetail().get(i).description() + "\n";
		}
		return count;
	}

	public String description() {
		return this.getCustomer().getInfo() + "\n" + this.showDetail() + "\n" + this.getPM().toString();
	}

	public double getMoreExpensive() {
		double max = 0;
		for (int i = 0; i < this.getOrderDetail().size(); i++) {

			if (this.getOrderDetail().get(i).getPrice() > max) {
				max = this.getOrderDetail().get(i).getPrice();
			}

		}
		return max;
	}

	public double getLessExpensive() {
		double min = Double.MAX_VALUE;
		for (int i = 0; i < this.getOrderDetail().size(); i++) {

			if (this.getOrderDetail().get(i).getPrice() < min) {
				min = this.getOrderDetail().get(i).getPrice();
			}

		}
		return min;
	}
}
