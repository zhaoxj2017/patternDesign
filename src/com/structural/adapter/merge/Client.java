package com.structural.adapter.merge;

/**
 *  
 * @author 赵兴君_F
 * 适配器模式
 * 通过适配器的方式，增加MediaPlayer接口，使其拥有AdvanceMediaPlayer接口中的播放接口。
 * 注入：在创建对象A之前，将已经创建的对象B注入到A中。此例为构造器传参的方式注入。
 * 应用场景见继承方式
 */
public class Client {
	public static void main(String[] args) {
		MediaPlayer media = new Adapter();
		String fileName = "等你下课";
		media.Play("mp4", fileName);
		media.Play("mp3", fileName);
		media.Play("vlc", fileName);
	}
}
