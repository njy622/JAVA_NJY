package Day18.InterfaceEx;

public class Audio implements RemoteControl {

	private int volume;
	private boolean mute; 

	@Override
	public void turnOn() {
		System.out.println("오디오 전원을 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("오디오 전원을 끕니다");

	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME)
			this.volume = RemoteControl.MAX_VOLUME;
		else if(volume<RemoteControl.MIN_VOLUME)
			this.volume = RemoteControl.MIN_VOLUME;
		else
			this.volume = volume;
		
	}

	public void amp() {
		System.out.println("소리 증폭한다.");
	}

	@Override
	public void setMute(boolean mute) {
		this.mute = mute;
		if(mute)
			System.out.println("Audio를 무음 처리합니다");
		else
			System.out.println("Audio를 무음 처리 해제합니다.");
	}
	
}
