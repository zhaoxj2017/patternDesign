package com.structural.decorator;

/**
 * 
 * @author ���˾�_F
 *	װ����ģʽ�ǲ��ı�����߼̳й�ϵ�ṹ�£���̬����չ���߳�������Ĺ��ܡ�
 * װ������һ��ṹ��ģʽ
 * �ؼ����� 1�� Component�䵱�����ɫ����Ӧ�þ���ʵ�֣���һ�����⣻
 * 					2�� Decorator ��һ��װ���ߣ���Ҫ��дComponent�еķ��������Կ�����һ�����ˣ���Componentװ�Ρ�
 * 					3�� Component�ľ����໹��װ���ߣ���Ҫʵ����ӿڡ�
 *  reference �� http://www.runoob.com/design-pattern/decorator-pattern.html
 */
public class Client {
	public static void main(String[] args) {
		Shape circle = new YellowShapeDecorator(new RedShapeDecorator(new Circle()));		
		circle.draw();
	}
}