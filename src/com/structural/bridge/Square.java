package com.structural.bridge;

public class Square extends AbstractShape {
    @Override
    public void draw() {
        super.draw();
        System.out.println("Square");
    }
}
