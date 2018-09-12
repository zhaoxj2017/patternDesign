package com.creator.factory_method;

import com.creator.factory_method.impl.Rectangle;

public class RectangleFactory extends ShapeFactory{
	@Override
	public Shape createShape() {
		return new Rectangle();
	}
}
