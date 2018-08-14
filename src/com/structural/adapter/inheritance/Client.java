package com.structural.adapter.inheritance;

/**
 *  
 * @author 赵兴君_F
 * 适配器模式
 * 通过继承的方式实现适配器
 * 应用场景：
 * 		1、正在使用A接口时，发现有不能实现的方法在B接口中能实现，而A，B接口又不一样，但却不能影响A接口的使用。（替换接口中的方法）
 *     2、包装一个旧接口，使其与新功能接口适配。
 *     3、合并接口
 * 优点：能够适配不同的接口
 * 缺点：接口切换以后，丢失了接口原来的功能。可考虑合并。
 */
public class Client {
	public static void main(String[] args) {
		// Usb usb = new Usber(); 以下为切换接口，但是并不改变下面的使用。
		USB usb = new Adapter();
		usb.isUsb();      // 输出 I am ps2
	}
}
