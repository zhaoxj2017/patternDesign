package com.structural.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author ���˾�_F
 * ������ģʽ
 * ��ͼ�����˵�����ɸѡ���б��е�����
 * ���̣���һ���б�Ķ���ĸ���ά�Ƚ���ɸѡ��
 * ������ά��һ���б�
 * Ӧ�ó�����1���ƶ����򣬹��˲����Ϲ���Ľ��
 * 					   2���ڰ�����
 *					   3��IP����������
 *                    4����������������ɸѡ������
 *  �ŵ㣺��ÿ��ά�ȵ���ά�������Ͽ����ķ��ԭ��
 *  ȱ�㣺ÿһ��ά�ȵĹ��˹�����Ҫ����һ���࣬��Ҫ�ܶ�εı����б�������������ú�֮��һ���Թ��ˣ�
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
	      
	      // ���ù�������
	      ArrayList<Filter> filters = new ArrayList<>();
	      filters.add(new FilterMale());
	      filters.add(new FilterSingle());
	      
	      // ����
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
