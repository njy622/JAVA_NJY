package ㄴ_자바_손정대강사님.Day18.InterfaceEx3_매개변수다형성.Instanceof;

public class DriverTest {
	public static void main(String[] args) {
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		// 다운캐스팅을 시킬거야!
		driver.driver(bus);
		driver.driver(taxi);
		
		
		
	}	
	
}
