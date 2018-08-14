package com.structural.bridge;

public class Square extends Shape {
    @Override
    public void draw() {
        super.draw();
        System.out.println("Square");
    }
}
