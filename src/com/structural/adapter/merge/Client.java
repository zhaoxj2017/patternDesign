package com.structural.adapter.merge;

/**
 *  
 * @author ���˾�_F
 * ������ģʽ
 * ͨ���������ķ�ʽ������MediaPlayer�ӿڣ�ʹ��ӵ��AdvanceMediaPlayer�ӿ��еĲ��Žӿڡ�
 * ע�룺�ڴ�������A֮ǰ�����Ѿ������Ķ���Bע�뵽A�С�����Ϊ���������εķ�ʽע�롣
 * Ӧ�ó������̳з�ʽ
 */
public class Client {
	public static void main(String[] args) {
		MediaPlayer media = new Adapter();
		String fileName = "�����¿�";
		media.Play("mp4", fileName);
		media.Play("mp3", fileName);
		media.Play("vlc", fileName);
	}
}
