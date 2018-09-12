package com.creator.factory_method;

import com.creator.factory_method.impl.Circle;

/**
 * @author 赵兴君_F
 */
public class CircleFactory extends ShapeFactory {
	@Override
	public Shape createShape() {
		return new Circle();
	}
}
