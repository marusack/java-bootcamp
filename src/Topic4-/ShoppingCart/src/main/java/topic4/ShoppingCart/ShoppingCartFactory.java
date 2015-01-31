package topic4.ShoppingCart;



public class ShoppingCartFactory {
	
	private ShoppingCartFactory() {}  
	  
    public static ShoppingCartService getLocalService(){  
        return new ShoppingCartImp ();  
    }  
  
    public static ShoppingCartService getRemoteServiceUsingWebService(){  
        return new ShoppingCartProxy (new ShoppingCartWebServiceClient());  
    }
}
