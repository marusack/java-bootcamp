package topic4.UserService;


import java.util.ArrayList;

import junit.framework.TestCase;

import org.junit.Test;




public class UserTest extends TestCase {

	
	@Test
	public void test() {
		UserImp users = new UserImp();
		assertTrue(users.createUser(1, "mariel sack ceppi", "marielsack@gmail.com", 'f'));
		assertTrue(users.deleteUser(1));
		
			}
		
	@Test
	public void testLocalService() {
		UserService users = UserFactory.getLocalService();
		assertTrue(users.createUser(2, "Angeles lucia Santos", "marielsack@gmail.com", 'f'));
		assertTrue(users.updateUser(new User(1, "mariel sack ceppi", "marielsack@gmail.com", 'f')));
	}
	
	@Test
	public void testWebService() {
		UserService users = UserFactory.getRemoteServiceUsingWebService();
		assertTrue(users.createUser(2, "Angeles lucia Santos", "marielsack@gmail.com", 'f'));
		}
	@Test
	public void testUsingSpring(){
		UserService users = UsingSpring.loadFromSpring();
		assertTrue(users.createUser(3, "Nicolas Flesler", "marielsack@gmail.com", 'm'));
	}
	
}