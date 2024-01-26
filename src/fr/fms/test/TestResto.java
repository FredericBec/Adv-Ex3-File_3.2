package fr.fms.test;

import java.util.ArrayList;

import fr.fms.entities.MenuItem;

public class TestResto {
	
	private static final ArrayList<String> starter = new ArrayList<String>();
	private static final ArrayList<String> dish = new ArrayList<String>();
	private static final ArrayList<String> sideDish = new ArrayList<String>();
	private static final ArrayList<String> drink = new ArrayList<String>();
	private static final ArrayList<String> dessert = new ArrayList<String>();

	public static void main(String[] args) {
		init();
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
		
		MenuItem starters = new MenuItem("Entrées", starter);
		MenuItem dishes = new MenuItem("Plats", dish);
		MenuItem sideDishes = new MenuItem("Accompagnements", sideDish);
		MenuItem drinks = new MenuItem("Boissons", drink);
		MenuItem desserts = new MenuItem("Desserts", dessert);
		
		System.out.println(starters);
		System.out.println(dishes);
		System.out.println(sideDishes);
		System.out.println(drinks);
		System.out.println(desserts);
	}

}
