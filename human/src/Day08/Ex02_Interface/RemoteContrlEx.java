package Day08.Ex02_Interface;

public class RemoteContrlEx {
	
	public static void main(String[] args) {
		// 인터페이스타입 객체명 = new 구현클래스();
		RemoteControl tvRc = new Television();
		tvRc.turnOn();
		tvRc.setVolume(5);
		tvRc.setVolume(100);
		tvRc.setMute(true);			// 음소거
		tvRc.turnOff();
		System.out.println();
		
		
		RemoteControl speakerRc = new Speaker();
		speakerRc.turnOn();
		speakerRc.setVolume(5);
		speakerRc.setVolume(-100);
		speakerRc.setMute(false);		// 음소거 해제
		speakerRc.turnOff();
		System.out.println();
		
		RemoteControl.changeBattety(); 	// 리모콘 배터리 교체
	}

}
