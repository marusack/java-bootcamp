package resourses;

import java.util.Calendar;

import entitys.*;

public interface TimeSlotInterface {

	public void createTimeSlot(int year, int month, int day, int hour,
			int minutes, int seconds, int durationHours);

	public TimeSlot getTime();

	public void createTimeSlot(Calendar date, int durationHours);

}
