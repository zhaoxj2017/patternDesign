package com.creator.factory_simple;

/**
 * 
 * @author ���˾�_F
 *	�򵥹���ģʽ
 * ��ͼ���ɹ�������ʵ����ʵ���࣬�ɽӿڲ�������Ķ���
 * ������
 * 	       1���򵥹�����Ҫnew�������󣬷Ǿ�̬�������Ƶ���������󣬿��þ�̬������һ�㹤���Ǿ�̬
 *        2���򵥹����д���switch
 *        3���򵥹������ݿͻ���������������������ʵ����һ��
 * ������
 *       ���ݶ������;���ʵ����ĳһ����ʱ���������ģʽ����ʹ�ã����籾���ӡ�
 *  ע�����
 *       ����һ�����Ӷ�����ã��򵥶���Ͳ����ˡ�
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
