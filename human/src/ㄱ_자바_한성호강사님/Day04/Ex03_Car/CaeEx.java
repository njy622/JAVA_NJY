package ㄱ_자바_한성호강사님.Day04.Ex03_Car;

public class CaeEx {

	public static void main(String[] args) {
		// 객체 생성
		Car car = new Car();
		car.model = "K5";
		// car.speed = "200";		//오류 :the field Car.speed is not visible
		// private 으로 지정한 변수는 외부에서 접근 불가능
		car.setSpeed(200);
		System.out.println("model : " + car.getModel());
		System.out.println("speed : " + car.getSpeed());
		
		car.setSpeed(-100);
		System.out.println("speed : " + car.getSpeed());
		
		car.setSpeed(500);
		System.out.println("speed : " + car.getSpeed());
		
		car.setSpeed(80);
		System.out.println("speed : " + car.getSpeed());
		
	}
}
