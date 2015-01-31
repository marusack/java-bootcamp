package topic4.ShoppingCart;

import org.springframework.stereotype.Service;



@Service
public interface ShoppingCartService {
	
	public void removeItem(Product ProductToRemove);
	public String getItems();
	void addItem(Product newProduct);
	public void clearShoppingCart();
	
}
