package ㄴ_자바_손정대강사님.Day18.InterfaceEx3_매개변수다형성;

public class DriverExample {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
		
	}
}
