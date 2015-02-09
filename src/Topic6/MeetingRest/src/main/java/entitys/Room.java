package entitys;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name="room", uniqueConstraints={@UniqueConstraint(columnNames={"id"})})
public class Room {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false , unique=true, length=11 )  
	private int id;
	@Column(name="name", length=20, nullable=true)
	private String name;;

	public Room() {
	}

	public Room(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
	}

	

	@Override
	public String toString() {
		return "Room [id=" + id + ", name=" + name + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

}
