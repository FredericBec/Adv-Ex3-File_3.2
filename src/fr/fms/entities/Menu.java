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
	
	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public ArrayList<String> getMenuItemList() {
		return menuItemList;
	}

	public void setMenuItemList(ArrayList<String> menuItemList) {
		this.menuItemList = menuItemList;
	}

	public void composeMenu(ArrayList<String> menuItemList) {
		setMenuItemList(menuItemList);
	}

	@Override
	public String toString() {
		return "Menu [name=" + name + "]";
	}
}
