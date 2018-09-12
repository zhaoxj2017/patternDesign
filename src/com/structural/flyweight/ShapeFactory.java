package com.structural.flyweight;

import java.util.HashMap;

/**
 * @author 赵兴君_F
 */
public class ShapeFactory {
    private static HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getShape(String color) {
        Shape circle = circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Created circle of color " + color);
        }
        return circle;
    }
}
