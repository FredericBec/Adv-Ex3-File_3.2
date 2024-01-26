package fr.fms.entities;

import java.util.ArrayList;

public class MenuItem {

	private String type;
	private ArrayList<String> menuItemList = new ArrayList<String>();
	private Menu menu;
	
	public MenuItem(String type, ArrayList<String> menuItemList) {
		this.type = type;
		this.menuItemList = menuItemList;
	}

	public MenuItem(String type, ArrayList<String> menuItemList, Menu menu) {
		this.type = type;
		this.menuItemList = menuItemList;
		this.menu = menu;
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
	
	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public void addMenuItem() {
		
		
	}

	@Override
	public String toString() {
		return "MenuItem [type=" + type + ", menuItemList=" + menuItemList + "]";
	}
}
