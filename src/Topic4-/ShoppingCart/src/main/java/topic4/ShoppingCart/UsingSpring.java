
package topic4.ShoppingCart;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsingSpring {

	
	public static ShoppingCartService loadFromSpring() {
		ApplicationContext context = new ClassPathXmlApplicationContext ("topic4/ShoppingCart/beans.xml");
		return (ShoppingCartService)context.getBean("shoppingCartProxy");  
	}

}
