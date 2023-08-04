package Day22.collectionTest_싱글톤포함;

import java.util.ArrayList;

public class EmployeeTest {

	public static void main(String[] args) {
		Manager m1 = new Manager("자바", new MyDate(1990,12,01), 3000000, "관리부", 10);
		Manager m2 = new Manager("자바2", new MyDate(1990,12,01), 3000000, "관리부", 10);
//		EmployeeService service = new EmployeeService();  // 에러난이유 ? 싱글톤으로 선언하면서 private로 선언되었기때문
		//싱글톤 객체를 호출 (자주 객체를 생성해야하면 싱글톤 한번 만들어서 사용하면 편함)
		EmployeeService service= EmployeeService.getInstance();
		service.AddEmployee(m1);
		service.AddEmployee(m1);
		service.AddEmployee(m2);
		//전부출력
		service.getAllEmployee();
		
		//사원삭제
		service.deleteEmployee("하이");
		//사원조회
		ArrayList<Employee> list=service.findEmployee("자바2");
		System.out.println(list);
	}
}
