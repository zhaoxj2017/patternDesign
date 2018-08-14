package com.creator.factory_abstract;

/**
 * 
 * @author 赵兴君_F 
 * 抽象工厂： 抽象工厂可以看成是多个简单工厂的组合。
 *                     也可复杂化，变成多个工厂方法的组合。  总之为多个工厂的组合。
 * 意图：提供一个创建一系列相关或相互依赖的对象的接口，而不需制定具体类
 * 			   同一类产品，需要进行不同的加工。
 * 特征：1 抽象工厂中，有一个至多个的生产对象的方法。
 *            2 抽象工厂由多个工厂继承
 * 应用场景：
 * 		1、同一类产品可以到不同工厂去加工，加工的结果不一样；
 * 			  同时，一个产品可以分为很多模块，模块化加工，然后组合成一个整体
 * 		2、生产不同操作系统的程序。一个产品可以在不同平台上运行。
 * 	    3、支付宝小鸡换套装，一整套的换。
 * 注意事项：拓展产品簇难，需要在每一类工厂里新增一套产品的方法和实现类。
 */
public class Client {
	public static void main(String[] args) {
		AbstractFactory alibaba = FactoryProducer.getFactory("alibaba");
		AbstractFactory tencent = FactoryProducer.getFactory("tencent");
		Shape aShape = alibaba.getShape("circle");
		Color aColor = alibaba.getColor("red");
		aShape.draw();
		aColor.fill();
		
		Shape tShape = tencent.getShape("square");
		Color tColor = tencent.getColor("blue");
		tShape.draw();
		tColor.fill();
	}
}
