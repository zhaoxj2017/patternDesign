package com.structural.decorator;

/**
 * 
 * @author 赵兴君_F
 *	装饰者模式是不改变类或者继承关系结构下，动态的扩展或者撤销对象的功能。
 * 装饰者是一类结构型模式
 * 关键代码 1： Component充当抽象角色，不应该具体实现，是一个主题；
 * 					2： Decorator 是一个装饰者，主要重写Component中的方法，可以看做是一个仆人，给Component装饰。
 * 					3： Component的具体类还是装饰者，都要实现其接口。
 *  reference ： http://www.runoob.com/design-pattern/decorator-pattern.html
 */
public class Client {
	public static void main(String[] args) {
		Shape circle = new YellowShapeDecorator(new RedShapeDecorator(new Circle()));		
		circle.draw();
	}
}