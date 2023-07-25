package Day15.다형성_65_렌터카예약;

public class RentTest {
	public static void main(String[] args) {
		String carInfo;
		String resData;
		
		
		//회원 가입하기
		Member member = new Member();
		member.regMember();
		
		//렌트카를 조회한다.
		Car car = new Car();
		carInfo=car.checkCarInfo();
		car.displayData(carInfo);//부모 클래스의 메소드를 사용하여 조회한  차량 정보를 보여준다.
		
		//예약을 한다.
		Reserve reserve = new Reserve();
		resData = reserve.reserveCar();
		reserve.displayData(resData);//부모클래스의 메소드를 사용하여 예약 정보를 보여준다.
		
	}

}
