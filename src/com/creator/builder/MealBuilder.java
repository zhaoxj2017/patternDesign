package com.creator.builder;

import com.creator.builder.items.ChickenBurger;
import com.creator.builder.items.Coco;
import com.creator.builder.items.Pepsi;
import com.creator.builder.items.VegBurger;

public class MealBuilder {  // 创建者对象
	Meal meal;		// 建造者需要创建的对象
	
	public MealBuilder() {
		this.meal = new Meal();
	}
	
	// 可通过工厂方法去优化
	public MealBuilder addItem(String name) {
		switch (name) {
		case "chickenburger": 
			meal.addItem(new ChickenBurger());
		case "vegburger": 
			meal.addItem(new VegBurger());
		case "coco": 
			meal.addItem(new Coco());
		case "pepsi": 
			meal.addItem(new Pepsi());
		}
		return this;
	}
	
	/*----------------------------------set food-----------------------------------*/
	public Meal prepareVegMeal() {
		meal.addItem(new VegBurger());
		meal.addItem(new Coco());
		return meal;
	}
	
	public Meal prepareNonMeal() {
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}
