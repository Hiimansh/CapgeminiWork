package com.cg.model;

public class Cart {
	
	public static void main(String[] args) {
		BeverageProduct Sprite = new BeverageProduct("Sprite", 2.8, 10, SugarLevel.LIGHT);
		BeverageProduct Cola = new BeverageProduct("Cola", 4, 0, SugarLevel.ADDED_SUGAR);
		
		DairyProduct Yogurt = new DairyProduct("Yogurt", 5.5, 15, Fat.SKIMMED);
		DairyProduct Juhayna = new DairyProduct("Juhayna", 5, 25, Fat.FULLCREAM);
		
		System.out.println(Sprite.isHealthy());
		System.out.println(Cola.isHealthy());
		
		System.out.println(Sprite.getActualPrice());
		System.out.println(Cola.getActualPrice());
		System.out.println(Yogurt.getActualPrice());
		System.out.println(Juhayna.getActualPrice());
		
		System.out.println(Sprite);
		System.out.println(Cola);
		System.out.println(Yogurt);
		System.out.println(Juhayna);
		
	}

}
