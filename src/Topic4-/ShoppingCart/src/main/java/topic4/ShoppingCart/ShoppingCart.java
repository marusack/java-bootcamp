package topic4.ShoppingCart;

import java.util.ArrayList;

/**
 * @author mariel
 *
 */
public class ShoppingCart implements CartInterface{
	
	public ShoppingCart() {
		this.setOrderDetail(new ArrayList<Product>());
		
	}

	private ArrayList<Product> OrderDetail;
	
	
	/* (non-Javadoc)
	 * @see topic4.ShoppingCart.CartInterface#getTotalSum()
	 * 
	 * it takes al the prices of all tthe products in de collection order detail
	 *  from de shopping cart and returns  the total amount
	 */
	public double getTotalSum(){
		double count = 0.0;
		for (int i = 0; i < this.getOrderDetail().size(); i++) {

			count += this.getOrderDetail().get(i).subTotal();
		}
		return count;
		
	}

	
	
	
	/* (non-Javadoc)
	 * @see topic4.ShoppingCart.CartInterface#addProduct(topic4.ShoppingCart.Product)
	 * 
	 * add a product p to the shoppingcart 
	 */
	public void addProduct( Product p) {
		this.getOrderDetail().add(p);
		
		
	}

	/* (non-Javadoc)
	 * @see topic4.ShoppingCart.CartInterface#getPriceOf(java.lang.String)
	 * 
	 * this methods finds the most expensive item in the shopping cart or the less expensive
	 * the string s define how action is executed
	 
	public double getPriceOf(String s) {
		double res=0;
		if ( "most"==s ){
			double max = 0;
			for (int i = 0; i < this.getOrderDetail().size(); i++) {

				if (this.getOrderDetail().get(i).getPrice() > max) {
					max = this.getOrderDetail().get(i).getPrice();
				}

			}
			res=max;
		}
		if( "less"==s){
					double min = Double.MAX_VALUE;
					for (int i = 0; i < this.getOrderDetail().size(); i++) {
		
						if (this.getOrderDetail().get(i).getPrice() < min) {
							min = this.getOrderDetail().get(i).getPrice();
						}
		
					}
				res=min;
		}
		return res;
		}
			
		*/
		
	

	public ArrayList<Product> getOrderDetail() {
		return this.OrderDetail;
	}

	public void setOrderDetail(ArrayList<Product> orderDetail) {
		this.OrderDetail = orderDetail;
	}

}
