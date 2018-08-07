package com.creator.factory_method;

/**
 * 
 * @author 赵兴君_F
 *	工厂方法模式
 * 意图是由工厂决定实例化实现类，由接口操作具体的对象。
 * 特征：
 * 	       1，工厂需要new创建对象，为一个类型创建一个工厂，由工厂具体具体实例化对象。
 *        2，可以提供静态工具类，获取工厂对象。
 * 场景：
 *       1，数据库访问，当用户不知道最后系统采用哪一类数据库，以及数据库可能有变化时
 *       2，日志记录器：记录可能记录到本地硬盘、系统事件、远程服务器等，用户可以选择记录日志到什么地方
 *       3，设计一个连接服务器的框架，需要三个协议，"POP3"、"IMAP"、"HTTP"，可以把这三个作为产品类，共同实现一个接口
 *       4，线程池，ScheduleThreadPool,FixThreadPool, CacheThreadPool。
 *  注意事项：
 *       创建一个复杂对象可用，简单对象就不用了。 
 */
public class Client {
	public static void main(String[] args) {
			ShapeFactory circleFactory = new CircleFactory();
			Shape shape = circleFactory.createShape();
			shape.draw();
			
			ShapeFactory rectangleFactory = new RectangleFactory();
			Shape shape2 = rectangleFactory.createShape();
			shape2.draw();
	}
}
