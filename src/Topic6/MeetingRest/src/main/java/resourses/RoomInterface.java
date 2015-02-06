package resourses;

import java.util.ArrayList;

import entitys.Meeting;
import entitys.Room;

public interface RoomInterface {

	public void createRoom(int Id, String name, ArrayList<Meeting> appointments);

	public ArrayList<Room> getRooms();

	public Room getRoom(int roomId);

	public void cancelRoom(int roomId);

	public void cancelRoom(Room room);
}
