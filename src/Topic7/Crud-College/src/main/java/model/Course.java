package model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "course", uniqueConstraints = { @UniqueConstraint(columnNames = { "id" }) })
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false, unique = true, length = 11)
	private int id;
	@Column(name = "name", length = 30, nullable = false)
	private String name;
	// @Column(name="assigned_teacher", length=11, nullable=false)
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "course", cascade = CascadeType.ALL)
	private Teacher assigned_teacher;
	@Column(name = "hours_week", length = 11, nullable = false)
	private int hoursweek;
	@Column(name = "schedule_time", length = 30, nullable = false)
	private String scheduletime;
	/*@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "COURSE_ID")
	private Set<StudentCourse> students;*/
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="studentcourse", joinColumns={@JoinColumn(name="COURSE_ID",referencedColumnName="id")}
	,inverseJoinColumns={@JoinColumn(name="STUDENTS_ID",referencedColumnName="id")})
	private Set <StudentCourse> students;
	

	public Course() {
	}

	public Course(int id, String name, Teacher assigned_teacher, int hoursweek,
			String scheduletime, Set<StudentCourse> students) {
		super();
		this.id = id;
		this.name = name;
		this.assigned_teacher = assigned_teacher;
		this.hoursweek = hoursweek;
		this.scheduletime = scheduletime;
		this.students = students;
	}

	public final Set<StudentCourse> getStudents() {
		return students;
	}

	public final void setStudents(Set<StudentCourse> students) {
		this.students = students;
	}

	public final int getId() {
		return id;
	}

	public final void setId(int id) {
		this.id = id;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final Teacher getAssigned_teacher() {
		return assigned_teacher;
	}

	public final void setAssigned_teacher(Teacher assigned_teacher) {
		this.assigned_teacher = assigned_teacher;
	}

	public final int getHoursweek() {
		return hoursweek;
	}

	public final void setHoursweek(int hoursweek) {
		this.hoursweek = hoursweek;
	}

	public final String getScheduletime() {
		return scheduletime;
	}

	public final void setScheduletime(String scheduletime) {
		this.scheduletime = scheduletime;
	}

}
