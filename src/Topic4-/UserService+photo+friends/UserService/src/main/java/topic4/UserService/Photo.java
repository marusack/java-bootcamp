package topic4.UserService;

import java.util.ArrayList;

public class Photo {
private int id;
private int likes;
private ArrayList<User> taggedFriends;



public Photo(int id, int likes, ArrayList<User> taggedFriends) {
	this.setId(id);
	this.likes = likes;
	this.taggedFriends = taggedFriends;
}
/**
 * @return the likes
 */
public int getLikes() {
	return likes;
}
/**
 * @return the taggedFriends
 */
public ArrayList<User> getTaggedFriends() {
	return taggedFriends;
}
/**
 * @param likes the likes to set
 */
public void setLikes(int likes) {
	this.likes = likes;
}
/**
 * @param taggedFriends the taggedFriends to set
 */
public void setTaggedFriends(ArrayList<User> taggedFriends) {
	this.taggedFriends = taggedFriends;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
}
