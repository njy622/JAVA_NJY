package ㄴ_자바_손정대강사님.Day18.InterfaceEx3_매개변수다형성.강제타입변환;

public class VehicleExample {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		// vehicle.checkFare(); (X)  Vehicle 인터페이스에는 checkFare()가 없음
		
		Bus bus = (Bus) vehicle;  //강제타입 변환
		
		bus.run();
		bus.checkFare();		// Bus 클래스에는 checkFare( )가 있음
			
			
		
	}
}
