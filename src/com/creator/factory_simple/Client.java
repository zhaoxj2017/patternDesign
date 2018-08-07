package com.creator.factory_simple;

/**
 * 
 * @author 赵兴君_F
 *	简单工厂模式
 * 意图是由工厂决定实例化实现类，由接口操作具体的对象。
 * 特征：
 * 	       1，简单工厂需要new创建对象，非静态，如果是频繁创建对象，可用静态工厂。一般工厂非静态
 *        2，简单工厂中存在switch
 *        3，简单工厂根据客户端所传参数，决定具体实现哪一类
 * 场景：
 *       根据多种类型具体实例化某一类型时，可与策略模式搭配使用，例如本例子。
 *  注意事项：
 *       创建一个复杂对象可用，简单对象就不用了。
 */
public class Client {
	public static void main(String[] args) {
			ShapeFactory factory = new ShapeFactory();
			Shape shape = factory.getShape("rectangle");
			shape.draw();
			shape = factory.getShape("circle");
			shape.draw();
	}
}
