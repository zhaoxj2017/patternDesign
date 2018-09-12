package com.structural.composite.catalog;

import java.util.ArrayList;
import java.util.List;

public class Noder extends AbstractNode {
	private List<AbstractNode> abstractNodeList = new ArrayList<AbstractNode>();

	public Noder(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void addNode(AbstractNode abstractNode) {
		abstractNodeList.add(abstractNode);
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(name);
		for (AbstractNode abstractNode : abstractNodeList) {
			abstractNode.display();
		}
	}

}
