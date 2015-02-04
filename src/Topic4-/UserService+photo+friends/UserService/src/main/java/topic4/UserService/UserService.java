package topic4.UserService;

import org.springframework.stereotype.Service;

@Service
public interface UserService {

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
	public boolean createUser(int id, String fullname, String email, char gender);

	/**
	 * this method has to identify the element that we want to change, but we
	 * can't change his id the others fields can be changed
	 * 
	 * @param user
	 * @return boolean
	 */
	public boolean updateUser(User user);

	/**
	 * this method finds a unit searching for his id, and then removes the
	 * element from the collection
	 * 
	 * @param idForSearch
	 * @return boolean
	 */
	public boolean deleteUser(int idForSearch);

	/**
	 * this method search one user by his id in the collection and return the
	 * User or null in other way
	 * 
	 * @param idForSearch
	 * @return User
	 */
	public User searchUsuer(int idForSearch);

	/**
	 * this method shows the information of one particular user in one line
	 * 
	 * @param idForSearch
	 * @return one string of the form -user: name, email, gender
	 **/
	public String readUser(int idForSearch);

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
	public boolean addFriend(User user, User friend);

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
	public boolean removeFriend(User user, User friend);

	/**
	 * this method adds a Photo to a collection of Photos from a User. user is
	 * the owner of the collection and photo is an Photo object
	 * 
	 * @param user
	 *            (the owner of the collection)
	 * @param photo
	 * @return true if it was added correctly
	 */
	public boolean addPhoto(User user, Photo photo);

	/**
	 * this method removes a Photo to a collection of Photos from a User. user
	 * is the owner of the collection and photo is an Photo object
	 * 
	 * @param user
	 *            (the owner of the collection)
	 * @param photo
	 * @return true if it was removed correctly
	 */
	public boolean removePhoto(User user, Photo photo);

	/**
	 * this method shows all the basic information of the friends of one User
	 * 
	 * @param idForSearch
	 * @return String
	 */
	public String showFriends(int idForSearch);
	
	
	public boolean addTag(User user, Photo photo, User Tagg);
	public boolean removeTag(User user, Photo photo, User Tagg);
	public void addLike(User user,Photo photo);
	public void removeLike(User user,Photo photo);
	public String showLikes(User user,int idphoto);

}
