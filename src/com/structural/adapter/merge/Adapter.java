package com.structural.adapter.merge;

/**
 * 
 * @author 赵兴君_F
 * 适配器如果只是换接口，只有实现其接口就行。
 * 适配器如果要合并两个接口，则需要继承其接口的实现类
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
