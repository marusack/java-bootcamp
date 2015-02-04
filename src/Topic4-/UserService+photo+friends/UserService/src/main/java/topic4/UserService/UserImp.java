package topic4.UserService;

import java.util.ArrayList;


/**
 * @author mariel
 *
 */

public class UserImp implements UserService {

	ArrayList<User> listOfUsers = new ArrayList<User>();

	/**
	 * this method creates a new user whit the parameters given and then add
	 * that user to the collection of the service
	 * 
	 * @param id
	 * @param fullname
	 * @param email
	 * @param gender
	 * @return boolean
	 * 
	 */
	public boolean createUser(int id, String fullname, String email, char gender) {
		User user = new User(id, fullname, email, gender);
		return listOfUsers.add(user);
	}

	/**
	 * this method has to identify the element that we want to change, but we
	 * can't change his id the others fields can be changed
	 * 
	 * @param user
	 * @return boolean
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

	/**
	 * this method finds a unit searching for his id, and then removes the
	 * element from the collection
	 * 
	 * @param idForSearch
	 * @return boolean
	 */
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

	/**
	 * this method search one user by his id in the collection and return the
	 * User or null in other way
	 * 
	 * @param idForSearch
	 * @return User
	 */
	public User searchUsuer(int idForSearch) {
		User aux = null;
		for (int i = 0; i < listOfUsers.size(); i++) {

			if (listOfUsers.get(i).getId() == idForSearch) {
				aux = listOfUsers.get(i);
			}

		}
		return aux;
	}

	/**
	 * this method show the information of one particular user in one line
	 * 
	 * @param idForSearch
	 * @return one string of the form -user: name, email: email, gender: gender
	 **/
	public String readUser(int idForSearch) {
		User user = searchUsuer(idForSearch);
		return (user.toString());

	}

	/**
	 * this method adds a User to a collection of Friends. user is the owner of
	 * the collection and friend is an User object
	 * 
	 * @param user
	 *            (the owner of the collection)
	 * @param friend
	 *            (its the User that we need to add as a friend)
	 * @return true if it was added correctly
	 */

	public boolean addFriend(User user, User friend) {

		return user.getMyFriends().add(friend);
	}

	/**
	 * this method removes a User to a collection of Friends. user is the owner
	 * of the collection and friend is an User object
	 * 
	 * @param user
	 *            (the owner of the collection)
	 * @param friend
	 *            (its the User that we need to add as a friend)
	 * @return true if it was removed correctly
	 */
	public boolean removeFriend(User user, User friend) {

		return user.getMyFriends().remove(friend);
	}

	/**
	 * this method adds a Photo to a collection of Photos from a User. user is
	 * the owner of the collection and photo is an Photo object
	 * 
	 * @param user
	 *            (the owner of the collection)
	 * @param photo
	 * @return true if it was added correctly
	 */
	public boolean addPhoto(User user, Photo photo) {

		return user.getMyPhotos().add(photo);
	}

	/**
	 * this method removes a Photo to a collection of Photos from a User. user
	 * is the owner of the collection and photo is an Photo object
	 * 
	 * @param user
	 *            (the owner of the collection)
	 * @param photo
	 * @return true if it was removed correctly
	 */
	public boolean removePhoto(User user, Photo photo) {

		return user.getMyPhotos().remove(photo);
	}

	/**
	 * this method shows all the basic information of the friends of one User
	 * 
	 * @param idForSearch
	 * @return String
	 */
	public String showFriends(int idForSearch) {
		User user = searchUsuer(idForSearch);
		String ans = "";
		for (int i = 0; i < user.getMyFriends().size(); i++) {
			ans = ans + user.getMyFriends().get(i).toString() + "\n";

		}
		return ans;
	}

	/**
	 * @return the listOfUsers
	 */
	public ArrayList<User> getListOfUsers() {
		return listOfUsers;
	}

	/**
	 * @param listOfUsers the listOfUsers to set
	 */
	public void setListOfUsers(ArrayList<User> listOfUsers) {
		this.listOfUsers = listOfUsers;
	}

	public boolean addTag(User user, Photo photo, User Tagg) {
		return user.getMyPhotos().get(photo.getId()).getTaggedFriends().add(Tagg);
		
	}

	public boolean removeTag(User user, Photo photo, User Tagg) {
		return user.getMyPhotos().get(photo.getId()).getTaggedFriends().remove(Tagg);
	}

	public void addLike(User user, Photo photo) {
		
		user.getMyPhotos().get(photo.getId()).setLikes(photo.getLikes()+1);
	}

	public void removeLike(User user, Photo photo) {
		 user.getMyPhotos().get(photo.getId()).setLikes(photo.getLikes()-1);
	}

	public String showLikes(User user ,int idphoto) {
		
		return "This photo has "+user.getMyPhotos().get(idphoto).getLikes()+" Likes!";
	}

}
