package com.creator.factory_abstract;


public abstract class AbstractFactory {
	public abstract Shape getShape(String type);
	public abstract Color getColor(String type);
}
