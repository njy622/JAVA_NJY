package Day18.InterfaceEx3_매개변수다형성.Instanceof;

public class Bus implements Vehicle{

	@Override
	public void run() {
		System.out.println("버스가 달린다.");		
	}
	public void checkFare() {  // 메인에 객체를 다 만들고 checkfare에 접근하는 방법은?
		System.out.println("승차요금을 체크합니다.");
	}
}
