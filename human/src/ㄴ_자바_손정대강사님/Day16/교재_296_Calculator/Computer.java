package ㄴ_자바_손정대강사님.Day16.교재_296_Calculator;

public class Computer extends Calculator{

	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI*r*r;
	}
	

}
