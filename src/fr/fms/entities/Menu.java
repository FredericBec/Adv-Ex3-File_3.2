package fr.fms.entities;

import java.util.ArrayList;

public class Menu {

	private String name;
	private Order order;
	private ArrayList<String> menuItemList = new ArrayList<String>();

	public Menu(String name, Order order, ArrayList<String> menuItemList) {
		this.name = name;
		this.order = order;
		this.menuItemList = menuItemList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void composeMenu() {
		
	}

	@Override
	public String toString() {
		return "Menu [name=" + name + "]";
	}
}
