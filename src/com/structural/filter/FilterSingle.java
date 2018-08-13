package com.structural.filter;

import java.util.List;

public class FilterSingle extends AbstractFilter {

	@Override
	public List<Person> meetFilter(List<Person> persons) {
		// TODO Auto-generated method stub
		return removeMarriage(persons, "Single");
	}

}
