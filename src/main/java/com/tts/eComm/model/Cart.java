package com.tts.eComm.model;
import java.util.HashMap;
import java.util.List;

public class Cart {

	private User user;
	private String date;
	private List<HashMap<Product, Integer>> lineItems;
	private Double subTotal;
	
	Cart() {}

	public Cart(User user, String date, List<HashMap<Product, Integer>> lineItems, Double subTotal) {
		this.user = user;
		this.date = date;
		this.lineItems = lineItems;
		this.subTotal = subTotal;
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

	public List<HashMap<Product, Integer>> getLineItems() {
		return lineItems;
	}

	public void setLineItems(List<HashMap<Product, Integer>> lineItems) {
		this.lineItems = lineItems;
	}

	public Double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}

	@Override
	public String toString() {
		return "Cart [user=" + user + ", date=" + date + ", subTotal=" + subTotal + "]";
	}

}
