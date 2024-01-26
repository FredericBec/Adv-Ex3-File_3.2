package fr.fms.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Order {

	private int orderNumber;
	private ArrayList<String> dishesList = new ArrayList<String>();
	private LocalDateTime date;
	private Person customer;

	public Order(int orderNumber, ArrayList<String> dishesList, LocalDateTime date) {
		this.orderNumber = orderNumber;
		this.dishesList = dishesList;
		this.date = date;
	}
	
	public Order(int orderNumber, ArrayList<String> dishesList, LocalDateTime date, Person customer) {
		this.orderNumber = orderNumber;
		this.dishesList = dishesList;
		this.date = date;
		this.customer = customer;
	}
	
	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public ArrayList<String> getDishesList() {
		return dishesList;
	}

	public void setDishesList(ArrayList<String> dishesList) {
		this.dishesList = dishesList;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public Person getCustomer() {
		return customer;
	}

	public void setCustomer(Person customer) {
		this.customer = customer;
	}

	public void addDishes() {
		
	}

	@Override
	public String toString() {
		return "Order [dishesList=" + dishesList + "]";
	}
}
