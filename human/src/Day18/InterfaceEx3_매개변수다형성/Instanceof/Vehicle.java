package Day18.InterfaceEx3_매개변수다형성.Instanceof;

public interface Vehicle {

	public void run();
}


// Taxi는 차량이다
// Bus는 차량이다
// => 상속관계

// 차량이다 => interface Vehicle{
// 공통동작(차량이다가 가지고 있으면됨) : 달린다 public void run(); (상속받은쪽에서 구현해라)
//}