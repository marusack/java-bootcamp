package resourses;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import entitys.Attendees;

@Service
public class AttendeesImp implements AttendeesInterface {
	private ArrayList<Attendees> attendees;

	/**
	 * this method creates an attendee with the parameters given then adds the
	 * attendee to a list of attendees
	 * 
	 * @param id
	 * @param lastName
	 * @return void
	 */
	@Override
	public void createAttendee(int id, String Name) {
		Attendees attendee = new Attendees();
		attendee.setId(id);
		attendee.setName(Name);

		attendees.add(attendee);

	}

	/**
	 * this method searches for an attendee by his id the method returns an
	 * attendee object from the list
	 *
	 * @param attendeeId
	 *            the id for search
	 * @return {@link Attendees}
	 */
	@Override
	public Attendees getAttendee(int attendeeId) {
		Attendees ans = null;
		for (int i = 0; i < attendees.size(); i++) {
			if (attendees.get(i).getId() == attendeeId) {
				ans = attendees.get(i);
			}
		}
		return ans;
	}

	/**
	 * this method removes a particular attendee from the list it search for him
	 * by his id and then removes it from the list
	 *
	 * @param attendeeid
	 *            int it represent the id of such attendee
	 * @return void
	 */
	@Override
	public void cancelAttendee(int attendeeid) {
		Attendees ans = null;
		for (int i = 0; i < attendees.size(); i++) {
			if (attendees.get(i).getId() == attendeeid) {
				ans = attendees.get(i);
			}

		}
		attendees.remove(ans);

	}

	/**
	 * this method removes a particular attendee from the list
	 *
	 * @param attendee
	 * @return void
	 */
	@Override
	public void cancelAttendee(Attendees attendee) {
		attendees.remove(attendee);

	}

	/**
	 * this method searches for a particular attendee and change the attributes
	 * the id of the attendee can not be changed its not allowed
	 * 
	 * @param attendee
	 *            the object who has the newest information
	 * @return void
	 */
	@Override
	public void updateAttendee(Attendees attendee) {

		for (int i = 0; i < attendees.size(); i++) {
			if (attendees.get(i).getId() == attendee.getId()) {
				attendees.get(i).setName(attendee.getName());
			}

		}

	}

	/**
	 * @param attendees
	 *            the attendees to set
	 */
	public final void setAttendees(ArrayList<Attendees> attendees) {
		this.attendees = attendees;
	}

	@Override
	public ArrayList<Attendees> getAttendees() {

		return attendees;
	}

}
