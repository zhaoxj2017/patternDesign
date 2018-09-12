package com.structural.filter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author 赵兴君_F
 */
public class OrFilter extends AbstractFilter {
	Filter filter1;
	Filter filter2;
	List<Filter> filterList;
	
	public OrFilter(List<Filter> filterList) {
		this.filterList = filterList;
	}
	
	public OrFilter(Filter filter1, Filter filter2 ) {
		this.filter1= filter1;
		this.filter2 = filter2;
	}
	
	@Override
	public List<Person> meetFilter(List<Person> persons) {
		// TODO Auto-generated method stub
		ArrayList<Person> newList = new ArrayList<>();
		for (Filter filter: filterList) {
			newList.addAll(filter.meetFilter(persons));
		}
		return distinct3(newList);
	}

	/**
	 * 去重方式1
	 * @param list
	 * @return
	 */
	public List<Person> distinct(List<Person> list) {
		Set<Person> dis = new HashSet<>();
		List<Person> res = new ArrayList<>();
		for (Person o: list) {
			dis.add(o);
		}
		res.addAll(dis);
		return res;
	}

	/**
	 * 去重方式2 一行解决
	 * @param list
	 * @return
	 */
	public List<Person> distinct2(List<Person> list) {
		return new ArrayList<>(new HashSet<>(list));
	}

	/**
	 * 去重方式3 JDK1.8 新特性Stream
	 * @param list
	 * @return
	 */
	public List<Person> distinct3(List<Person> list) {
		return list.stream().distinct().collect(Collectors.toList());
	}
}
