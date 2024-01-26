package fr.fms.entities;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

	private String name;
	private Order order;
	private ArrayList<String> menuItemList = new ArrayList<String>();

	public Menu(String name, Order order, ArrayList<String> menuItemList) {
		this.name = name;
		this.order = order;
		this.menuItemList = menuItemList;
	}
	
	public Menu(String name, ArrayList<String> menuItemList) {
		this.name = name;
		this.menuItemList = menuItemList;
	}
	
	public Menu() {
		this.name = "uknown";
		this.order = null;
		this.menuItemList = null;
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

	public String composeMenu(Scanner scan, ArrayList<String> menuItemList, String menuItem) {
		int maxChoice = this.displayMenuItemList(menuItemList);
		System.out.println("Que souhaitez vous comme " + menuItem.toLowerCase() + ":");
		int starterChoice = 0;
		while(starterChoice < 1 || starterChoice > maxChoice) {
			
			starterChoice = scan.nextInt();
		}
		return menuItemList.get(starterChoice);
	}
	
	public int displayMenuItemList(ArrayList<String> menuItemList) {
		for(int i = 0; i < menuItemList.size(); i++) {
			System.out.print("[" + i + " - " + menuItemList.get(i) + "]");
		}
		System.out.println();
		return menuItemList.size();
	}

	@Override
	public String toString() {
		return "Menu :" + name + " " + menuItemList;
	}
}
