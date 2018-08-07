package com.creator.factory_method;

/**
 * 
 * @author ���˾�_F
 *	��������ģʽ
 * ��ͼ���ɹ�������ʵ����ʵ���࣬�ɽӿڲ�������Ķ���
 * ������
 * 	       1��������Ҫnew��������Ϊһ�����ʹ���һ���������ɹ����������ʵ��������
 *        2�������ṩ��̬�����࣬��ȡ��������
 * ������
 *       1�����ݿ���ʣ����û���֪�����ϵͳ������һ�����ݿ⣬�Լ����ݿ�����б仯ʱ
 *       2����־��¼������¼���ܼ�¼������Ӳ�̡�ϵͳ�¼���Զ�̷������ȣ��û�����ѡ���¼��־��ʲô�ط�
 *       3�����һ�����ӷ������Ŀ�ܣ���Ҫ����Э�飬"POP3"��"IMAP"��"HTTP"�����԰���������Ϊ��Ʒ�࣬��ͬʵ��һ���ӿ�
 *       4���̳߳أ�ScheduleThreadPool,FixThreadPool, CacheThreadPool��
 *  ע�����
 *       ����һ�����Ӷ�����ã��򵥶���Ͳ����ˡ� 
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
