package com.structural.bridge;

public class Circle extends Shape {
    @Override
    public void draw() {
        super.draw();
        System.out.println("Circle");
    }
}
