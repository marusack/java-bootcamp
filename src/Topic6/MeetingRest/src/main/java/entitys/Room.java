package entitys;

import java.util.ArrayList;



public class Room {

	  
	private int id;
	private String name;
	private ArrayList<Meeting> appointments;

	public Room() {
	}

	public Room(int id, String name, ArrayList<Meeting> appointments) {
		super();
		this.id = id;
		this.name = name;
		this.appointments = appointments;
	}

	@Override
	public String toString() {
		return "Room [id=" + id + ", name=" + name + ", appointments="
				+ appointments + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Meeting> getAppointments() {
		return appointments;
	}

	public void setAppointments(ArrayList<Meeting> appointments) {
		this.appointments = appointments;
	}

}
