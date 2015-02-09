package model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "teacher", uniqueConstraints = { @UniqueConstraint(columnNames = { "id" }) })
public class Teacher {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false, unique = true, length = 11)
	private int id;
	@Column(name = "first_name", length = 30, nullable = false)
	private String firstname;
	@Column(name = "last_name", length = 30, nullable = false)
	private String lastname;
	@Column(name = "date_birth", nullable = false)
	private Date datebirth;
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	private Course course;

	public Teacher() {
	}

	public Teacher(int id, String firstname, String lastname, Date datebirth,
			Course course) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.datebirth = datebirth;
		this.course = course;
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

	public final Date getDatebirth() {
		return datebirth;
	}

	public final void setDatebirth(Date datebirth) {
		this.datebirth = datebirth;
	}

}
