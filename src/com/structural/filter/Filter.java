package com.structural.filter;

import java.util.List;

public interface Filter {
	public List<Person> meetFilter(List<Person> persons);
}
