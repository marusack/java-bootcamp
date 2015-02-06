package resourses;

import java.util.Calendar;

import org.springframework.stereotype.Service;

import entitys.TimeSlot;

@Service
public class TimeSlotImp implements TimeSlotInterface {
	private TimeSlot time;

	@Override
	public void createTimeSlot(int year, int month, int day, int hour,
			int minutes, int seconds, int durationHours) {

		TimeSlot ts = new TimeSlot(year, month, day, hour, minutes, seconds,
				durationHours);
		setTime(ts);

	}

	public TimeSlot getTime() {
		return time;
	}

	public void setTime(TimeSlot time) {
		this.time = time;
	}

	@Override
	public void createTimeSlot(Calendar date, int durationHours) {
		TimeSlot ts = new TimeSlot(date, durationHours);
		setTime(ts);

	}

}
