package topic4.ShoppingCart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShoppingCartProxy implements ShoppingCartService {
	@Autowired
	ShoppingCartService implementation;

	public ShoppingCartProxy() {
	}

	protected ShoppingCartProxy(ShoppingCartService imp) {
		this.implementation = imp;
	}

	public void removeItem(Product ProductToRemove) {
		implementation.removeItem(ProductToRemove);

	}

	public String getItems() {
		return implementation.getItems();
	}

	public void addItem(Product newProduct) {
		implementation.addItem(newProduct);

	}

	public void clearShoppingCart() {
		implementation.clearShoppingCart();

	}

}
