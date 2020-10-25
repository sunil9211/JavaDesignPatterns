package design_patterns;

import java.util.Scanner;

public class PlayMyFiles {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		String strInput = scanner.next();
		
		MyAudioPlayer myAudioPlayer = new MyAudioPlayer();
		myAudioPlayer.playMp3();
		myAudioPlayer.playAac();
		myAudioPlayer.playM4a();
		
		MyVideoPlayer myVideoPlayer = new MyVideoPlayer();
		myVideoPlayer.playMp4();
		myVideoPlayer.playMkv();
		myVideoPlayer.playFlv();
		myVideoPlayer.playAvi();
		
		System.out.println("Adapter ....");
		
		MyAdapter myAdapter = new MyAdapter(myVideoPlayer);
		myAdapter.playMp3(); // mp3 == mp4
		
	}

}
