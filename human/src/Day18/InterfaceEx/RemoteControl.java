package Day18.InterfaceEx;

public interface RemoteControl {

	//상수 선언 / 모든 리모트콘트롤의 상수를 정의할때, 이렇게..
	int MAX_VOLUME=10;
	int MIN_VOLUME=0;
	
	//추상메소드 : 구현되지 않는 메소드 ({}가 없다)
	// 인터페이스, 추상클래스(완전클래스 +구현되지 않은 메소드가 붙은것)에만 사용(?)
	public void turnOn();
	void turnOff();
	void setVolume(int volume);
//	default void setMute(boolean mute); 
	//(인터페이스는 상속을 하면 무조건 구현해야 한다(오버라이딩 무조건 해야함)
	//무음처리 필요가 없는데도 무조건 구현해야함)
	
	//디폴트 메소드 선언 (이렇게 쓰면, 상속을 하더라도 오버라이딩을 안해도 된다)
	default void setMute(boolean mute) {
		if (mute)
			System.out.println("무음 처리합니다.");
		else
			System.out.println("무음 처리해제합니다.");
	}
	//정적 메소드 
	static void changeBattery() {
		System.out.println("건전지를 교체합니다.");
	}
}
