package topic4.UserService;

import org.springframework.stereotype.Component;

@Component
public class UserWebServiceClient implements UserService {

	UserService imp = new UserImp();

	public boolean createUser(int id, String fullname, String email, char gender) {

		return imp.createUser(id, fullname, email, gender);
	}

	public boolean updateUser(User user) {

		return imp.updateUser(user);
	}

	public boolean deleteUser(int idForSearch) {

		return imp.deleteUser(idForSearch);
	}

	public User searchUsuer(int idForSearch) {

		return imp.searchUsuer(idForSearch);
	}

}
