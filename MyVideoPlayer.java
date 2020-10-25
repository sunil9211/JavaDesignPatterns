package design_patterns;

public class MyVideoPlayer implements VideoPlayerFormats {

	@Override
	public void playMp4() {
		System.out.println("Playing Mp4");
	}

	@Override
	public void playMkv() {
		System.out.println("Playing Mkv");
	}

	@Override
	public void playAvi() {
		System.out.println("Playing Avi");
	}

	@Override
	public void playFlv() {
		System.out.println("Playing Flv");
	}

}
