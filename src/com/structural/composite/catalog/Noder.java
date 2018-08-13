package com.structural.composite.catalog;

import java.util.ArrayList;
import java.util.List;

public class Noder extends Node {
	private List<Node> nodeList = new ArrayList<Node>();

	public Noder(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void addNode(Node node) {
		nodeList.add(node);
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(name);
		for (Node node: nodeList) {
			node.display();
		}
	}

}
