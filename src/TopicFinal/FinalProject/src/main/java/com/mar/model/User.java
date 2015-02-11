
package com.mar.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;
	@Column(name = "firstname")
	
	private String firstname;
	@Column(name = "lastname")
	
	private String lastname;
	@Column(name = "mail")
	
	private String mail;
	@Column(name = "address")
	
	private String address;
	@Column(name = "username")
	
	private String username;
	@Column(name = "password")
	
	private String password;
	
	@OneToMany(mappedBy = "user")
	private List<CreditCard> creditcard;
	
	public User() {
	}

	
	
	public User(String firstname, String lastname, String mail, String address,
			String username, String password, List<CreditCard> creditcard) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.mail = mail;
		this.address = address;
		this.username = username;
		this.password = password;
		this.creditcard = creditcard;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getFirstname() {
		return firstname;
	}



	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}



	public String getLastname() {
		return lastname;
	}



	public void setLastname(String lastname) {
		this.lastname = lastname;
	}



	public String getMail() {
		return mail;
	}



	public void setMail(String mail) {
		this.mail = mail;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public List<CreditCard> getCreditcard() {
		return creditcard;
	}



	public void setCreditcard(List<CreditCard> creditcard) {
		this.creditcard = creditcard;
	}
	
	
	
	
}

	
