package com.mar.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "order")
public class Order {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;

	@Column(name = "status")
	
	private String status;

	@Temporal(TemporalType.DATE)
	
	private Date date;

	@Column(name = "total")
	
	private double total;

	
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "order", cascade = CascadeType.ALL)
	private ShoppingCart shoppingCart;

	
	
	
	public Order() {
	}

	public Order(Long id) {
		this.id = id;
	}

	public Order(String status, Date date, double total,
			ShoppingCart shoppingcart) {
		this.status = status;

		this.date = date;
		this.total = total;
		this.shoppingCart = shoppingcart;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public ShoppingCart getShoppingcart() {
		return shoppingCart;
	}

	public void setShoppingcart(ShoppingCart shoppingcart) {
		this.shoppingCart = shoppingcart;
	}

}
