
package com.mar.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="creditcard")
public class CreditCard {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;
	
	@Column(name = "number")
	
	private double number;
	
	@Column(name = "bank")
	
	private String bank;
	
	@Temporal(TemporalType.DATE)
	
	private Date expdate;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private User user;

	public CreditCard() {

	}

	public CreditCard(Long id) {
		this.id = id;
	}

	

	public CreditCard(Long id, double number, String bank, Date expdate,
			User user) {
		super();
		this.id = id;
		this.number = number;
		this.bank = bank;
		this.expdate = expdate;
		this.user = user;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	public double getNumber() {
		return number;
	}

	public void setNumber(double number) {
		this.number = number;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	

	public Date getExpdate() {
		return expdate;
	}

	public void setExpdate(Date expdate) {
		this.expdate = expdate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	
	
}
