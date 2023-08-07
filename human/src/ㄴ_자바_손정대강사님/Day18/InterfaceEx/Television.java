package ㄴ_자바_손정대강사님.Day18.InterfaceEx;

// 인터페이스 상속받을때 : implements
public class Television implements RemoteControl{
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
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
	// 인터페이스에서 이미 완전히 구현된 메소드는 상속받은쪽에서는 구현을 해도 안해도 상관없음
	// 구현 안한 메소드들은 상속받으면 상속받는쪽에서 무조건 구현해야함(안하면 오류)
	// mute 오버라이딩 하고싶으면 alt + shift + s  > Override/implement Methods 에서 체크
	
	public void print() {
		System.out.println("Television 클래스입니다.");
	}
	

}
