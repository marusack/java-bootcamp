package topic4.UserService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsingSpring {

	public static UserService loadFromSpring() {
		ApplicationContext context = new ClassPathXmlApplicationContext("topic4/UserService/beans.xml");
		return (UserService) context.getBean("userProxy");
	}

}
