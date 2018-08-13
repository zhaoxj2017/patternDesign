package com.structural.composite.catalog;

public abstract class Node {
	protected String name;
	
	public Node(String name) {
		this.name = name;
	}
	
	public void addNode(Node node) throws Exception{
		throw new Exception("Invalied node");
	}
	
	public abstract void display();
}
