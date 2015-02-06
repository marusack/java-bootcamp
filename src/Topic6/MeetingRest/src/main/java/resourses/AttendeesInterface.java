package resourses;

import entitys.*;
import java.util.ArrayList;

public interface AttendeesInterface {

	public void createAttendee(int id, String Name);

	public ArrayList<Attendees> getAttendees();

	public Attendees getAttendee(int attendeeId);

	public void cancelAttendee(int attendeeid);

	public void cancelAttendee(Attendees attendee);

	public void updateAttendee(Attendees attendee);
}
