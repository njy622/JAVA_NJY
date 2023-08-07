package ㄴ_자바_손정대강사님.Day18.InterfaceEx3_매개변수다형성.Instanceof;

public class Driver {
	public void driver(Vehicle vehicle) {  // Vehicle로부터 상속을 받았다
		// main에 생성한 bus 객체를 해당 메소드에 접근
		// checkfare에 접근하고 싶어 ! 어떻게 ?
		
		if (vehicle instanceof Bus) {
			Bus bus = (Bus)vehicle;
			
			bus.checkFare();
		}
		vehicle.run();
		
	}
}
