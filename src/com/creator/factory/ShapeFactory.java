package com.creator.factory;

public class ShapeFactory {
	public Shape getShape(String shapeType) {
		switch(shapeType) {
		case "rectangle":  return new Rectangle();
		case "circle": return new Circle();
		case "square": return new Square();
		default: return null;
		}
	}
}
