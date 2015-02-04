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

	public String readUser(int idForSearch) {
		
		return imp.readUser(idForSearch);
	}

	public boolean addFriend(User user, User friend) {
		
		return imp.addFriend(user, friend);
	}

	public boolean removeFriend(User user, User friend) {
		
		return imp.removeFriend(user, friend);
	}

	public boolean addPhoto(User user, Photo photo) {
		
		return imp.addPhoto(user, photo);
	}

	public boolean removePhoto(User user, Photo photo) {
		
		return imp.removePhoto(user, photo);
	}

	public String showFriends(int idForSearch) {
		
		return imp.showFriends(idForSearch);
	}

	public boolean addTag(User user, Photo photo, User Tagg) {
		
		return imp.addTag(user, photo, Tagg);
	}

	public boolean removeTag(User user, Photo photo, User Tagg) {
		
		return imp.removeTag(user, photo, Tagg);
	}

	public void addLike(User user, Photo photo) {
		imp.addLike(user, photo);
		
	}

	public void removeLike(User user, Photo photo) {
		imp.removeLike(user, photo);
		
	}

	public String showLikes(User user, int idphoto) {
				return imp.showLikes(user, idphoto);
	}

}
