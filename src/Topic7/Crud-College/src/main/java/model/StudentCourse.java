package model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "studentcourse", uniqueConstraints = { @UniqueConstraint(columnNames = { "id" }) })
public class StudentCourse {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false, unique = true, length = 11)
	private int id;
	// @Column(name="id_student", length=11, nullable=false)
	@ManyToOne
	@JoinColumn(name = "id")
	private int id_student;
	// @Column(name="id_course", length=11, nullable=false)
	@ManyToOne
	@JoinColumn(name = "id")
	private int id_course;
	@Column(name = "note1", length = 11, nullable = false)
	private float note1;
	@Column(name = "note2", length = 11, nullable = false)
	private float note2;
	@Column(name = "note3", length = 11, nullable = false)
	private float note3;
	@Column(name = "final_note", length = 11, nullable = false)
	private float finalnote;
	
	
	
	

	public StudentCourse() {
	}

	public StudentCourse(int id, int id_student, int id_course, float note1,
			float note2, float note3, float finalnote) {
		super();
		this.id = id;
		this.id_student = id_student;
		this.id_course = id_course;
		this.note1 = note1;
		this.note2 = note2;
		this.note3 = note3;
		this.finalnote = finalnote;
		
	}

	public final int getId() {
		return id;
	}

	public final void setId(int id) {
		this.id = id;
	}

	public final int getId_student() {
		return id_student;
	}

	public final void setId_student(int id_student) {
		this.id_student = id_student;
	}

	public final int getId_course() {
		return id_course;
	}

	public final void setId_course(int id_course) {
		this.id_course = id_course;
	}

	public final float getNote1() {
		return note1;
	}

	public final void setNote1(float note1) {
		this.note1 = note1;
	}

	public final float getNote2() {
		return note2;
	}

	public final void setNote2(float note2) {
		this.note2 = note2;
	}

	public final float getNote3() {
		return note3;
	}

	public final void setNote3(float note3) {
		this.note3 = note3;
	}

	public final float getFinalnote() {
		return finalnote;
	}

	public final void setFinalnote(float finalnote) {
		this.finalnote = finalnote;
	}



}
