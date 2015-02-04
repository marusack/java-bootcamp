package topic4.UserService;

import junit.framework.TestCase;

import org.junit.Test;

public class UserTest extends TestCase {

	@Test
	public void test() {
		UserImp users = new UserImp();
		assertTrue(users.createUser(1, "mariel sack ceppi", "marielsack@gmail.com", 'f'));
		assertTrue(users.createUser(2, "caro Romero", "CR@gmail.com", 'f'));
		users.addFriend(users.searchUsuer(1), users.searchUsuer(2));
		assertEquals("User Name : caro Romero, Email: CR@gmail.com, Gender: f\n", users.showFriends(1));
		users.removeFriend(users.searchUsuer(1), users.searchUsuer(2));
		assertEquals("", users.showFriends(1));
		assertTrue(users.deleteUser(1));
	}

	@Test
	public void testLocalService() {
		UserService users = UserFactory.getLocalService();
		assertTrue(users.createUser(3, "Angeles lucia Santos", "marielsack@gmail.com", 'f'));
		assertTrue(users.updateUser(new User(3, "mariel sack ceppi", "marielsack@gmail.com", 'f')));
		assertTrue(users.createUser(1, "mariel sack ceppi", "marielsack@gmail.com", 'f'));
		assertTrue(users.createUser(2, "caro Romero", "CR@gmail.com", 'f'));
		users.addFriend(users.searchUsuer(1), users.searchUsuer(2));
		assertEquals("User Name : caro Romero, Email: CR@gmail.com, Gender: f\n", users.showFriends(1));
		users.removeFriend(users.searchUsuer(1), users.searchUsuer(2));
		assertEquals("", users.showFriends(1));
		assertTrue(users.deleteUser(1));
	}

	@Test
	public void testWebService() {
		UserService users = UserFactory.getRemoteServiceUsingWebService();
		assertTrue(users.createUser(3, "Angeles lucia Santos", "marielsack@gmail.com", 'f'));
		assertTrue(users.createUser(1, "mariel sack ceppi", "marielsack@gmail.com", 'f'));
		assertTrue(users.createUser(2, "caro Romero", "CR@gmail.com", 'f'));
		users.addFriend(users.searchUsuer(1), users.searchUsuer(2));
		assertEquals("User Name : caro Romero, Email: CR@gmail.com, Gender: f\n", users.showFriends(1));
		users.removeFriend(users.searchUsuer(1), users.searchUsuer(2));
		assertEquals("", users.showFriends(1));
		assertTrue(users.deleteUser(1));
	}

	@Test
	public void testUsingSpring() {
		UserService users = UsingSpring.loadFromSpring();
		assertTrue(users.createUser(3, "Nicolas Flesler", "marielsack@gmail.com", 'm'));
		assertTrue(users.createUser(1, "mariel sack ceppi", "marielsack@gmail.com", 'f'));
		assertTrue(users.createUser(2, "caro Romero", "CR@gmail.com", 'f'));
		users.addFriend(users.searchUsuer(1), users.searchUsuer(2));
		assertEquals("User Name : caro Romero, Email: CR@gmail.com, Gender: f\n", users.showFriends(1));
		users.removeFriend(users.searchUsuer(1), users.searchUsuer(2));
		assertEquals("", users.showFriends(1));
		assertTrue(users.deleteUser(1));
	}

}