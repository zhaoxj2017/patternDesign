package com.creator.factory_abstract.tencent_factory;

import com.creator.factory_abstract.AbstractFactory;
import com.creator.factory_abstract.Color;
import com.creator.factory_abstract.Shape;

public class TencentFactory extends AbstractFactory {
	@Override
	public Color getColor(String type) {
		String RED = "red";
        String BLUE = "blue";
        String YELLOW = "yellow";

		if (RED.equals(type)) {
			return new Red();
		} else if (BLUE.equals(type)) {
			return new Blue();
		} else if (YELLOW.equals(type)) {
			return new Yellow();
		} else {
			return null;
		}
	}

	@Override
	public Shape getShape(String type) {
		// TODO Auto-generated method stub
        if ("circle".equals(type)) {
            return new Circle();
        } else if ("rectangle".equals(type)) {
            return new Rectangle();
        } else if ("square".equals(type)) {
            return new Square();
        } else {
            return null;
        }
	}
}
