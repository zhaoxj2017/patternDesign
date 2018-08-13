package com.structural.filter;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractFilter implements Filter {

	@Override
	public List<Person> meetFilter(List<Person> persons) {
		// TODO Auto-generated method stub
		return null;
	}
	
	List<Person> removeSex(List<Person> persons, String condition) {
		List<Person> list = new ArrayList<Person>();
		for (Person person: persons) {
			if (person.getSex().equals(condition)) {
				list.add(person);
			}
		}
		return list;
	}

	List<Person> removeMarriage(List<Person> persons, String condition) {
		List<Person> list = new ArrayList<Person>();
		for (Person person: persons) {
			if (person.getMarriage().equals(condition)) {
				list.add(person);
			}
		}
		return list;
	}	
}
