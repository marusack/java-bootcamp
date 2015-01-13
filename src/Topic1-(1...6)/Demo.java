import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {

		MailList ML = new MailList("gustavoChango@PHPFTW.com");
		SaverTransaction ST = new SaverTransaction();
		PaymetFactory PF = new PaymetFactory();

		Item i1 = new Item(5, 1, "mouse", ML);
		Item i2 = new Item(500, "computer", ML);

		ArrayList<Item> arry1 = new ArrayList<Item>();
		arry1.add(i1);
		arry1.add(i2);
		Offer o1 = new Offer(750, arry1, 1, "itCombo", ML);

		Item i3 = new Item(5, "chiken", ML);
		Item i4 = new Item(3, "rise", ML);

		ArrayList<Item> arry2 = new ArrayList<Item>();
		arry2.add(i3);
		arry2.add(i4);
		Offer o2 = new Offer(6, arry2, "chikeweekend", ML);

		System.out.println(o1.description());
		System.out.println(o2.description());

		Customer customer = new Customer("maru", "maru@sack.com", "hash", 3456);

		ShoppingCart SC = new ShoppingCart(customer);

		SC.getOrderDetail().add(o1);// add an offer
		SC.getOrderDetail().add(i2);// add an item

		PaymentMethod pm1 = PF.getPayment("cash", SC.subTotal(), SC, ML);
		pm1.discount(SC);

		SC.setPM(pm1);// the shopping cart concludes his life in the process of
						// selling

		ST.addSC(SC);

		System.out.println(ML.showNotification());
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(ST.showHistoricalTransaction());
		System.out.println("the number of transaction for the day was: " + ST.CounterTransaction());

	}

}
