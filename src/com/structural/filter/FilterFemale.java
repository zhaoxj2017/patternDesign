package com.structural.filter;

import java.util.List;

public class FilterFemale extends AbstractFilter {

	@Override
	public List<Person> meetFilter(List<Person> persons) {
		// TODO Auto-generated method stub
		return removeSex(persons, "Female");
	}
}
