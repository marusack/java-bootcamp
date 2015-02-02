package topic4.ShoppingCart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartImp implements ShoppingCartService {

	ArrayList<Product> itemList = new ArrayList<Product>();

	public void removeItem(Product ProductToRemove) {
		itemList.remove(ProductToRemove);

	}

	public String getItems() {
		String body = "";
		for (int i = 0; i < itemList.size(); i++) {

			body += itemList.get(i).description() + "\n";
		}
		return body;
	}

	public void addItem(Product newProduct) {
		itemList.add(newProduct);

	}

	public void clearShoppingCart() {
		itemList.clear();

	}

}
