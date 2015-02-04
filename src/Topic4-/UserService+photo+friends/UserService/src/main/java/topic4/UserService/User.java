package topic4.UserService;

import java.util.ArrayList;

public class User {

	

	private int id;
	private String fullname;
	private String email;
	private char gender;
	private ArrayList<Photo> myPhotos;
	private ArrayList<User> myFriends;

	public User(int id, String fullname, String email, char gender) {

		this.setId(id);
		this.setFullname(fullname);
		this.setEmail(email);
		this.setGender(gender);
		this.setMyFriends(new ArrayList<User>());
		this.setMyPhotos(new ArrayList<Photo>());
	}
	
	public String toString(){
		return ("User Name : "+this.getFullname()+", Email: "+this.getEmail()+", Gender: "+ this.getGender());
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the fullname
	 */
	public String getFullname() {
		return fullname;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @return the gender
	 */
	public char getGender() {
		return gender;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @param fullname
	 *            the fullname to set
	 */
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @param gender
	 *            the gender to set
	 */
	public void setGender(char gender) {
		this.gender = gender;
	}

	/**
	 * @return the myPhotos
	 */
	public ArrayList<Photo> getMyPhotos() {
		return myPhotos;
	}

	/**
	 * @return the myFriends
	 */
	public ArrayList<User> getMyFriends() {
		return myFriends;
	}

	/**
	 * @param myPhotos the myPhotos to set
	 */
	public void setMyPhotos(ArrayList<Photo> myPhotos) {
		this.myPhotos = myPhotos;
	}

	/**
	 * @param myFriends the myFriends to set
	 */
	public void setMyFriends(ArrayList<User> myFriends) {
		this.myFriends = myFriends;
	}

}
