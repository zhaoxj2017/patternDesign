package com.structural.filter;

import java.util.List;

public class FilterMale extends AbstractFilter {

	@Override
	public List<Person> meetFilter(List<Person> persons) {
		// TODO Auto-generated method stub
		return removeSex(persons, "Male");
	}
}
