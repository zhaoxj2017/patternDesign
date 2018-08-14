package com.creator.builder;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author 赵兴君_F
 * Meal 类为主体，最终生成的对象
 */
public class Meal {
	private List<Item> items = new ArrayList<Item>();
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public float getCost() {
		float cost = 0f;
		for (Item item : items) {
			cost += item.price();
			StringBuilder sb = new StringBuilder();
		}
		return cost;
	}
	
	public void showItems() {
		for (Item item : items) {
			System.out.print("name:" + item.name()+" | ");
			System.out.print("packing:" + item.packing().pack()+" | ");
			System.out.println("price:" + item.price());
			System.out.println("----------------------------------------------------------");
		}
	}
}
