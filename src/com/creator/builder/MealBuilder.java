package com.creator.builder;

import com.creator.builder.items.ChickenAbstractBurger;
import com.creator.builder.items.Coco;
import com.creator.builder.items.Pepsi;
import com.creator.builder.items.VegAbstractBurger;

/**
 * @author 赵兴君_F
 */
public class MealBuilder {
	Meal meal;
	
	public MealBuilder() {
		this.meal = new Meal();
	}

	/**
	 * 可通过工厂方法去优化
 	 */
	public MealBuilder addItem(String name) {
		switch (name) {
		case "chickenburger": 
			meal.addItem(new ChickenAbstractBurger());
			break;
		case "vegburger": 
			meal.addItem(new VegAbstractBurger());
			break;
		case "coco": 
			meal.addItem(new Coco());
			break;
		case "pepsi": 
			meal.addItem(new Pepsi());
			break;
		default:
		}
		return this;
	}

	/**
	 * ----------------------------------set food-----------------------------------
	 * @return
	 */
	public Meal prepareVegMeal() {
		meal.addItem(new VegAbstractBurger());
		meal.addItem(new Coco());
		return meal;
	}
	
	public Meal prepareNonMeal() {
		meal.addItem(new ChickenAbstractBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}
