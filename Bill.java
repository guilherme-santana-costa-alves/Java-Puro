package restaurante;

import java.util.ArrayList;

public class Bill {
	private ArrayList <String> orderedFood;
	private ArrayList <Integer> orderedQuantity;
	public Bill () {
		// ArrayLists created here
		orderedFood = new ArrayList <String> ();
		orderedQuantity = new ArrayList <Integer> ();
	}
	private double totalCost;
	public double getTotal () {
		return totalCost;
	}
	public void addOrder (String meal, int quantity, String[] dish, double[] cost) {
		orderedFood.add(meal);
		orderedQuantity.add(quantity);
		for (int i = 0; i < dish.length; i++) {
			if (meal.equals(dish[i])) {
				// totalCost is initialized to be zero
				// when a Bill instance is constructed
				totalCost += quantity * cost[i];
			}
		}
	}
	public void getOrder () {
		System.out.println("Your order:");
		System.out.println("----------");
		for (int i = 0; i < orderedFood.size(); i ++) {
			System.out.println(orderedQuantity.get(i)+ "x " + orderedFood.get(i));
		}
		System.out.println("----------");
	}
	
}
