package com.structural.composite.catalog;

/**
 * @author 赵兴君_F
 */
public abstract class AbstractNode {
	protected String name;
	
	public AbstractNode(String name) {
		this.name = name;
	}
	
	public void addNode(AbstractNode abstractNode) throws Exception{
		throw new Exception("Invalied abstractNode");
	}
	
	public abstract void display();
}
