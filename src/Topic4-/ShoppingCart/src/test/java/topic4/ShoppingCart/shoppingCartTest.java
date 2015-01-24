package topic4.ShoppingCart;


import junit.framework.TestCase;

public class shoppingCartTest extends TestCase {

	public void testTotslSum(){
		try {
			Product p1 = new Item(500, 1, "computer") ;
			ShoppingCart SC = new ShoppingCart();
			SC.addProduct(p1);
			System.out.println("one product was added");
		} catch (Exception e) {
			
			System.out.println("An error has occurred"+ e.getMessage());
			
		}
				
	}
	
	
	
	public void testTotalSum(){
		Product p1 = new Item(500, 1, "computer") ;
		Product p2 = new Item(250, 5, "keyboard") ;
		Product p3 = new Item(100, 1, "mouse") ;
		ShoppingCart SC = new ShoppingCart();
		SC.addProduct(p1);
		SC.addProduct(p2);
		SC.addProduct(p3);
		double ans = SC.getTotalSum();
		System.out.println("the total must be 1850 and the result is"+ans);
		//ans 1850
		
	}
/*	public void getPriceOf(){
		Product p1 = new Item(500, 1, "computer") ;
		Product p2 = new Item(250, 1, "keyboard") ;
		Product p3 = new Item(100, 1, "mouse") ;
		ShoppingCart SC = new ShoppingCart();
		SC.addProduct(p1);
		SC.addProduct(p2);
		SC.addProduct(p3);
		double most = SC.getPriceOf("most");
		double less= SC.getPriceOf("less");
		System.out.println("the most expensive item is "+most+" it has to be 500");
		System.out.println("the less expensive item is "+less+" it has to be 100");
	
		//ans 1850
		
	}*/
	
	
	
	
	
	
	
	
	
	
	
}
