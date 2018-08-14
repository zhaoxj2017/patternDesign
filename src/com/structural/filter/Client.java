package com.structural.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author 赵兴君_F
 * 过滤器模式
 * 意图：过滤掉或者筛选出列表中的属性
 * 过程：对一个列表的对象的各个维度进行筛选。
 * 特征：维护一个列表
 * 应用场景：1、制定规则，过滤不符合规则的结果
 * 					   2、黑白名单
 *					   3、IP禁用名单等
 *                    4、对批量订单进行筛选，过滤
 *  优点：对每个维度单独维护，符合开发的封闭原则
 *  缺点：每一个维度的过滤规则都需要创建一个类，需要很多次的遍历列表；不如把条件设置好之后，一次性过滤；
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      List<Person> persons = new ArrayList<Person>();
	      
	      persons.add(new Person("Robert","Male", "Single"));
	      persons.add(new Person("John","Male", "Married"));
	      persons.add(new Person("Laura","Female", "Married"));
	      persons.add(new Person("Diana","Female", "Single"));
	      persons.add(new Person("Mike","Male", "Single"));
	      persons.add(new Person("Bobby","Male", "Single"));
	      
	      // 设置过滤条件
	      ArrayList<Filter> filters = new ArrayList<>();
	      filters.add(new FilterMale());
	      filters.add(new FilterSingle());
	      
	      // 过滤
	      Filter singleMale = new AndFilter(filters);
	      Filter maleOrSingle = new OrFilter(filters);
	      
	      System.out.println("SingleDog:\n" + listToString(singleMale.meetFilter(persons)));
	      System.out.println("maleOrSingle:\n" + listToString(maleOrSingle.meetFilter(persons)));
	}
	
	private static String listToString(List<Person> list) {
		StringBuilder sb = new StringBuilder();
		for (Person person : list) {
			sb.append(person.toString());
			sb.append('\n');
		}
		return sb.toString();
	}

}
