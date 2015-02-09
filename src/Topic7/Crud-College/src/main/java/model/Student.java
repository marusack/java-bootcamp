package model;

import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "students", uniqueConstraints = { @UniqueConstraint(columnNames = { "id" }) })
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false, unique = true, length = 11)
	private int id;
	@Column(name = "first_name", length = 30, nullable = false)
	private String firstname;
	@Column(name = "last_name", length = 30, nullable = false)
	private String lastname;
	@Column(name = "registration_number", length = 11, nullable = false)
	private int registrationnumber;
	@Column(name = "date_birth", nullable = false)
	private Date datebirth;
	/*@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "STUDENtS_ID")
	private Set<StudentCourse> courses;*/

	public Student() {
	}

	public Student(int id, String firstname, String lastname,
			int registrationnumber, Date datebirth) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.registrationnumber = registrationnumber;
		this.datebirth = datebirth;
	}

	public final int getId() {
		return id;
	}

	public final void setId(int id) {
		this.id = id;
	}

	public final String getFirstname() {
		return firstname;
	}

	public final void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public final String getLastname() {
		return lastname;
	}

	public final void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public final int getRegistrationnumber() {
		return registrationnumber;
	}

	public final void setRegistrationnumber(int registrationnumber) {
		this.registrationnumber = registrationnumber;
	}

	public final Date getDatebirth() {
		return datebirth;
	}

	public final void setDatebirth(Date datebirth) {
		this.datebirth = datebirth;
	}

}
