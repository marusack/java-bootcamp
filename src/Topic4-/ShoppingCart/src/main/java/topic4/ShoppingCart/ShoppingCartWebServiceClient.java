package topic4.ShoppingCart;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCartWebServiceClient implements ShoppingCartService {

	ShoppingCartService imp = new ShoppingCartImp();

	public void removeItem(Product ProductToRemove) {
		imp.removeItem(ProductToRemove);

	}

	public String getItems() {
		return imp.getItems();
	}

	public void addItem(Product newProduct) {
		imp.addItem(newProduct);

	}

	public void clearShoppingCart() {
		imp.clearShoppingCart();

	}

}
