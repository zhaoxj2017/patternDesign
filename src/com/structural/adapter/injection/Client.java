package com.structural.adapter.injection;

/**
 *  
 * @author ���˾�_F
 * ������ģʽ
 * ͨ��ע��ķ�ʽʵ��������
 * ע�룺�ڴ�������A֮ǰ�����Ѿ������Ķ���Bע�뵽A�С�����Ϊ���������εķ�ʽע�롣
 * Ӧ�ó������̳з�ʽ
 */
public class Client {
	public static void main(String[] args) {
		// ע�� Ps2er
		USB usb = new Adapter(new Ps2er());
		usb.isUsb();      // ��� I am ps2
	}
}
