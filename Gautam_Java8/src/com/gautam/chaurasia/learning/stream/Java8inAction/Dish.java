package com.gautam.chaurasia.learning.stream.Java8inAction;

public final class Dish {
	
	private final String name ;
	private final boolean vegetarian ;
	private final int calories ;
	private final Type type ;
	
	public Dish(String name, boolean vegetarian, int calories, Type type) {
		super();
		this.name = name;
		this.vegetarian = vegetarian;
		this.calories = calories;
		this.type = type;
	}
	
	

	public synchronized String getName() {
		return name;
	}



	public synchronized boolean isVegetarian() {
		return vegetarian;
	}



	public synchronized int getCalories() {
		return calories;
	}



	public synchronized Type getType() {
		return type;
	}



	
	
	@Override
	public String toString() {
		return "Dish [name=" + name + ", vegetarian=" + vegetarian + ", calories=" + calories + ", type=" + type + "]";
	}





	public enum Type {MEAT,FISH,OTHER}
	
	

	

}
