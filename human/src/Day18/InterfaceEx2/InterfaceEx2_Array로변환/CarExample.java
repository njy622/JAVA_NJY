package Day18.InterfaceEx2.InterfaceEx2_Array로변환;

public class CarExample {
	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		myCar.run();
		
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRighttTire = new KumhoTire();
		
		myCar.run();
	}
}
