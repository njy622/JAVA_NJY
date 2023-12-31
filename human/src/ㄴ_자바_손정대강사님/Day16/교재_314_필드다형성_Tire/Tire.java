package ㄴ_자바_손정대강사님.Day16.교재_314_필드다형성_Tire;

public class Tire {

	//필드
	public int maxRotation;				// 최대 회전수(타이어수명)
	public int accumulateRotation;		// 누적 회전수
	public String location;				// 타이어 위치
	
	
	//생성자
	public Tire(String location,int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//메소드
	public boolean roll() {
		++accumulateRotation;
		if(accumulateRotation<maxRotation) {
			System.out.println(location+"Tire 수명: "+ (maxRotation-accumulateRotation) + "회");;
			return true;
		}else {
			System.out.println("*** "+location+"Tire 펑크 ***");
			return false;
		}
		
	}
}
