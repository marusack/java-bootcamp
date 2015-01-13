import java.util.ArrayList;

public class Offer extends Product {

	private ArrayList<Item> offers;
	private String name;

	public Offer(double price, ArrayList<Item> offers, int units, String name, MailList ML) {
		super(price, units, ML);
		this.setOffers(offers);

		this.setName(name);
		this.getML().SendEmail("one Offer was created", this.description());
	}

	public Offer(double price, ArrayList<Item> offers, String name, MailList ML) {
		super(price, 1, ML);
		this.setOffers(offers);
		this.setName(name);
		this.getML().SendEmail("one Offer was created", this.description());
	}

	@Override
	public String description() {
		String head = " - Offer " + this.getName() + " ....... $" + getPrice() + "\n";
		String body = "";
		for (int i = 0; i < this.getOffers().size(); i++) {

			body += this.getOffers().get(i).description() + "\n";
		}
		return head + body;

	}

	public ArrayList<Item> getOffers() {
		return offers;
	}

	public void setOffers(ArrayList<Item> offers) {
		this.offers = offers;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
