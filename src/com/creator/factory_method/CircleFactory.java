package com.creator.factory_method;

public class CircleFactory extends ShapeFactory {
	public Shape createShape() {
		return new Circle();
	}
}
