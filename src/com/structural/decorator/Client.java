package com.structural.decorator;

/**
 * 装饰者模式
 * 装饰者模式是不改变类或者继承关系结构下，动态的扩展或者撤销对象的功能。
 * 装饰者是一类结构型模式
 * 特征：
 *     1...n 的关系，一个对象进行多种修饰。
 * 关键代码
 * 	   1： Component充当抽象角色，不应该具体实现，是一个主题；
 * 	   2： Decorator 是一个装饰者，主要重写Component中的方法，可以看做是一个仆人，给Component装饰。
 * 	   3： Component的具体类还是装饰者，都要实现其接口。
 *     reference ： http://www.runoob.com/design-pattern/decorator-pattern.html
 * 应用场景：
 *     1、java.util.io
 */
public class Client {
	public static void main(String[] args) {
		Shape circle = new YellowShapeDecorator(new RedShapeDecorator(new Circle()));		
		circle.draw();
	}
}