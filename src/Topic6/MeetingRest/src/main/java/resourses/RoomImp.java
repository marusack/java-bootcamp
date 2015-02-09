package resourses;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import entitys.Meeting;
import entitys.Room;

@Service
public class RoomImp implements RoomInterface {
	private ArrayList<Room> rooms;

	/**
	 * this method creates a room with the parameters given and adds such room
	 * to a list
	 * 
	 * @param Id
	 * @param name
	 * @param appointments
	 *            its an array list of Meeting of the day
	 * @return {@link Void}
	 */
	@Override
	public void createRoom(int Id, String name) {

		Room room = new Room();
		room.setId(Id);
		room.setName(name);
		
		rooms.add(room);
	}

	@Override
	public ArrayList<Room> getRooms() {

		return rooms;
	}

	public void setRooms(ArrayList<Room> rooms) {
		this.rooms = rooms;
	}

	/**
	 * this method searches a room in the list by the id of such room returns an
	 * Room object who matches the id given
	 * 
	 * @param roomId
	 * @return {@link Room}
	 * 
	 */
	@Override
	public Room getRoom(int roomId) {
		Room ans = null;
		for (int i = 0; i < rooms.size(); i++) {
			if (rooms.get(i).getId() == roomId) {
				ans = rooms.get(i);
			}
		}
		return ans;
	}

	/**
	 * this method removes a room from the list by the parameter given(id)
	 * 
	 * @param roomId
	 *            int
	 * @return {@link Void}
	 */
	@Override
	public void cancelRoom(int roomId) {
		for (int i = 0; i < rooms.size(); i++) {
			if (rooms.get(i).getId() == roomId) {
				rooms.remove(i);
			}
		}

	}

	/**
	 * this method removes a room from the list by the object given(Room)
	 * 
	 * @param room
	 * @return {@link Void}
	 */
	@Override
	public void cancelRoom(Room room) {
		rooms.remove(room);

	}

}
