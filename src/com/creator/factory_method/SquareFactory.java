package com.creator.factory_method;

public class SquareFactory extends ShapeFactory{
	public Shape createShape() {
		return new Square();
	}
}
