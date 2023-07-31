package Day18.InterfaceEx;

public class SmartTelevision implements RemoteControl,ISearchable { //다중 인터페이스 구현

	private int volume;

	@Override
	public void search(String url) {
		System.out.println(url+"검색합니다.");
	}

	@Override
	public void turnOn() {
		System.out.println("스마트TV 전원을 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("스마트TV 전원을 끕니다");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME)
			this.volume = RemoteControl.MAX_VOLUME;
		else if(volume<RemoteControl.MIN_VOLUME)
			this.volume = RemoteControl.MIN_VOLUME;
		else
			this.volume = volume;
		
		System.out.println("현재 TV의 볼륨 : "+ this.volume);
				
	}

}
