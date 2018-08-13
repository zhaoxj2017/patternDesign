package com.creator.builder;

/**
 * 
 * @author 赵兴君_F
 *	建造者模式
 * 意图:
 *        一步一步地创建一个复杂对象，为对象动态新增属性和功能。
 *  特征：
 *        1、有一个需要创建的主题对象
 *        2、有一个Builder，反复给主题对象新增功能；
 *  应用场景：
 *        1、StringBuilder
 *        2、数据库-->创建数据表的时候，TableBuilder，创建列的时候，ColumnBuilder
 *        3、类似点餐的，灵活添加item对象，生产一个订单的时候。
 *   优点：易拓展，便于控制风险
 *   缺点：内部相对复杂
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 通过Builder创建一个负责的对象。
		MealBuilder customBuilder = new MealBuilder();
		Meal customMeal = customBuilder.addItem("chickenburger")
																		.addItem("pepsi")
																		.addItem("coco").meal;
		customMeal.showItems();
		System.out.println("total cost:" + customMeal.getCost());
		System.out.println("################################");
		
		MealBuilder builder = new MealBuilder();
		Meal veg = builder.prepareVegMeal();
		veg.showItems();
		System.out.println("total cost:" + veg.getCost());
		System.out.println("################################");
		
		MealBuilder builder2 = new MealBuilder();
		Meal non = builder2.prepareNonMeal();
		non.showItems();
		System.out.println("total cost:" + non.getCost());
		System.out.println("################################");
		
	}

}
