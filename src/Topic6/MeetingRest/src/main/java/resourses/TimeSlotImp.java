package resourses;

import java.util.Calendar;

import org.springframework.stereotype.Service;

import entitys.TimeSlot;

@Service
public class TimeSlotImp implements TimeSlotInterface {
	private TimeSlot time;

	

	public TimeSlot getTime() {
		return time;
	}

	public void setTime(TimeSlot time) {
		this.time = time;
	}

	@Override
	public void createTimeSlot(int id, String date, int durationHours) {
		TimeSlot ts = new TimeSlot(id,date, durationHours);
		setTime(ts);

	}

	@Override
	public void createTimeSlot(int year, int month, int day, int hour,
			int minutes, int seconds, int durationHours) {
		// TODO Auto-generated method stub
		
	}

}
