package com.structural.filter;

import java.util.ArrayList;
import java.util.List;

public class AndFilter  extends AbstractFilter {
	Filter filter1;
	Filter filter2;
	List<Filter> filterList;
	
	public AndFilter(List<Filter> filterList) {
		this.filterList = filterList;
	}
	
	public AndFilter(Filter filter1, Filter filter2 ) {
		this.filter1= filter1;
		this.filter2 = filter2;
	}
	
	@Override
	public List<Person> meetFilter(List<Person> persons) {
		// TODO Auto-generated method stub
		// 浅复制list
		List<Person> list = new ArrayList<>(persons);
		for (Filter filter: filterList) {
			list = filter.meetFilter(list);
		}
		return list;
	}
}
