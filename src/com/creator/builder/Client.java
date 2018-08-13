package com.creator.builder;

/**
 * 
 * @author ���˾�_F
 *	������ģʽ
 * ��ͼ:
 *        һ��һ���ش���һ�����Ӷ���Ϊ����̬�������Ժ͹��ܡ�
 *  ������
 *        1����һ����Ҫ�������������
 *        2����һ��Builder����������������������ܣ�
 *  Ӧ�ó�����
 *        1��StringBuilder
 *        2�����ݿ�-->�������ݱ��ʱ��TableBuilder�������е�ʱ��ColumnBuilder
 *        3�����Ƶ�͵ģ�������item��������һ��������ʱ��
 *   �ŵ㣺����չ�����ڿ��Ʒ���
 *   ȱ�㣺�ڲ���Ը���
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ͨ��Builder����һ������Ķ���
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
