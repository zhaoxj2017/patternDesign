package com.structural.adapter.merge;

public class AnyPlayer implements MediaPlayer {

	@Override
	public void play(String audioType, String fileName) {
		// TODO Auto-generated method stub
		System.out.println("play " + audioType + " file: " + fileName);
	}

}
