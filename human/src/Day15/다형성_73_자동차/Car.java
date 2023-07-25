package Day15.다형성_73_자동차;

public class Car {
	protected String carName;
	protected int velocity;
	protected int carSize;
	
	public void speedUp(int velocity) {
		if(velocity>0)
		velocity +=0;
	}
	public void speedDown(int velocity) {
		if(velocity>0)
			velocity-=0;
	}
	public void stop(int velocity) {
		if(velocity<0)
			velocity=0;
	}
	public void getCarInfo(int velocity) {
		System.out.println(carName+"의 속도는"+velocity);
	
	}
}
