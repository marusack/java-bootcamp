package topic4.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mariel
 *
 */

public class UserImp implements UserService {

	ArrayList<User> listOfUsers = new ArrayList<User>();

	public boolean createUser(int id, String fullname, String email, char gender) {
		User user = new User(id, fullname, email, gender);
		return listOfUsers.add(user);
	}

	/**
	 * this method has to identify the element that we want to change, but we
	 * can't change his id the others fields can be changed
	 */
	public boolean updateUser(User user) {
		boolean ans = false;
		for (int i = 0; i < listOfUsers.size(); i++) {

			if (listOfUsers.get(i).getId() == user.getId()) {
				listOfUsers.get(i).setEmail(user.getEmail());
				listOfUsers.get(i).setFullname(user.getFullname());
				listOfUsers.get(i).setGender(user.getGender());
				// here we establish that the id can't be changed by any reason
				// its not allowed
				ans = true;
			}

		}

		return ans;
	}

	public boolean deleteUser(int idForSearch) {
		boolean ans = false;
		for (int i = 0; i < listOfUsers.size(); i++) {

			if (listOfUsers.get(i).getId() == idForSearch) {
				listOfUsers.remove(i);
				ans = true;
			}

		}
		return ans;
	}

	public User searchUsuer(int idForSearch) {
		User aux = null;
		for (int i = 0; i < listOfUsers.size(); i++) {

			if (listOfUsers.get(i).getId() == idForSearch) {
				aux = listOfUsers.get(i);
			}

		}
		return aux;
	}

}
