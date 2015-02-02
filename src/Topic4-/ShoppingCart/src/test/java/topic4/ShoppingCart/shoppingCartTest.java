package topic4.ShoppingCart;

import java.util.ArrayList;

import junit.framework.TestCase;

import org.junit.Test;

public class ShoppingCartTest extends TestCase {

	@Test
	public void test() {
		ShoppingCartImp cart = new ShoppingCartImp();
		Product item = new Item(500.30, "computer");
		cart.addItem(item);

		assertEquals(cart.getItems(), " - Item computer ....... $500.3\n");
		// assertEquals(expected, actual);
	}

	@Test
	public void testLocalService() {
		ShoppingCartService cart = ShoppingCartFactory.getLocalService();
		Product item = new Item(20.0, "candy");
		cart.addItem(item);
		assertEquals(cart.getItems(), " - Item candy ....... $20.0\n");
	}

	@Test
	public void testWebService() {
		ShoppingCartService cart = ShoppingCartFactory.getRemoteServiceUsingWebService();
		ArrayList<Item> a = new ArrayList<Item>();
		a.add(new Item(500.30, "computer"));
		a.add(new Item(500.30, "computer"));
		Product offer = new Offer(700.50, a, "last offer");
		cart.addItem(offer);
		assertEquals(cart.getItems(),
				" - Offer last offer ....... $700.5\n - Item computer ....... $500.3\n - Item computer ....... $500.3\n\n");
	}

	@Test
	public void testUsingSpring() {
		ShoppingCartService cart = UsingSpring.loadFromSpring();
		Product item = new Item(20.0, "candy");
		cart.addItem(item);
		assertEquals(cart.getItems(), " - Item candy ....... $20.0\n");
	}

}