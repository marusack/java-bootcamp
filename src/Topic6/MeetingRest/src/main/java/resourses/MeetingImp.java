package resourses;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import entitys.Attendees;
import entitys.Meeting;
import entitys.Room;
import entitys.TimeSlot;

@Service
public class MeetingImp implements MeetingInterface {
	private ArrayList<Meeting> meetings;

	/**
	 * this method creates a meeting with all the parameters and adds the
	 * meeting to the schedule
	 * 
	 * @param attendants
	 *            its an arraylist of attendees
	 * @param room
	 *            where is going to be the meeting
	 * @param time
	 *            its an object that contains the beginning(time) and the end of
	 *            the meeting(time)
	 * @return void
	 */
	@Override
	public void createMeeting(int id, ArrayList<Attendees> attendants,
			Room room, TimeSlot time) {
		Meeting meeting = new Meeting();
		meeting.setId(id);
		for (int i = 0; i < attendants.size(); i++) {
			meeting.getAttendants().add(attendants.get(i));
		}
		meeting.setRoom(room);
		meeting.setTime(time);

		// add to general meetings in memory
		meetings.add(meeting);

	}

	/**
	 * this method brings all the meetings in the schedule and all the
	 * information related
	 *
	 * @return String its a list of all the basic information of the meetings
	 **/
	@Override
	public String getAllMeeting() {
		String ans = "";
		for (int i = 0; i < this.getMeetings().size(); i++) {
			ans = ans + this.getMeetings().get(i).toString() + "\n";
		}
		return ans;
	}

	/**
	 * this method finds a meeting from the schedule by its id
	 * 
	 * @param meetingId
	 *            it represent the id of the meeting that has to be found
	 *
	 * @return void
	 **/
	@Override
	public Meeting getMeeting(int meetingId) {
		Meeting ans = null;
		for (int i = 0; i < meetings.size(); i++) {
			if (meetings.get(i).getId() == meetingId) {
				ans = meetings.get(i);
			}
		}
		return ans;
	}

	/**
	 * this method removes a meeting from the schedule
	 * 
	 * @param meeting
	 *            it represent an object Meeting
	 *
	 * @return void
	 **/
	@Override
	public void cancelMeeting(Meeting meeting) {
		meetings.remove(meeting);

	}

	/**
	 * this method finds a meeting that was made before and removes it from the
	 * schedule
	 * 
	 * @param meeting
	 *            it represent the id of the meeting that has to be removed
	 *
	 * @return void
	 **/
	@Override
	public void cancelMeeting(int meeting) {
		Meeting ans = null;
		for (int i = 0; i < meetings.size(); i++) {
			if (meetings.get(i).getId() == meeting) {
				ans = meetings.get(i);
			}
		}
		meetings.remove(ans);

	}

	/**
	 * this method makes an update of a particular meeting. all the fields can
	 * be changed but the id has to be the same its not allowed to change it
	 * 
	 * @param actualMeeting
	 *            its the object that we wont to change
	 * @param newMeeting
	 *            the new object who contains all the new information
	 * @return void
	 **/
	@Override
	public void updateMeeting(Meeting actualMeeting, Meeting newMeeting) {

		for (int i = 0; i < meetings.size(); i++) {
			if (meetings.get(i).getId() == actualMeeting.getId()) {
				meetings.get(i).setAttendants(newMeeting.getAttendants());
				meetings.get(i).setRoom(newMeeting.getRoom());
				meetings.get(i).setTime(newMeeting.getTime());
			}
		}

	}

	public void setMeetings(ArrayList<Meeting> meetings) {
		this.meetings = meetings;
	}

	public ArrayList<Meeting> getMeetings() {
		return meetings;
	}

}
