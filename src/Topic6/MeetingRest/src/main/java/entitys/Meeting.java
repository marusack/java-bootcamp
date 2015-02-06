package entitys;

import java.util.ArrayList;




public class Meeting {
	
	private int id;
	private ArrayList<Attendees> attendants;
	private Room room;
	private TimeSlot time;

	public Meeting() {

	}

	public Meeting(int id, ArrayList<Attendees> attendants, Room room,
			TimeSlot time) {
		super();
		this.id = id;
		this.attendants = attendants;
		this.room = room;
		this.time = time;
	}

	@Override
	public String toString() {
		return "Meeting [id=" + id + ", attendants=" + attendants + ", room="
				+ room + ", time=" + time + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Attendees> getAttendants() {
		return attendants;
	}

	public void setAttendants(ArrayList<Attendees> attendants) {
		this.attendants = attendants;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public TimeSlot getTime() {
		return time;
	}

	public void setTime(TimeSlot time) {
		this.time = time;
	}

}
