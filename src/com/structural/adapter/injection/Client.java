package com.structural.adapter.injection;

/**
 *  
 * @author 赵兴君_F
 * 适配器模式
 * 通过注入的方式实现适配器
 * 注入：在创建对象A之前，将已经创建的对象B注入到A中。此例为构造器传参的方式注入。
 * 应用场景见继承方式
 */
public class Client {
	public static void main(String[] args) {
		// 注入 Ps2er
		USB usb = new Adapter(new Ps2er());
		usb.isUsb();      // 输出 I am ps2
	}
}
