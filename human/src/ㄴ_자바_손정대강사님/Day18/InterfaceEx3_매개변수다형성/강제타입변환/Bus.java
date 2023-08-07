package ㄴ_자바_손정대강사님.Day18.InterfaceEx3_매개변수다형성.강제타입변환;

public class Bus implements Vehicle {

	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	
	public void checkFare() {
		System.out.println("승차요금을 체크합니다.");
	}

	
}
