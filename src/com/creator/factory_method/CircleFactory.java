package com.creator.factory_method;

import com.creator.factory_method.impl.Circle;

public class CircleFactory extends ShapeFactory {
	public Shape createShape() {
		return new Circle();
	}
}
