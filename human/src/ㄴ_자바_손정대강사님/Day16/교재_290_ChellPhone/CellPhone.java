package ㄴ_자바_손정대강사님.Day16.교재_290_ChellPhone;

public class CellPhone {
	
	//필드
	String model;
	String color;
	
//	생성자 메소드 (자식메소드에서 super(model,color); 한줄로 표현하고 싶을때	
//	public CellPhone(String model, String color) {
//		this.model = model;
//		this.color = color;
//	}
	//메소드
	void powerOn() {System.out.println("전원을 켭니다.");}
	void powerOff() {System.out.println("전원을 Rmqslek.");}
	void bell() {System.out.println("벨이 울립니다.");}
	void sendVoice(String message) {System.out.println("자기: "+message);}
	void receiveVoice(String message) {System.out.println("상대방: "+message);}
	void hangUp() {System.out.println("전화를 끊습니다.");}
	

}
