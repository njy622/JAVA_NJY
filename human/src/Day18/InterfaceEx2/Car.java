package Day18.InterfaceEx2;

public class Car {

	// 속성(타이어) 4개 선언(객체 4개)
	// 부모이름 가지고 자식의 객체를 만들 수 있다.
	// 데이터 타입 전부 Tire로 동일
	/*Tire frontLeftTire = new HankookTire();	    // 배열 첫번째
	Tire frontRighttTire = new HankookTire();	// 배열 두번째
	Tire backLeftTire = new HankookTire();		// 배열 세번째
	Tire backRightTire = new HankookTire();		// 배열 네번째
	*/
	
	
	Tire[] tires = {
			new HankookTire(),
			new HankookTire(),
			new HankookTire(),
			new HankookTire(),
	};
	
	void run() {
	/*	frontLeftTire.roll();  //roll은 공통 메소드  //배열로 표시하면 for문으로 쓸수있음
		frontRighttTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	*/
		
		for (Tire tire : tires) {
			tire.roll();
			
		}
	}
}
