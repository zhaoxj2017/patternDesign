package com.creator.factory_abstract.alibaba_factory;

import com.creator.factory_abstract.AbstractFactory;
import com.creator.factory_abstract.Color;
import com.creator.factory_abstract.Shape;

public class AlibabaFactory extends AbstractFactory {
	public Color getColor(String type) {
		switch (type) {
		case "red":
			return new Red();
		case "blue":
			return new Blue();
		case "yellow":
			return new Yellow();
		default:
			return null;
		}
	}

	@Override
	public Shape getShape(String type) {
		// TODO Auto-generated method stub
		switch (type) {
		case "circle":
			return new Circle();
		case "rectangle":
			return new Rectangle();
		case "square":
			return new Square();
		default:
			return null;
		}
	}
}
