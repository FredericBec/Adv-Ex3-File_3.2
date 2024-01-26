package fr.fms.entities;

import java.util.ArrayList;

public class Order {

	private ArrayList<String> dishesList = new ArrayList<String>();
	private Person customer;

	public Order(ArrayList<String> dishesList) {
		this.dishesList = dishesList;
	}
	
	public Order(ArrayList<String> dishesList, Person customer) {
		this.dishesList = dishesList;
		this.customer = customer;
	}

	public ArrayList<String> getDishesList() {
		return dishesList;
	}

	public void setDishesList(ArrayList<String> dishesList) {
		this.dishesList = dishesList;
	}
	
	public void addDishes() {
		
	}

	@Override
	public String toString() {
		return "Order [dishesList=" + dishesList + "]";
	}
}
