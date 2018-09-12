package com.creator.factory_method;

import com.creator.factory_method.impl.Square;

public class SquareFactory extends ShapeFactory{
	@Override
	public Shape createShape() {
		return new Square();
	}
}
