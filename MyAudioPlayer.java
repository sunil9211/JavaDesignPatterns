package design_patterns;

public class MyAudioPlayer implements AudioFormats {

	@Override
	public void playMp3() {
		System.out.println("Playing Mp3");
		
	}

	@Override
	public void playAac() {
		System.out.println("Playing Aac");
		
	}

	@Override
	public void playM4a() {
		System.out.println("Playing M4a");
		
	}

}
