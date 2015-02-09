package entitys;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name="timeslot", uniqueConstraints={@UniqueConstraint(columnNames={"id"})})
public class TimeSlot {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false , unique=true, length=11 )
	private int id;
	@Column(name="date", length=20, nullable=true)
	private String date;
	@Column(name="duration", length=10, nullable=true)
	private int durationHours;

	public TimeSlot() {
	}
 
	public TimeSlot(int id, String date, int durationHours) {
		super();
		this.id = id;
		this.date = date;
		this.durationHours = durationHours;
	}
	
	
	@Override
	public String toString() {
		return "TimeSlot [id=" + id + ", date=" + date + ", durationHours="
				+ durationHours + "]";
	}

	public final String getDate() {
		return date;
	}

	public final void setDate(String date) {
		this.date = date;
	}

	public final int getDurationHours() {
		return durationHours;
	}

	public final void setDurationHours(int durationHours) {
		this.durationHours = durationHours;
	}

}
