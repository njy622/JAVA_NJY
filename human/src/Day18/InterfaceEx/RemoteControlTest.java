package Day18.InterfaceEx;

import java.rmi.Remote;

//import Day08.Ex02_Interface.Television;

public class RemoteControlTest {

	public static void main(String[] args) {
//		Television tv = new Television();  빔이나 오디오도 객체생성을 계속 해야하기때문에 부모의 클래스이름으로 객체를 생성한다(코드줄이기위해)
//											
//		tv.turnOn();
//		tv.turnOff();
//		tv.setMute(true);
//		tv.setVolume(2);
		
		/*RemoteControl rc = new Television();   // (업캐스팅) 부모의 이름으로 객체 생성 = 상속받은 자식 이름으로 불러옴
		System.out.println(rc);
//		rc.print > 자식에게 있는 메소드에 접근 안됨 접근하려면..? 다운캐스팅
		rc.turnOn();
		rc.setVolume(-100);
		
		
		Television tv = (Television)rc; //tv 다운캐스팅
		tv.print();						//tv 다운캐스팅 이후 자식의 메소드 불러와짐 
	
		
		rc = new SmartTelevision();
//rc.search(null); // search는 자식 클래스 SmartTelevision에 있음으로 접근하려면 다운캐스팅해야함
//		SmartTelevision stv = (SmartTelevision)rc;  //자식객체만 가필요없음
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(100);
		ISearchable is = new SmartTelevision();  // 서치기능은 Isearch..에 있기때문에 다운캐스팅 할 필요 XX~
		is.search("naver.com");
		
		
		
		rc = new Audio();// 오디오 업캐스팅
		System.out.println(rc);
		Audio au = (Audio)rc;			// 오디오 다운캐스팅
		au.amp();						// 오디오 다운캐스팅 이후 자식메소드 기능 불러와짐*/
		
		
		RemoteControl rc=null;
		rc = new Television();
		rc.setMute(true);
		
		rc = new Audio();
		rc.setMute(true);		// 오디오에서 오버라이딩 함(오디오에서 재정의함)
		
	
	
	}
}
//인터페이스는 인터페이스 내에서 자체적으로 인스턴스(객체)를 생성할 수 없다
// why? 구현되지 않은 메소드로 이루어져 있기 때문.
// 반드시 상속을 통해서 구현된다.

// 자식이 부모의 이름을 가지고, 객체를 생성할 수 있다.
