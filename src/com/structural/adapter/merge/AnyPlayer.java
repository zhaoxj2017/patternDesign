package com.structural.adapter.merge;

public class AnyPlayer implements MediaPlayer {

	@Override
	public void Play(String audioType, String fileName) {
		// TODO Auto-generated method stub
		System.out.println("Play " + audioType + " file: " + fileName);
	}

}
