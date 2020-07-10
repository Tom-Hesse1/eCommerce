package com.tts.eComm.model;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "product_id")
	private Long orderId;
	
	private User user;
	private String date;
	private ArrayList<Product> items;
	private Double subTotal;
	private Double shippingCost;
	private Double tax;
	private Double total;
	private String arrivalDate;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(Long orderId, User user, String date, ArrayList<Product> items, Double subTotal, Double shippingCost,
			Double tax, Double total, String arrivalDate) {
		this.orderId = orderId;
		this.user = user;
		this.date = date;
		this.items = items;
		this.subTotal = subTotal;
		this.shippingCost = shippingCost;
		this.tax = tax;
		this.total = total;
		this.arrivalDate = arrivalDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public ArrayList<Product> getItems() {
		return items;
	}

	public void setItems(ArrayList<Product> items) {
		this.items = items;
	}

	public Double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}

	public Double getShippingCost() {
		return shippingCost;
	}

	public void setShippingCost(Double shippingCost) {
		this.shippingCost = shippingCost;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public String getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public Long getOrderId() {
		return orderId;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", user=" + user + ", date=" + date + ", items=" + items + ", subTotal="
				+ subTotal + ", shippingCost=" + shippingCost + ", tax=" + tax + ", total=" + total + ", arrivalDate="
				+ arrivalDate + "]";
	}

	

}
