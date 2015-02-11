package com.mar.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
@Entity
@Table(name = "shoppingcart")
public class ShoppingCart {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;
	
	
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	private Order order;
	
	@OneToMany(mappedBy = "shoppingCart")
	private List<ProductLine> productLine;
  
	
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	private User user;
	
	
	
	public User getUser() {
		return user;
	}


	public ShoppingCart(Long id, Order order, List<ProductLine> productLine,
			User user) {
		super();
		this.id = id;
		this.order = order;
		this.productLine = productLine;
		this.user = user;
	}


	public void setUser(User user) {
		this.user = user;
	}

	public ShoppingCart() {
	}

	public ShoppingCart(long id){
		this.id = id;
	}
	
	
	public ShoppingCart(User user, List<ProductLine> productLine) {
		this.productLine = productLine;
		this.user = user;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public List<ProductLine> getProductLine() {
		return productLine;
	}


	public void setProductLine(List<ProductLine> productLine) {
		this.productLine = productLine;
	}


	public final Order getOrder() {
		return order;
	}


	public final void setOrder(Order order) {
		this.order = order;
	}

	

		
	
}