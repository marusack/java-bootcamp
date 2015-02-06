package resourses;

import java.util.ArrayList;

import entitys.*;

public interface MeetingInterface {

	public void createMeeting(int id, ArrayList<Attendees> attendants,
			Room room, TimeSlot time);

	public String getAllMeeting();

	public Meeting getMeeting(int meetingId);

	public void cancelMeeting(Meeting meeting);

	public void cancelMeeting(int meeting);

	public void updateMeeting(Meeting oldMeeting, Meeting newMeeting);

}
