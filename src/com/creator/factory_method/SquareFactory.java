package com.creator.factory_method;

import com.creator.factory_method.impl.Square;

public class SquareFactory extends ShapeFactory{
	public Shape createShape() {
		return new Square();
	}
}
