package fr.fms.test;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import fr.fms.entities.Bill;
import fr.fms.entities.Customer;
import fr.fms.entities.Menu;
import fr.fms.entities.MenuItem;

public class TestResto {
	
	private static final ArrayList<String> starter = new ArrayList<String>();
	private static final ArrayList<String> dish = new ArrayList<String>();
	private static final ArrayList<String> sideDish = new ArrayList<String>();
	private static final ArrayList<String> drink = new ArrayList<String>();
	private static final ArrayList<String> dessert = new ArrayList<String>();

	public static void main(String[] args) {
		init();
		MenuItem starters = new MenuItem("Entrées", starter);
		MenuItem dishes = new MenuItem("Plats", dish);
		MenuItem sideDishes = new MenuItem("Accompagnements", sideDish);
		MenuItem drinks = new MenuItem("Boissons", drink);
		MenuItem desserts = new MenuItem("Desserts", dessert);
		
		Scanner scan = new Scanner(System.in);
		Customer newCustomer = new Customer();
		try {
			System.out.println("Quel est votre nom :");
			newCustomer.setName(scan.nextLine());
		}catch(InputMismatchException e) {
			System.out.println("Erreur de frappe :" +e.getMessage());
		}
		System.out.println("Quel est votre prénom :");
		newCustomer.setFirstName(scan.nextLine());
		System.out.println("Combien de menus voulez-vous ?");
		int nbrOrder = scan.nextInt();
		
		for(int i = 0; i < nbrOrder; i++) {
			Menu newMenu = new Menu();
			ArrayList<String> menuList = new ArrayList<String>();
			menuList.add(newMenu.composeMenu(scan, starter, starters.getType()));
			menuList.add(newMenu.composeMenu(scan, dish, dishes.getType()));
			menuList.add(newMenu.composeMenu(scan, sideDish, sideDishes.getType()));
			menuList.add(newMenu.composeMenu(scan, drink, drinks.getType()));
			menuList.add(newMenu.composeMenu(scan, dessert, desserts.getType()));

			newMenu.setName(newCustomer.getName());
			newMenu.setMenuItemList(menuList);
			System.out.println(newMenu);
			
			//Bill newNote = new Bill((i+1), new Order());
		}
		
		scan.close();
	}
	
	//Initialisation du resto
	public static void init() {
		starter.add("Salade");
		starter.add("Soupe");
		starter.add("Quiche");
		starter.add("Aucune");
		
		dish.add("Poulet");
		dish.add("Steack");
		dish.add("Poisson");
		dish.add("Hamurger vegan");
		dish.add("Aucun");
		
		sideDish.add("Haricots verts");
		sideDish.add("Frites");
		sideDish.add("Carottes");
		sideDish.add("Pâtes");
		sideDish.add("Aucun");
		
		drink.add("Coca-cola");
		drink.add("Orangina");
		drink.add("Eau gazeuse");
		drink.add("Eau plate");
		drink.add("Thé à la menthe");
		drink.add("Aucune");
		
		dessert.add("Moelleux au chocolat");
		dessert.add("Flan");
		dessert.add("Cheesecake");
		dessert.add("Tarte au citron");
		dessert.add("Aucun");
	}

}
