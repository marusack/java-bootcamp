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

	public String readUser(int idForSearch) {
		
		return implementation.readUser(idForSearch);
	}

	public boolean addFriend(User user, User friend) {
		
		return implementation.addFriend(user, friend);
	}

	public boolean removeFriend(User user, User friend) {
		
		return implementation.removeFriend(user, friend);
	}

	public boolean addPhoto(User user, Photo photo) {
		
		return implementation.addPhoto(user, photo);
	}

	public boolean removePhoto(User user, Photo photo) {
		
		return implementation.removePhoto(user, photo);
	}

	public String showFriends(int idForSearch) {
		
		return implementation.showFriends(idForSearch);
	}

	public boolean addTag(User user, Photo photo, User Tagg) {
		
		return implementation.addTag(user, photo, Tagg);
	}

	public boolean removeTag(User user, Photo photo, User Tagg) {
		
		return implementation.removeTag(user, photo, Tagg);
	}

	public void addLike(User user, Photo photo) {
		implementation.addLike(user, photo);
		
	}

	public void removeLike(User user, Photo photo) {
		implementation.removeLike(user, photo);
		
	}

	public String showLikes(User user, int idphoto) {
		
		return implementation.showLikes(user, idphoto);
	}

}
