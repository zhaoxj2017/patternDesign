package com.structural.filter;

public class Person {
	private String name;
	private String sex;
	private String marriage;

	public Person(String name, String sex, String marriage) {
		this.name = name;
		this.sex = sex;
		this.marriage = marriage;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getMarriage() {
		return marriage;
	}
	public void setMarriage(String marriage) {
		this.marriage = marriage;
	}
	
	@Override
	public String toString() {
		return "name : " + name + " sex : " + sex + " marriage : " + marriage; 
	}
}
