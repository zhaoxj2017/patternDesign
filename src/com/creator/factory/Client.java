package com.creator.factory;

/**
 * 
 * @author 赵兴君_F
 *	工厂模式
 * 意图是由工厂决定实例化实现类，由接口操作具体的对象。
 * 特征：
 * 	       1，工厂需要new创建对象，非静态，如果是频繁创建对象，可用静态工厂。一般工厂非静态
 *        2，工厂中存在switch
 *        3，工厂根据客户端所传参数，决定具体实现哪一类
 * 场景：
 *       1，数据库访问，当用户不知道最后系统采用哪一类数据库，以及数据库可能有变化时
 *       2，日志记录器：记录可能记录到本地硬盘、系统事件、远程服务器等，用户可以选择记录日志到什么地方
 *       3，设计一个连接服务器的框架，需要三个协议，"POP3"、"IMAP"、"HTTP"，可以把这三个作为产品类，共同实现一个接口
 *       4，根据多种类型具体实例化某一类型时，可与策略模式搭配使用，例如本例子。
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
