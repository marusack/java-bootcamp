package entitys;

import java.util.Calendar;
import java.util.GregorianCalendar;



public class TimeSlot {
	 
	private int id;
	private Calendar date;
	private int durationHours;

	public TimeSlot() {
	}
 
	public TimeSlot(int id, Calendar date, int durationHours) {
		super();
		this.id = id;
		this.date = date;
		this.durationHours = durationHours;
	}

	public TimeSlot(Calendar date, int durationHours) {

		this.date = date;
		this.durationHours = durationHours;
	}

	public TimeSlot(int year, int month, int day, int hour, int minutes,
			int seconds, int durationHours) {
		super();

		Calendar calendar = new GregorianCalendar(year, month, day, hour,
				minutes, seconds);
		this.date = calendar;
		this.durationHours = durationHours;
	}

	
	@Override
	public String toString() {
		return "TimeSlot [id=" + id + ", date=" + date + ", durationHours="
				+ durationHours + "]";
	}

	public final Calendar getDate() {
		return date;
	}

	public final void setDate(Calendar date) {
		this.date = date;
	}

	public final int getDurationHours() {
		return durationHours;
	}

	public final void setDurationHours(int durationHours) {
		this.durationHours = durationHours;
	}

}
