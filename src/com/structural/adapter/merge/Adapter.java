package com.structural.adapter.merge;

/**
 * 
 * @author ���˾�_F
 * ���������ֻ�ǻ��ӿڣ�ֻ��ʵ����ӿھ��С�
 * ���������Ҫ�ϲ������ӿڣ�����Ҫ�̳���ӿڵ�ʵ����
 */
public class Adapter extends AnyPlayer {
	
	@Override
	public void Play(String audioType, String fileName) {
		// TODO Auto-generated method stub
		if (audioType.equalsIgnoreCase("mp4")) {
			AdvanceMediaPlayer aPlayer = new Mp4Player();
			aPlayer.play(fileName);
		} else if (audioType.equalsIgnoreCase("vlc")) {
			AdvanceMediaPlayer aPlayer = new VlcPlayer();
			aPlayer.play(fileName);
		} else {
			super.Play(audioType, fileName);
		}
	}
}
