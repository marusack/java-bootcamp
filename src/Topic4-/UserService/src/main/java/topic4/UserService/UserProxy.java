package topic4.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserProxy implements UserService {
	@Autowired
	UserService implementation;

	public UserProxy() {
	}

	protected UserProxy(UserService imp) {
		this.implementation = imp;
	}

	public boolean createUser(int id, String fullname, String email, char gender) {

		return implementation.createUser(id, fullname, email, gender);
	}

	public boolean updateUser(User user) {

		return implementation.updateUser(user);
	}

	public boolean deleteUser(int idForSearch) {

		return implementation.deleteUser(idForSearch);
	}

	public User searchUsuer(int idForSearch) {

		return implementation.searchUsuer(idForSearch);
	}

}
