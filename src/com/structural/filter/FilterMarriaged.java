package com.structural.filter;

import java.util.List;

public class FilterMarriaged  extends AbstractFilter {

	@Override
	public List<Person> meetFilter(List<Person> persons) {
		// TODO Auto-generated method stub
		return removeMarriage(persons, "Marriaged");
	}

}
