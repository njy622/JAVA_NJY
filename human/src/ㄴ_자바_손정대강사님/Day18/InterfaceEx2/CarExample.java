package ㄴ_자바_손정대강사님.Day18.InterfaceEx2;

public class CarExample {
	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		myCar.run();
		
	/*	myCar.frontLeftTire = new KumhoTire();
		myCar.frontRighttTire = new KumhoTire();
		*/
		
		myCar.tires[0] = new KumhoTire();
		myCar.tires[1] = new KumhoTire();
		
		myCar.run();
	
		
	
	}
}
