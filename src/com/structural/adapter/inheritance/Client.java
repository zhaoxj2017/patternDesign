package com.structural.adapter.inheritance;

/**
 *  
 * @author ���˾�_F
 * ������ģʽ
 * ͨ���̳еķ�ʽʵ��������
 * Ӧ�ó�����
 * 		1������ʹ��A�ӿ�ʱ�������в���ʵ�ֵķ�����B�ӿ�����ʵ�֣���A��B�ӿ��ֲ�һ������ȴ����Ӱ��A�ӿڵ�ʹ�á����滻�ӿ��еķ�����
 *     2����װһ���ɽӿڣ�ʹ�����¹��ܽӿ����䡣
 *     3���ϲ��ӿ�
 * �ŵ㣺�ܹ����䲻ͬ�Ľӿ�
 * ȱ�㣺�ӿ��л��Ժ󣬶�ʧ�˽ӿ�ԭ���Ĺ��ܡ��ɿ��Ǻϲ���
 */
public class Client {
	public static void main(String[] args) {
		// Usb usb = new Usber(); ����Ϊ�л��ӿڣ����ǲ����ı������ʹ�á�
		USB usb = new Adapter();
		usb.isUsb();      // ��� I am ps2
	}
}
