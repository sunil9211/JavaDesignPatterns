package design_patterns;

public class MyAdapter implements AudioFormats {

	VideoPlayerFormats videoFormats;
	
	public MyAdapter(VideoPlayerFormats videoPlayerFormats)
	{
		this.videoFormats = videoPlayerFormats;
	}
	
	@Override
	public void playMp3() {  // mp3 == mp4
		
		videoFormats.playMp4();
		
	}

	@Override
	public void playAac() {  // aac == mkv
		
		videoFormats.playMkv();
		
	}

	@Override
	public void playM4a() { // M4a == flv
		
		videoFormats.playFlv();
	}



}
