package com.structural.decorator;

public class YellowShapeDecorator extends ShapeDecorator {

	public YellowShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
		// TODO Auto-generated constructor stub
	}

	public void draw() {
		decoratedShape.draw();
		setYellowBody(decoratedShape);
	}
	private void setYellowBody(Shape decoratedShape) {
		System.out.println("Body is yellow");
	}
}
