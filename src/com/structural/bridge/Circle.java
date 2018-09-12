package com.structural.bridge;

public class Circle extends AbstractShape {
    @Override
    public void draw() {
        super.draw();
        System.out.println("Circle");
    }
}
