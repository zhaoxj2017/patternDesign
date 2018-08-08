package com.creator.factory_abstract;

/**
 * 
 * @author ���˾�_F 
 * ���󹤳��� ���󹤳����Կ����Ƕ���򵥹�������ϡ�
 *                     Ҳ�ɸ��ӻ�����ɶ��������������ϡ�  ��֮Ϊ�����������ϡ�
 * ��ͼ���ṩһ������һϵ����ػ��໥�����Ķ���Ľӿڣ��������ƶ�������
 * 			   ͬһ���Ʒ����Ҫ���в�ͬ�ļӹ���
 * ������1 ���󹤳��У���һ�����������������ķ�����
 *            2 ���󹤳��ɶ�������̳�
 * Ӧ�ó�����
 * 		1��ͬһ���Ʒ���Ե���ͬ����ȥ�ӹ����ӹ��Ľ����һ����
 * 			  ͬʱ��һ����Ʒ���Է�Ϊ�ܶ�ģ�飬ģ�黯�ӹ���Ȼ����ϳ�һ������
 * 		2��������ͬ����ϵͳ�ĳ���һ����Ʒ�����ڲ�ͬƽ̨�����С�
 * 	    3��֧����С������װ��һ���׵Ļ���
 * ע�������չ��Ʒ���ѣ���Ҫ��ÿһ�๤��������һ�ײ�Ʒ�ķ�����ʵ���ࡣ
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
