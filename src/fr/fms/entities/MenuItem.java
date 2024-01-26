package fr.fms.entities;

import java.util.ArrayList;

public class MenuItem {

	private String type;
	private ArrayList<String> menuItemList = new ArrayList<String>();
	private Order order;
	
	public MenuItem(String type, ArrayList<String> menuItemList, Order order) {
		this.type = type;
		this.menuItemList = menuItemList;
		this.order = order;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public ArrayList<String> getMenuItemList() {
		return menuItemList;
	}

	public void setMenuItemList(ArrayList<String> menuItemList) {
		this.menuItemList = menuItemList;
	}
	
	public void addMenuItem() {
		
	}

	@Override
	public String toString() {
		return "MenuItem [type=" + type + ", menuItemList=" + menuItemList + "]";
	}
}
