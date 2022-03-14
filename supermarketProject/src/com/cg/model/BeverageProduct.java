package com.cg.model;

public class BeverageProduct extends GroceryProduct implements Drinkable{
	
	private SugarLevel SugarLevel;
	
	public BeverageProduct(String name, double price, double discount, SugarLevel SugarLevel) {
		super(name, price, discount);
		this.SugarLevel= SugarLevel;
		// TODO Auto-generated constructor stub
	}

	public SugarLevel getSugarLevel() {
		return SugarLevel;
	}

	public void setSugarLevel(SugarLevel sugarLevel) {
		SugarLevel = sugarLevel;
	}

	public String toString() {
		return super.toString() + "Sugar Level: " + SugarLevel;
	}

	@Override
	public boolean isHealthy() {
		return SugarLevel != SugarLevel.ADDED_SUGAR;
	}

}
