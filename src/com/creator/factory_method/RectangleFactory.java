package com.creator.factory_method;

public class RectangleFactory extends ShapeFactory{
	public Shape createShape() {
		return new Rectangle();
	}
}
