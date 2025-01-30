package com.gautam.chaurasia.learning.stream.Java8inAction;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.gautam.chaurasia.learning.stream.Java8inAction.Dish.Type;

public class TestDishStream {

	
	public static void main(String[] args) {
		
		
		List<Dish> menu= Arrays.asList(
				new Dish("OATS", true, 800, Type.OTHER),
				new Dish("CHAWAL DAL BHUJIYA", true, 1000, Type.OTHER),
				new Dish("Sorma", false, 600, Type.MEAT),
				new Dish("Eggs", false, 680, Type.FISH),
				new Dish("french fries", true, 530, Dish.Type.OTHER),
				new Dish("rice", true, 350, Dish.Type.OTHER),
				new Dish("season fruit", true, 120, Dish.Type.OTHER),
				new Dish("pizza", true, 550, Dish.Type.OTHER),
				new Dish("prawns", false, 300, Dish.Type.FISH),
				new Dish("pork", false, 800, Dish.Type.MEAT),
				new Dish("beef", false, 700, Dish.Type.MEAT),
				new Dish("chicken", false, 400, Dish.Type.MEAT),
				new Dish("salmon", false, 450, Dish.Type.FISH) 
				);
		
		// get the list having more than 300 calories 
		
		List<Dish> more300CalList =  menu.stream()
									.filter((d) -> {
										return d.getCalories() >300 ;
										})
									.collect(Collectors.toList()) ;
		
		more300CalList.forEach(System.out::println);
		
		more300CalList.stream().forEach(d -> System.out.println(d));
		more300CalList.stream().forEach(d -> System.out.println(d));
		
		//Filtering a menu using a streamtofindoutthreehigh-calorie dish names
		
		List<String> more300CalDishName = menu.stream()
											.filter(d ->  d.getCalories()>300 && !d.isVegetarian())
											.map((dish) -> dish.getName())
											.limit(3)
											.collect(Collectors.toList());
		
		System.out.println(more300CalDishName);
	}
}
