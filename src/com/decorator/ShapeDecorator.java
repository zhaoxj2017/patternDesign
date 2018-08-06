package com.decorator;

public class ShapeDecorator implements Shape {

	protected Shape decoratedShape;
	
	public ShapeDecorator(Shape decoratedShape) {
		this.decoratedShape = decoratedShape;
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		decoratedShape.draw();
	}

}
