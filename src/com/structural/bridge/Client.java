package com.structural.bridge;

/**
 * 桥接模式
 * 意图：将抽象部分与实现部分分离，将一个对象分为多种维度，每一维度独立变化。各维度组合形成对象。
 *      将继承关系变为关联关系
 * 特征：
 *      1、n*..*n （多对多）的关联关系
 *      2、多个角度
 * 优点：1、桥接模式提供比继承方式更多的组合方式而只需要写更少的类
 *      2、拓展能力较为优秀
 * 缺点：1、增加系统的理解和设计难度
 *      2、新增维度的时候需要修改抽象方法。
 * 应用场景：
 *      1、遇到继承的时候，会产生大量的类，有很多组合的情况，但是能够抽象出常量个维度的。
 *      2、需要在构建的抽象角度与实现角色之间增加更多的灵活性，避免两个类建立静态继承关系，可通过桥接模式建立一个关联关系。
 */
public class Client {
    public static void main(String[] args) {
        // draw a red circle
        AbstractShape circle = new Circle();
        circle.setColor(new Red());
        circle.draw();

        // change to blue
        circle.setColor(new Blue());
        circle.draw();
    }
}
