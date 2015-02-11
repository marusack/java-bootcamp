package com.mar.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
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

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "user", cascade = CascadeType.ALL) 
	private CreditCard creditcard;

	// @OneToOne(cascade = CascadeType.ALL)
	// @JoinColumn(name = "shoppingcart_id")
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "user", cascade = CascadeType.ALL) 
	private ShoppingCart shoppingcart;

	public User() {
	}


	public User(Long id, String firstname, String lastname, String mail,
			String address, String username, String password,
			CreditCard creditcard, ShoppingCart shoppingcart) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.mail = mail;
		this.address = address;
		this.username = username;
		this.password = password;
		this.creditcard = creditcard;
		this.shoppingcart = shoppingcart;
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

	

	public final CreditCard getCreditcard() {
		return creditcard;
	}


	public final void setCreditcard(CreditCard creditcard) {
		this.creditcard = creditcard;
	}


	public final ShoppingCart getShoppingcart() {
		return shoppingcart;
	}

	public final void setShoppingcart(ShoppingCart shoppingcart) {
		this.shoppingcart = shoppingcart;
	}

}
